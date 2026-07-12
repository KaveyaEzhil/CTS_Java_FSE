public class FinancialForecasting {

    /**
     * Standard Linear Recursion:
     * Calculates future value based on constant growth rate.
     * Time Complexity: O(n) where n is the number of periods (years).
     * Space Complexity: O(n) call stack space.
     */
    public static double calculateFutureValue(double currentValue, double growthRate, int periods) {
        // Base case: 0 periods remain
        if (periods == 0) {
            return currentValue;
        }
        // Recursive case
        return calculateFutureValue(currentValue, growthRate, periods - 1) * (1 + growthRate);
    }

    /**
     * Optimized Logarithmic Recursion (Fast Exponentiation):
     * Calculates Future Value in O(log n) time by dividing the periods (exponent) by 2.
     * Time Complexity: O(log n)
     * Space Complexity: O(log n) call stack space.
     */
    public static double calculateFutureValueOptimized(double currentValue, double growthRate, int periods) {
        return currentValue * power(1 + growthRate, periods);
    }

    private static double power(double base, int exponent) {
        if (exponent == 0) {
            return 1.0;
        }
        double half = power(base, exponent / 2);
        if (exponent % 2 == 0) {
            return half * half;
        } else {
            return base * half * half;
        }
    }

    /**
     * Iterative Approach (Alternative Space-Optimization):
     * Avoids recursive call stack overhead completely.
     * Time Complexity: O(n)
     * Space Complexity: O(1) auxiliary space.
     */
    public static double calculateFutureValueIterative(double currentValue, double growthRate, int periods) {
        double futureValue = currentValue;
        for (int i = 0; i < periods; i++) {
            futureValue *= (1 + growthRate);
        }
        return futureValue;
    }
}
