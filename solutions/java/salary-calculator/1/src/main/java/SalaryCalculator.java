public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return (daysSkipped < 5) ? 1.0 : 0.85;
    }

    public int bonusMultiplier(int productsSold) {
        return (productsSold > 19) ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return 1.0 * bonusMultiplier(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = 1000.00;
        salary *= salaryMultiplier(daysSkipped);
        salary += bonusForProductsSold(productsSold);
        return (salary > 2000.00) ? 2000.00 : salary;
    } 
}
