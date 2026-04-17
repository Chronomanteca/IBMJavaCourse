package org.example.LabsSolutions.utils.CreateCustomFunctions.Strategies;
import org.example.LabsSolutions.utils.CreateCustomFunctions.CalculatorStrategy;

public class CalculateCircleArea implements CalculatorStrategy {
    @Override
    public double calculateShapeArea(double... dimensions) {
        double radius = dimensions[0];
        return Math.PI * Math.pow(radius,2);
    }
}
