package chrono.ibmcourse.OOPs.Module4.UseDirectoryExplorer.CLIServices;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ChangeDirectoryService {


    public boolean checkDirectoryIsValid(Path directoryPath){
        try{
            if(!Files.isDirectory(directoryPath)){
                throw new IOException("Path is not  directory");
            }
            if(!Files.exists(directoryPath)){
                throw new IOException("Directory does not exists");
            }
            return true;

        } catch (IOException e) {
            System.out.println("Error  ");
            return false;
        }
    }



    public Path getNewWorkingDirectory(Path directoryPath){
        if(checkDirectoryIsValid(directoryPath))
            return directoryPath;
        return null;
    }





}
