package chrono.ibmcourse.OOPs.Module4.UseDirectoryExplorer.CLIServices;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MakeService {

    public boolean create(Path workingDirectory, String arg){
        boolean created = false;
        try{
            switch (arg){
                case "d":
                    if(!Files.exists(Files.createDirectory(workingDirectory)))
                        throw new IOException("Directory could not be created");
                    created = true;
                    break;
                case "f":
                    if(!Files.exists(Files.createFile(workingDirectory)))
                        throw new IOException("File could not be created");
                    created = true;
                    break;
                default:
                    System.out.println(arg+" is not a valid option ");
            }
            return created;

        } catch (IOException e){
            System.out.println("Error reading file "+e.getMessage());
            return created;
        }
    }

}
