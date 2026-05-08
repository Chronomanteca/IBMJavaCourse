package chrono.ibmcourse.OOPs.Module4.UseDirectoryExplorer.CLIView;

import chrono.ibmcourse.OOPs.Module4.ReadATextFile.integration.IFacadeContact;
import chrono.ibmcourse.OOPs.Module4.UseDirectoryExplorer.CLIIntegration.DirectoryExplorerFacade;
import chrono.ibmcourse.OOPs.Module4.UseDirectoryExplorer.CLIServices.*;
import chrono.ibmcourse.OOPs.Module4.UseDirectoryExplorer.CLIView.utils.CLIInputParser;

public class CLIMenu {
    private static CLIMenu instance;
    private DirectoryExplorerFacade facade;
    private CLIInputParser inputParser;
    private CLIMenu(){
        facade = DirectoryExplorerFacade.getInstance(new ListFilesService(), new ChangeDirectoryService(), new MakeService(), new DeleteService(), new RenameService(), new SearchService(), new ShowDetailedInfoService());
        inputParser = new CLIInputParser();
    }

    public static CLIMenu getInstance(){
        if(instance == null){
            instance = new CLIMenu();
        }
        return instance;
    }

    public void menu(){
        while(true){
            //TODO Implement menu
        }
    }



}
