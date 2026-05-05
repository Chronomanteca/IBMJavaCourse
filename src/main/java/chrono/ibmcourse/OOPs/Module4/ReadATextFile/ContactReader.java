// ContactReader.java
// This program reads contact information from a file and displays it in a formatted way

package chrono.ibmcourse.OOPs.Module4.ReadATextFile;

// Step 1: Import necessary packages for file I/O operations
// Hint: You'll need classes from java.io or java.nio.file packages
// You'll also need Scanner for user input

import chrono.ibmcourse.OOPs.Module4.ReadATextFile.model.Contact;
import chrono.ibmcourse.OOPs.Module4.ReadATextFile.view.ContactView;

public class ContactReader {
    public static void main(String[] args) {

        ContactView view = ContactView.getInstance();

        view.menu();

    }
}
