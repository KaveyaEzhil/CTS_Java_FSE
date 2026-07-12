public class Test {
    public static void main(String[] args) {
        double presentValue = 1000.0; // Initial investment
        double growthRate = 0.05;    // 5% annual growth
        int periods = 30;            // 30 years

        System.out.println("Initial Value: $" + presentValue);
        System.out.println("Annual Growth Rate: " + (growthRate * 100) + "%");
        System.out.println("Forecast Period: " + periods + " years");

        // 1. Standard Linear Recursion
        System.out.println("\n--- Standard Linear Recursive Forecasting ---");
        long startRec = System.nanoTime();
        double fvRec = FinancialForecasting.calculateFutureValue(presentValue, growthRate, periods);
        long endRec = System.nanoTime();
        System.out.printf("Future Value: $%.2f\n", fvRec);
        System.out.println("Time taken: " + (endRec - startRec) + " ns");

        // 2. Optimized Logarithmic Recursion (Fast Exponentiation)
        System.out.println("\n--- Optimized Logarithmic Forecasting ---");
        long startOpt = System.nanoTime();
        double fvOpt = FinancialForecasting.calculateFutureValueOptimized(presentValue, growthRate, periods);
        long endOpt = System.nanoTime();
        System.out.printf("Future Value: $%.2f\n", fvOpt);
        System.out.println("Time taken: " + (endOpt - startOpt) + " ns");

        // 3. Iterative Space-Optimization
        System.out.println("\n--- Iterative Forecasting ---");
        long startIter = System.nanoTime();
        double fvIter = FinancialForecasting.calculateFutureValueIterative(presentValue, growthRate, periods);
        long endIter = System.nanoTime();
        System.out.printf("Future Value: $%.2f\n", fvIter);
        System.out.println("Time taken: " + (endIter - startIter) + " ns");
    }
}
