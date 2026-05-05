package chrono.ibmcourse.OOPs.Module4.ReadATextFile.control;

import chrono.ibmcourse.OOPs.Module4.ReadATextFile.model.Contact;

import java.util.ArrayList;
import java.util.Arrays;

public class StringFormatter {
    private ArrayList<ArrayList<String>> stringList;
    private final int TOKEN_COUNT = 2;
    private static StringFormatter instance;

    private StringFormatter() {
        stringList = new ArrayList<>();
    }

    public static StringFormatter getInstance(){
        if(instance == null){
            instance = new StringFormatter();
        }
        return instance;
    }

    public void parseString(ArrayList<String> target, String parser){
        for(String s : target){
            ArrayList<String> parsedString = new ArrayList<>(Arrays.asList(s.split(parser)));
            if(parsedString.size() != TOKEN_COUNT){
                System.out.println("Error parsing string, tokens exceed maximum of "+TOKEN_COUNT+" got "+parsedString.size());
            }
            else{
                stringList.add(parsedString);
            }
        }
    }

    public ArrayList<ArrayList<String>> getStringList() {
        return this.stringList;
    }
}
