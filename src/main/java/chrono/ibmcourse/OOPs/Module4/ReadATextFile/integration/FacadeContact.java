package chrono.ibmcourse.OOPs.Module4.ReadATextFile.integration;

import chrono.ibmcourse.OOPs.Module4.ReadATextFile.control.ContactController;
import chrono.ibmcourse.OOPs.Module4.ReadATextFile.control.StringFormatter;
import chrono.ibmcourse.OOPs.Module4.ReadATextFile.persistence.FileHandler;

import java.util.ArrayList;

public class FacadeContact {

    private StringFormatter stringFormatterService;
    private ContactController contactController;
    private FileHandler fileReaderService;

    private static FacadeContact instance;

    private FacadeContact(){
        this.stringFormatterService = StringFormatter.getInstance();
        this.contactController = ContactController.getInstance();
        this.fileReaderService = FileHandler.getInstance();
    }

    public static FacadeContact getInstance(){
        if(instance == null){
            instance = new FacadeContact();
        }
        return instance;
    }

    public ArrayList<String> facadeReadFile(String path){
        fileReaderService.readFile(path);
        return fileReaderService.getLines();

    }

    public ArrayList<ArrayList<String>> facadeFormatFile(ArrayList<String> target, String pattern){
        stringFormatterService.parseString(target,pattern);
        return stringFormatterService.getStringList();
    }

    public void facadeAddContacts(ArrayList<ArrayList<String>> lines){

        lines.forEach(line -> {
            contactController.addContact(line.getFirst(),line.getLast());
        });

    }

    public void facadePrintFormattedContacts(){
        contactController.printContacts();
    }

}
