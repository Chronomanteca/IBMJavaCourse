package org.example.LabsSolutions.utils.CreateCustomFunctions.Strategies;

import org.example.LabsSolutions.utils.CreateCustomFunctions.CalculatorStrategy;

public class CalculateCubeArea implements CalculatorStrategy {

    @Override
    public double calculateShapeArea(double... dimensions) {
        double sideLength = dimensions[0];
        return Math.pow(sideLength,3);
    }
}
