package financialForecasting;

public class Main {
    public static void main(String[] args) {
        double initialAmount = 10000;
        double annualGrowthRate = 0.08;
        int years = 10;

        double forecastRecursive = ForecastCalculator.futureValueRecursive(initialAmount, annualGrowthRate, years);
        System.out.printf("Future Value (Recursive): ₹%.2f%n", forecastRecursive);

        Double[] memo = new Double[years + 1];
        double forecastMemo = ForecastCalculator.futureValueMemo(initialAmount, annualGrowthRate, years, memo);
        System.out.printf("Future Value (Memoized): ₹%.2f%n", forecastMemo);
    }
}