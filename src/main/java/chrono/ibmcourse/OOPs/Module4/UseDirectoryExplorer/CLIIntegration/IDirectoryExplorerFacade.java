package chrono.ibmcourse.OOPs.Module4.UseDirectoryExplorer.CLIIntegration;

import java.nio.file.Path;

public interface IDirectoryExplorerFacade {


    //Display working directory
    public void printWorkingDirectory();

    // List files and directories
    public void listFilesAndDirectories(String listMethod);

    // Navigate subdirectories including parent directory
    public void changeDirectory(Path targetDirectory);

    // Create new files and directories
    public void makeFileOrDirectory(Path target, String arg);

    // Delete files and directories
    public void deleteFilesAndDirectories(Path target);

    // Rename files and directories
    public void renameFilesAndDirectories(Path target, String newName);

    // Search files
    public void searchFiles(Path startingPath,String pattern);

    // Show detailed file information (size, last modified, general metadata ....)
    public void showDetailedInfo(Path target);


}
