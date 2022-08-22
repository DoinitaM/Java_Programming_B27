package day06_operators;

public class SalaryCalculator {
    public static void main(String[] args) {


        double salary = 100_000;
        double stateTaxRate = 0.08;
        double federalTaxRate = 0.21;
        double stateTax, federalTax, totalTax, salaryAfterTax;
        stateTax = salary * stateTaxRate;
        federalTax = salary * federalTaxRate;
        totalTax = stateTax + federalTax;
        salaryAfterTax = salary - totalTax;
        String taxReport = " | Salary " + salary + " State tax rate: " + stateTaxRate + " | Federal tax rate " + federalTaxRate + " \n State tax: $" + stateTax + " | Federal tax: $" + federalTax + " | Total tax: $" + totalTax + " \n Total salary after taxes $" + salaryAfterTax;
        System.out.println(taxReport);
    }
}
