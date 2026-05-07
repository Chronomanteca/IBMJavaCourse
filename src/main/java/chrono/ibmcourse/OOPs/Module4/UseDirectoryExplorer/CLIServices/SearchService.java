package chrono.ibmcourse.OOPs.Module4.UseDirectoryExplorer.CLIServices;

import chrono.ibmcourse.OOPs.Module4.UseDirectoryExplorer.CLIServices.exceptions.FileNameInvalidException;
import chrono.ibmcourse.OOPs.Module4.UseDirectoryExplorer.CLIServices.utils.FileNameValidator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class SearchService extends FileNameValidator {

    public void search(Path startingPath, String pattern){

        try{
            if (checkNameIsValid(pattern)) {
                throw new FileNameInvalidException("Entered name is not valid");
            }
        } catch (FileNameInvalidException e) {
            System.out.println(e.getMessage());
        }


        try(Stream<Path> stream = Files.find(startingPath,Integer.MAX_VALUE,
                (path, attr) -> path.toString().contains(pattern))){
            stream.forEach(p -> {
                System.out.println(p.getFileName());
            });

        } catch(IOException e){
            System.out.println(e.getMessage());
        }

    }

}
