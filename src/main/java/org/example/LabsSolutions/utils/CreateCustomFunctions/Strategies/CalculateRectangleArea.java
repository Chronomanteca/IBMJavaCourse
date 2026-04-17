package org.example.LabsSolutions.utils.CreateCustomFunctions.Strategies;

import org.example.LabsSolutions.utils.CreateCustomFunctions.CalculatorStrategy;

public class CalculateRectangleArea implements CalculatorStrategy {
    @Override
    public double calculateShapeArea(double... dimensions) {
        double length = dimensions[0];
        double height = dimensions[1];
        return length * height;
    }
}
