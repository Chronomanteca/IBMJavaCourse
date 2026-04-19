package org.example.LabSolutions.Module1;

public class ArrayManipulation {

    private int[] numberArray = {1,2,3,4,5,6,7,8,9,10};
    private String phrase = "This phrase will be converted to a char array";

    public void printArrayWithFor(){

        for(int n : numberArray){
            System.out.println(n);
        }

    }

    public void printArrayWithoutFor(){
        System.out.println(numberArray[0]);
        System.out.println(numberArray[1]);
        System.out.println(numberArray[2]);
        System.out.println(numberArray[3]);
        System.out.println(numberArray[4]);
        System.out.println(numberArray[5]);
        System.out.println(numberArray[6]);
        System.out.println(numberArray[7]);
        System.out.println(numberArray[8]);
        System.out.println(numberArray[9]);
    }

    public void convertStringToCharArray(){
        char[] charArray =  this.phrase.toCharArray();

        for(char c : charArray){
            System.out.println(c);
        }
    }



}
