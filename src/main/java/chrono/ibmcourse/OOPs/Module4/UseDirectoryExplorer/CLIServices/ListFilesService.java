package chrono.ibmcourse.OOPs.Module4.UseDirectoryExplorer.CLIServices;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class ListFilesService {

    public void list(Path workingDirectory){
        // System.out.println("target "+targetDirectory);
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(workingDirectory)){
            for(Path file : stream){
                System.out.println(file.getFileName());
            }
        } catch (IOException e) {
            System.out.println("Error with reading directory "+e.getMessage());
        }
    }

    public void listRecursively(Path workingDirectory){
        // System.out.println("target "+targetDirectory);
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(workingDirectory)){
            for(Path file : stream){
                System.out.println(file.getFileName());
                if(Files.isDirectory(file)){
                    listRecursively(file);
                }
            }
        } catch (IOException e) {
            System.out.println("Error with reading directory "+e.getMessage());
        }
    }


}
