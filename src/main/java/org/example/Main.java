package org.example;
import org.example.Module2.DataTypes;
import org.example.Module2.UsingOperators;
import org.example.Module2.ArrayManipulation;
import org.example.Module2.WorkingWithStrings;

import javax.xml.crypto.Data;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {

        for(String s : args){
            System.out.println(s);
        }

        DataTypes dataTypes = new DataTypes('a');
        dataTypes.printChar(false);
        dataTypes.printChar(true);
        System.out.println();

        UsingOperators usingOperators = new UsingOperators();
        usingOperators.operateAray();
        usingOperators.checkArrayElements();
        System.out.println();

        ArrayManipulation arrayManipulation = new ArrayManipulation();
        arrayManipulation.printArrayWithFor();
        arrayManipulation.printArrayWithoutFor();
        arrayManipulation.convertStringToCharArray();
        System.out.println();

        WorkingWithStrings.labSolution();






    }
}
