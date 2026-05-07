package chrono.ibmcourse.OOPs.Module4.UseDirectoryExplorer.CLIServices;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class ShowDetailedInfoService {

    public void showInfo(Path targetFile){

        try{
            BasicFileAttributes attributes = Files.readAttributes(targetFile, BasicFileAttributes.class);
            System.out.println("Printing detailed info:");
            System.out.println("File path: "+targetFile.getFileName());
            System.out.println("File type: "+(attributes.isDirectory() ?  "Directory" : "File"));
            System.out.println("Created on: "+attributes.creationTime());
            System.out.println("Last modified on: "+attributes.lastAccessTime());
            System.out.println("Size: "+attributes.size());


        } catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }


    }

}
