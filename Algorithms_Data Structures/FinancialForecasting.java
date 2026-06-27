public class Main {

    public static double futureValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
        return futureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {

        double currentValue = 10000;
        double growthRate = 0.10;
        int years = 5;

        double predictedValue = futureValue(currentValue, growthRate, years);

        System.out.println("Current Value: " + currentValue);
        System.out.println("Growth Rate: " + (growthRate * 100) + "%");
        System.out.println("Years: " + years);
        System.out.printf("Predicted Future Value: %.2f%n", predictedValue);

        System.out.println();
        System.out.println("Time Complexity: O(n)");
        System.out.println("Space Complexity: O(n)");
        System.out.println("Optimization: Use an iterative approach or memoization to reduce recursive overhead.");
    }
}