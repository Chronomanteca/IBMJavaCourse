package chrono.ibmcourse.LabSolutions.Module4.Lab2UseDirectoryExplorer;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class DirectoryController {

    final static String PATH_PREFIX = "./res/Module4/Directory/";

    public static int isDirectory(String path){
        //System.out.println("Enter file name or directory with path");
        try{
            Path filePath = Paths.get(path);
            if(!Files.exists(filePath)){
                throw new IOException();
            }
            if(Files.isDirectory(filePath)){

                return 1;
            }
            else {

                return 2;
            }

        }catch (IOException e){
            System.out.println("Error reading file "+e.getMessage());
            return 0;
        }
    }

    public static void directoryOperations(String filePath){
        try{
            Path directoryTarget = Paths.get(filePath);
            Scanner scanner = new Scanner(System.in);


            System.out.println("Press 1 to list all files in the directory \nPress 2 to rename the directory \nPress 3 to delete the directory \n press any other key to exit");
            String directoryOption = scanner.nextLine();

            if ("1".equalsIgnoreCase(directoryOption)) {
                try(DirectoryStream<Path> stream = Files.newDirectoryStream(directoryTarget)){
                    for(Path file : stream){
                        System.out.println(file.getFileName());
                    }
                }

            } else if ("2".equalsIgnoreCase(directoryOption)) {
                System.out.println("Enter new directory name");
                String newDirectoryName = scanner.nextLine();
                Path newDirectoryPath = Path.of(PATH_PREFIX+newDirectoryName);
                Files.move(directoryTarget, newDirectoryPath);
                System.out.println("Directory renamed!");
            } else if("3".equalsIgnoreCase(directoryOption)) {
                Files.delete(Path.of(filePath));
                System.out.println("Directory deleted");

            } else {
                System.out.println("Directory operation cancelled");
            }
        } catch (IOException e){
            System.out.println("Error with directory operation "+e.getMessage());
        }

    }

    public static void fileOperations(String filePath){
        try{
            Path fileTarget = Paths.get(filePath);
            Scanner scanner = new Scanner(System.in);


            System.out.println("Press 1 to rename the file \nPress 2 to delete the file \n press any other key to exit");
            String directoryOption = scanner.nextLine();

            if ("1".equalsIgnoreCase(directoryOption)) {
                System.out.println("Enter new File name");
                String newFileName = scanner.nextLine();
                Path newFileNamePath = Path.of(PATH_PREFIX+newFileName);
                Files.move(fileTarget, newFileNamePath);
                System.out.println("File renamed!");
            }

            else if("2".equalsIgnoreCase(directoryOption)) {
                Files.delete(Path.of(filePath));
                System.out.println("File deleted");

            } else {
                System.out.println("File operation cancelled");
            }
        } catch (IOException e){
            System.out.println("Error with File operation "+e.getMessage());
        }
    }

    public static void creationOperation(String filePath){
        try{
            Path creationTarget = Paths.get(filePath);
            Scanner scanner = new Scanner(System.in);

            System.out.println("No file or directory with that name exists");
            System.out.println("Press 1 to create a new file with the provided name \nPress 2 to create a new directory with the provided name \n press any other key to exit");
            String createOption = scanner.nextLine();

            if ("1".equalsIgnoreCase(createOption)) {
                Files.createFile(creationTarget);
                System.out.println("File created at path: "+filePath);

            } else if ("2".equalsIgnoreCase(createOption)) {
                Files.createDirectory(creationTarget);
                System.out.println("File created at path: "+filePath);
            } else {
                System.out.println("Creation cancelled");
            }
        } catch (IOException e){
            System.out.println("Error creating File or directory "+e.getMessage());
        }
    }



    public static void DirectoryManager() throws IOException {
        while(true){
            System.out.println("Enter directory name with path, or file name, enter exit to quit program, base path is: \n" + PATH_PREFIX);
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();
            if ("exit".equalsIgnoreCase(userInput)) {
                System.out.println("Goodbye!");
                return;
            }
            String filePath = PATH_PREFIX+userInput;

            switch (isDirectory(filePath)) {
                case 1:
                    System.out.println(filePath+" Is a directory");
                    //Call directoryOperations
                    directoryOperations(filePath);

                    break;
                case 2:
                    System.out.println(filePath+" Is a file");
                    //Call fileOperations
                    fileOperations(filePath);
                    break;
                case 0:
                    creationOperation(filePath);
                    break;
                default:
                    System.out.println("This should not happen");

            }
        }

    }





}

