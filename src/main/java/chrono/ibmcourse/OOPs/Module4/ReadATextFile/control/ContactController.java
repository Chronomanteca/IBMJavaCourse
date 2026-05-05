package chrono.ibmcourse.OOPs.Module4.ReadATextFile.control;

import chrono.ibmcourse.OOPs.Module4.ReadATextFile.model.Contact;
import chrono.ibmcourse.OOPs.Module4.ReadATextFile.model.InformationBlankException;
import chrono.ibmcourse.OOPs.Module4.ReadATextFile.model.InformationEmptyException;
import chrono.ibmcourse.OOPs.Module4.ReadATextFile.model.InformationNullException;

import java.util.ArrayList;

public class ContactController {

    private ArrayList<Contact> contacts;
    private static ContactController instance;

    private ContactController() {
        contacts = new ArrayList<>();
    }

    public static ContactController getInstance(){
        if(instance == null){
            instance = new ContactController();
        }
        return instance;
    }

    public boolean addContact(String name, String phoneNumber){
        try{
            contacts.add(new Contact(name,phoneNumber));
            return true;
        } catch (InformationEmptyException e) {
            System.out.println("Error: "+e.getMessage());
            return false;
        } catch (InformationBlankException e) {
            System.out.println("Error: "+e.getMessage());
            return false;
        } catch (InformationNullException e) {
            System.out.println("Error: "+e.getMessage());
            return false;
        }
    }

    public void printContacts(){
        System.out.println("The file has "+contacts.size() + " contacts ");
        contacts.forEach(c ->{
            System.out.println(c.toString());
        });
    }



}
