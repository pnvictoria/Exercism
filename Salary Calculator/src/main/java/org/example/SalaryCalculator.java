package org.example;

public class SalaryCalculator {
    public final static double MULTIPLIER_RER_DAY_SKIPPED_LESS = 0.85;
    public final static double MULTIPLIER_RER_DAY_SKIPPED_NORMAL = 1.00;
    public final static int MULTIPLIER_RER_DAY_PRODUCT_BIGGER = 13;
    public final static int MULTIPLIER_RER_DAY_PRODUCT_NORMAL = 10;
    public final static double MIN_SALARY = 100.00;
    public final static double MAX_SALARY = 2000.00;

    public double multiplierPerDaysSkipped(int daysSkipped) {
        return daysSkipped > 5 ? MULTIPLIER_RER_DAY_SKIPPED_LESS : MULTIPLIER_RER_DAY_SKIPPED_NORMAL;
    }

    public int multiplierPerProductsSold(int productsSold) {
        return productsSold > 20 ? MULTIPLIER_RER_DAY_PRODUCT_BIGGER : MULTIPLIER_RER_DAY_PRODUCT_NORMAL;
    }

    public double bonusForProductSold(int productsSold) {
        return (double) multiplierPerProductsSold(productsSold) * (double)productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double result = MIN_SALARY * multiplierPerDaysSkipped(daysSkipped) + bonusForProductSold(productsSold);
        return Math.min(result, MAX_SALARY);
    }
}