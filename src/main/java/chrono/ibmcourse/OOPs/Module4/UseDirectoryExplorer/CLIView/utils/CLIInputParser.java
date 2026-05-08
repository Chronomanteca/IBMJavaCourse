package chrono.ibmcourse.OOPs.Module4.UseDirectoryExplorer.CLIView.utils;

import java.util.ArrayList;
import java.util.Arrays;

public class CLIInputParser {

    //user enters command, parser returns array properly formatted

    ArrayList<String> parsedInput;

    public CLIInputParser(){
        parsedInput = new ArrayList<>();
    }

    void parseInput(String input){
        this.parsedInput = (ArrayList<String>)Arrays.asList(input.split(" "));
    }

    int getParsedSize(){
        return this.parsedInput.size();
    }



}
