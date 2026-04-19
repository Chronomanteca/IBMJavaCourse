package chrono.ibmcourse.LabSolutions.Module1;

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
        System.out.println();

        CreateCustomFunctions.areaCalculator();






    }
}
