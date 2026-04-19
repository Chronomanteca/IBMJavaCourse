package chrono.ibmcourse.LabSolutions.Module1.utils.CreateCustomFunctions.Strategies;

import chrono.ibmcourse.LabSolutions.Module1.utils.CreateCustomFunctions.CalculatorStrategy;

public class CalculateCuboidArea implements CalculatorStrategy {
    @Override
    public double calculateShapeArea(double... dimensions) {
        double length = dimensions[0];
        double width = dimensions[1];
        double height = dimensions[2];
        return length * width * height;
    }
}
