package chrono.ibmcourse.LabSolutions.Module1.utils.CreateCustomFunctions.Strategies;
import chrono.ibmcourse.LabSolutions.Module1.utils.CreateCustomFunctions.CalculatorStrategy;

public class CalculateCircleArea implements CalculatorStrategy {
    @Override
    public double calculateShapeArea(double... dimensions) {
        double radius = dimensions[0];
        return Math.PI * Math.pow(radius,2);
    }
}
