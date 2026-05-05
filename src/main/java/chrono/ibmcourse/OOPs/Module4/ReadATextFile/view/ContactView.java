package chrono.ibmcourse.OOPs.Module4.ReadATextFile.view;

import chrono.ibmcourse.OOPs.Module4.ReadATextFile.integration.FacadeContact;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ContactView {

    private static ContactView instance;
    private FacadeContact facade;

    private  ContactView(){
        facade = FacadeContact.getInstance();
    }

    public static ContactView getInstance(){
        if(instance == null){
            instance = new ContactView();
        }
        return instance;
    }

    public void menu(){
        Scanner scanner = new Scanner(System.in);
        while(true){

            System.out.println("Welcome, enter a file name with path and extension to print contacts");
            System.out.println("Type exit to quit program");
            String userInput = scanner.nextLine();
            if("exit".equalsIgnoreCase(userInput)){
                System.out.println("Goodbye!");
                return ;
            }

            ArrayList<String> lines = facade.facadeReadFile(userInput);
            ArrayList<ArrayList<String>> linesFormatted = facade.facadeFormatFile(lines,":");
            facade.facadeAddContacts(linesFormatted);
            System.out.println("Printing formatted contact list");
            facade.facadePrintFormattedContacts();
            System.out.println();




        }

    }


}
