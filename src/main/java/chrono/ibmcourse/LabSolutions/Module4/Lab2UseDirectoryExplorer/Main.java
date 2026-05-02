package chrono.ibmcourse.LabSolutions.Module4.Lab2UseDirectoryExplorer;

import java.io.IOException;

public class Main {

    public static void main(String[] args){

        try {
            DirectoryController.DirectoryManager();
            //DirectoryController.recursiveDirectoryListing("./res");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
