package chrono.ibmcourse.OOPs.Module4.UseDirectoryExplorer.CLIServices.utils;

public abstract class FileNameValidator  {
    public boolean checkNameIsValid(String newName){
        return !newName.contains(" ") && !newName.contains(".");
    }



}
