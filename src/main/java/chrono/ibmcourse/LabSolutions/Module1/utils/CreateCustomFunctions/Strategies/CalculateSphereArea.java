package chrono.ibmcourse.LabSolutions.Module1.utils.CreateCustomFunctions.Strategies;

import chrono.ibmcourse.LabSolutions.Module1.utils.CreateCustomFunctions.CalculatorStrategy;

public class CalculateSphereArea implements CalculatorStrategy {

    @Override
    public double calculateShapeArea(double... dimensions) {
        double radius = dimensions[0];

        return ((double) 1 /4) * Math.PI * Math.pow(radius,3);
    }
}
