package chrono.ibmcourse.LabSolutions.Module4.Lab1ReadATextFile;

import chrono.ibmcourse.LabSolutions.Module4.Lab2UseDirectoryExplorer.DirectoryController;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    final static String FILE_PATH=  "./res/Module4/file.txt";
    final static String PATH_PREFIX = "./res/Module4/";
    public static void readFileWithScanner(){
        try {
            Scanner fileScanner = new Scanner(new FileReader(FILE_PATH));
            while (fileScanner.hasNext()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }
            fileScanner.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File not found, "+e.getMessage());
        }
    }

    public static void readFileWithFileClass(){
        try{
            Path filePath = Paths.get(FILE_PATH);
            String content = Files.readString(filePath);
            System.out.println(content);

        } catch (IOException e) {
            throw new RuntimeException("Error reading file"+e.getMessage());
        }
    }

    public static void readFileInALoop(){

        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter file name to read, enter exit to quit program");
            String userInput = scanner.nextLine();
            if("exit".equalsIgnoreCase(userInput)){
                System.out.println("Goodbye");
                return;
            }
            try{
                Path filePath = Paths.get(PATH_PREFIX.concat(userInput));
                String content = Files.readString(filePath);
                System.out.println(content);

            } catch (Exception e) {
                System.out.println("Error reading file "+e.getMessage());;
            }
        }



    }


    public static void main(String[] args){
        File testFile = new File("hello.txt");
        System.out.println(testFile.getAbsolutePath());

        DirectoryController.isDirectory(PATH_PREFIX+"file.txt");
        System.out.println(DirectoryController.isDirectory("/home/chronomanteca/Coding/Java/IBMJavaCourse/res/Module4/"+"file.txt"));
        DirectoryController.isDirectory("/home/chronomanteca/Coding/Java/IBMJavaCourse/res/Module4/"+"Directory");




    }
}
