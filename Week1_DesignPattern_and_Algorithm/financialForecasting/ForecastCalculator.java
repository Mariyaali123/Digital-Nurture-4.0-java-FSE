package financialForecasting;

public class ForecastCalculator {

    // Recursive method to calculate future value
    public static double futureValueRecursive(double initialAmount, double growthRate, int years) {
        if (years == 0) {
            return initialAmount;
        }
        return futureValueRecursive(initialAmount, growthRate, years - 1) * (1 + growthRate);
    }

    // Optimized version using memoization
    public static double futureValueMemo(double initialAmount, double growthRate, int years, Double[] memo) {
        if (years == 0) return initialAmount;

        if (memo[years] != null) return memo[years];

        memo[years] = futureValueMemo(initialAmount, growthRate, years - 1, memo) * (1 + growthRate);
        return memo[years];
    }
}