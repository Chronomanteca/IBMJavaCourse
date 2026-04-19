package chrono.ibmcourse.LabSolutions.Module1;

import chrono.ibmcourse.LabSolutions.Module1.utils.CreateCustomFunctions.GeometryAreaCalculator;

public class CreateCustomFunctions {

    public static String[] arrayMenuOptions = {"circle","square","rectangle","sphere","cube","cuboid"};


    public static void  areaCalculator(){
        GeometryAreaCalculator calculator = GeometryAreaCalculator.getInstance(arrayMenuOptions);
        System.out.println("Welcome to the calculator menu");
        calculator.calculatorMenu();


    }


}
