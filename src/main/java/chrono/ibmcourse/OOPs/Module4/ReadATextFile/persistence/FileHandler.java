package chrono.ibmcourse.OOPs.Module4.ReadATextFile.persistence;

import chrono.ibmcourse.OOPs.Module4.ReadATextFile.control.StringFormatter;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class FileHandler {

    private static FileHandler instance;
    private ArrayList<String> lines;

    private FileHandler(){
        lines = new ArrayList<>();
    }

    public static FileHandler getInstance(){
        if(instance == null){
            instance = new FileHandler();
        }
        return instance;
    }

    //Read file, return string list, that is all

    public void readFile(String path){
        //create Path object
        Path filePath = Paths.get(path);

        try{
            if(Files.isDirectory(filePath)){
                throw new IOException("provided path is a directory");
            }
            Files.lines(filePath).forEach(s -> {
                lines.add(s);
            });
        } catch (IOException e) {
            System.out.println("Error with reading file "+e.getMessage());
        }
    }

    public ArrayList<String> getLines(){
        return this.lines;
    }
}
