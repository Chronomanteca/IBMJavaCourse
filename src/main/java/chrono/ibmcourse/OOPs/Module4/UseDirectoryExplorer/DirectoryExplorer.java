package chrono.ibmcourse.OOPs.Module4.UseDirectoryExplorer;

import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryExplorer implements DirectoryExplorerInterface{

    private final Path workingDirectory;
    private static DirectoryExplorer instance;

    private DirectoryExplorer(){
        this.workingDirectory = Paths.get(System.getProperty("user.dir"));
    }
    private DirectoryExplorer(Path workingDirectory) {
        this.workingDirectory = workingDirectory;
    }

    public static DirectoryExplorer getInstance(){
        if(instance == null){
            instance = new DirectoryExplorer();
        }
        return instance;
    }

    @Override
    public void printWorkingDirectory() {
        System.out.println("> "+workingDirectory);

    }

    @Override
    public void listFilesAndDirectories() {

    }

    @Override
    public void changeDirectory() {

    }

    @Override
    public void makeFileOrDirectory() {

    }

    @Override
    public void deleteFilesAndDirectories() {

    }

    @Override
    public void renameFilesAndDirectories() {

    }

    @Override
    public void searchFiles() {

    }

    @Override
    public void showDetailedInfo() {

    }
}
