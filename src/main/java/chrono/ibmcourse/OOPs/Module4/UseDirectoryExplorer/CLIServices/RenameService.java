package chrono.ibmcourse.OOPs.Module4.UseDirectoryExplorer.CLIServices;

import chrono.ibmcourse.OOPs.Module4.UseDirectoryExplorer.CLIServices.exceptions.FileNameInvalidException;
import chrono.ibmcourse.OOPs.Module4.UseDirectoryExplorer.CLIServices.utils.FileNameValidator;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RenameService extends FileNameValidator {

    public boolean rename(Path targetFile, String newFileName){
        boolean moved = false;
        try{
            if(checkNameIsValid(newFileName)) {
                throw new FileNameInvalidException("Entered file name is not valid");
            }

            String newFilePathName = (targetFile.getParent()).getFileName() + "/" + newFileName;
            Path newFilePath = Paths.get(newFilePathName);
            Files.move(targetFile, newFilePath);
            return moved;

        } catch(IOException e){
            System.out.println(e.getMessage());
            return moved;

        } catch (FileNameInvalidException e){
            System.out.println("Error: "+e.getMessage());
            return moved;
        }




    }



}
