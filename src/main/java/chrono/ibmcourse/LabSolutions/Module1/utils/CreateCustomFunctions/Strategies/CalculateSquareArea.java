package chrono.ibmcourse.LabSolutions.Module1.utils.CreateCustomFunctions.Strategies;

import chrono.ibmcourse.LabSolutions.Module1.utils.CreateCustomFunctions.CalculatorStrategy;

public class CalculateSquareArea implements CalculatorStrategy {
    @Override
    public double calculateShapeArea(double... dimensions) {
        double sideLength = dimensions[0];
        return Math.pow(sideLength,2);
    }
}
