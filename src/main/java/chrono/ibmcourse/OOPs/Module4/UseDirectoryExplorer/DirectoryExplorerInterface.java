package chrono.ibmcourse.OOPs.Module4.UseDirectoryExplorer;

public interface DirectoryExplorerInterface {

    //Display working directory
    public void printWorkingDirectory();

    // List files and directories
    public void listFilesAndDirectories();

    // Navigate subdirectories including parent directory
    public void changeDirectory();

    // Create new files and directories
    public void makeFileOrDirectory();

    // Delete files and directories
    public void deleteFilesAndDirectories();

    // Rename files and directories
    public void renameFilesAndDirectories();

    // Search files
    public void searchFiles();

    // Show detailed file information (size, last modified, general metadata ....)
    public void showDetailedInfo();


}
