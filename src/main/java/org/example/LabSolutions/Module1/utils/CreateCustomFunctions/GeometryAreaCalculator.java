package org.example.LabSolutions.Module1.utils.CreateCustomFunctions;

import org.example.LabSolutions.Module1.utils.CreateCustomFunctions.Strategies.*;

import java.util.Scanner;

public final class GeometryAreaCalculator {

    private static GeometryAreaCalculator instance;
    private final String[] arrayMenuOptions;
    private final CalculatorContext context;

    private GeometryAreaCalculator(String[] arrayMenuOptions){
        this.arrayMenuOptions = arrayMenuOptions;
        this.context = new CalculatorContext();
    }

    public static GeometryAreaCalculator getInstance(String[] arrayMenuOptions){
        if(instance == null){
            instance = new GeometryAreaCalculator(arrayMenuOptions);
        }
        return instance;
    }

    public void calculatorMenu(){
        boolean closeMenu = false;
        do {

            System.out.println("Select from the options below or enter 0 to close the menu");

            int i = 1;
            for(String option : arrayMenuOptions){
                System.out.println(i+" - "+option);
                i++;
            }
            Scanner scanner = new Scanner(System.in);
            int optionSelected = Integer.parseInt(scanner.nextLine());
            double[] dimensionsArray;
            switch (optionSelected){
                case 0:
                    closeMenu = true;
                    scanner.close();
                    System.out.println("Goodbye");
                    break;
                case 1:
                    context.setStrategy(new CalculateCircleArea());
                    dimensionsArray = new double[1];
                    System.out.println("Enter the radius of the circle");
                    dimensionsArray[0] = Double.parseDouble(scanner.nextLine());
                    System.out.println("The area of the circle is "+context.Calculate(dimensionsArray[0]));
                    break;
                case 2:
                    context.setStrategy(new CalculateSquareArea());
                    dimensionsArray = new double[1];
                    System.out.println("Enter the side length of the square");
                    dimensionsArray[0] = Double.parseDouble(scanner.nextLine());
                    System.out.println("The area of the square is "+context.Calculate(dimensionsArray[0]));
                    break;
                case 3:
                    context.setStrategy(new CalculateRectangleArea());
                    dimensionsArray = new double[2];
                    System.out.println("Enter the length of the rectagle");
                    dimensionsArray[0] = Double.parseDouble(scanner.nextLine());
                    System.out.println("Enter the height of the rectagle");
                    dimensionsArray[1] = Double.parseDouble(scanner.nextLine());
                    System.out.println("The area of the rectangle is "+context.Calculate(dimensionsArray[0],dimensionsArray[1]));
                    break;
                case 4:
                    context.setStrategy(new CalculateSphereArea());
                    dimensionsArray = new double[1];
                    System.out.println("Enter the radius of the sphere");
                    dimensionsArray[0] = Double.parseDouble(scanner.nextLine());
                    System.out.println("The volume of the sphere is "+context.Calculate(dimensionsArray[0]));
                    break;
                case 5:
                    context.setStrategy(new CalculateCubeArea());
                    dimensionsArray = new double[1];
                    System.out.println("Enter the side length of the cube");
                    dimensionsArray[0] = Double.parseDouble(scanner.nextLine());
                    System.out.println("The volume of the cube is "+context.Calculate(dimensionsArray[0]));
                    break;
                case 6:
                    context.setStrategy(new CalculateCubeArea());
                    dimensionsArray = new double[3];
                    System.out.println("Enter the  length of the cuboid");
                    dimensionsArray[0] = Double.parseDouble(scanner.nextLine());
                    System.out.println("Enter the width of the cuboid");
                    dimensionsArray[1] = Double.parseDouble(scanner.nextLine());
                    System.out.println("Enter the height of the cuboid");
                    dimensionsArray[2] = Double.parseDouble(scanner.nextLine());
                    System.out.println("The area of the rectangle is "+context.Calculate(dimensionsArray[0],dimensionsArray[1],dimensionsArray[2]));
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }

        }while (!closeMenu);

    }



}
