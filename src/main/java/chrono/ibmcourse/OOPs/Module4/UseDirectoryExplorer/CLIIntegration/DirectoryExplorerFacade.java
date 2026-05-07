package chrono.ibmcourse.OOPs.Module4.UseDirectoryExplorer.CLIIntegration;

import chrono.ibmcourse.OOPs.Module4.UseDirectoryExplorer.CLIServices.*;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class DirectoryExplorerFacade implements IDirectoryExplorerFacade {

    private  Path workingDirectory;
    private static DirectoryExplorerFacade instance;
    private ChangeDirectoryService changeDirectoryService;
    private DeleteService deleteService;
    private ListFilesService listFilesService;
    private MakeService makeService;
    private RenameService renameService;
    private SearchService searchService;
    private ShowDetailedInfoService showDetailedInfoService;

    private DirectoryExplorerFacade(ListFilesService listFilesService, ChangeDirectoryService changeDirectoryService, MakeService makeService, DeleteService deleteService, RenameService renameService, SearchService searchService, ShowDetailedInfoService showDetailedInfoService)
    {
        this.changeDirectoryService = changeDirectoryService;
        this.deleteService = deleteService;
        this.listFilesService = listFilesService;
        this.makeService = makeService;
        this.renameService = renameService;
        this.searchService =  searchService;
        this.showDetailedInfoService = showDetailedInfoService;
        this.workingDirectory = Paths.get(System.getProperty("user.dir"));

    }
    private DirectoryExplorerFacade(Path workingDirectory, ListFilesService listFilesService, ChangeDirectoryService changeDirectoryService, MakeService makeService, DeleteService deleteService, RenameService renameService, SearchService searchService, ShowDetailedInfoService showDetailedInfoService){
        this.changeDirectoryService = changeDirectoryService;
        this.deleteService = deleteService;
        this.listFilesService = listFilesService;
        this.makeService = makeService;
        this.renameService = renameService;
        this.searchService =  searchService;
        this.showDetailedInfoService = showDetailedInfoService;
        this.workingDirectory = workingDirectory;
    }

    public static DirectoryExplorerFacade getInstance(ListFilesService listFilesService, ChangeDirectoryService changeDirectoryService, MakeService makeService, DeleteService deleteService, RenameService renameService, SearchService searchService, ShowDetailedInfoService showDetailedInfoService){
        if(instance == null){
            instance = new DirectoryExplorerFacade(listFilesService, changeDirectoryService, makeService, deleteService,  renameService,  searchService,  showDetailedInfoService);
        }
        return instance;
    }

    @Override
    public void printWorkingDirectory() {
        System.out.println("> "+workingDirectory);

    }

    @Override
    public void listFilesAndDirectories(String listMethod) {

        if(listMethod.isEmpty() || listMethod == null){
            this.listFilesService.list(workingDirectory);
        }
        else if("-r".equalsIgnoreCase(listMethod)){
            this.listFilesService.listRecursively(workingDirectory);
        }
        else {
            System.out.println("Invalid operator provided");
        }


    }

    @Override
    public void changeDirectory(Path targetDirectory) {
        workingDirectory = changeDirectoryService.getNewWorkingDirectory(targetDirectory);

    }

    @Override
    public void makeFileOrDirectory(Path target, String arg) {
        makeService.create(target, arg);

    }

    @Override
    public void deleteFilesAndDirectories(Path target) {
        deleteService.delete(target);
    }

    @Override
    public void renameFilesAndDirectories(Path target, String newName) {
        renameService.rename(target,newName);
    }

    @Override
    public void searchFiles(Path startingPath,String pattern) {
        searchService.search(startingPath,pattern);
    }

    @Override
    public void showDetailedInfo(Path target) {
        showDetailedInfoService.showInfo(target);
    }
}
