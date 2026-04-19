package chrono.ibmcourse.LabSolutions.Module1.utils.CreateCustomFunctions;

public class CalculatorContext {
    private CalculatorStrategy strategy;

    public void setStrategy(CalculatorStrategy strategy) {
        this.strategy = strategy;
    }

    public double Calculate(double... dimensions){
        return strategy.calculateShapeArea(dimensions);
    }
}
