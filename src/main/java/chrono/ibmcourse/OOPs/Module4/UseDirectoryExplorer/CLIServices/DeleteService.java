package chrono.ibmcourse.OOPs.Module4.UseDirectoryExplorer.CLIServices;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DeleteService {

    public boolean delete(Path target){
        boolean deleted = false;
        try{
            if(Files.deleteIfExists(target)) {
                System.out.println("File deleted");
                deleted = true;
            }
            return deleted;

        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
            return deleted;
        }
    }

}
