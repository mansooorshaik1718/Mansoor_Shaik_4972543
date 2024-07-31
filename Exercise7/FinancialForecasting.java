package Exercise7;

public class FinancialForecasting {

    // Method to calculate future value recursively
    public static double predictFutureValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
        return predictFutureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        double initialValue = 1000.0; // Initial value
        double growthRate = 0.05; // 5% annual growth rate
        int years = 10; // Number of years

        double futureValue = predictFutureValue(initialValue, growthRate, years);
        System.out.println("Future Value after " + years + " years: $" + futureValue);
    }
}

