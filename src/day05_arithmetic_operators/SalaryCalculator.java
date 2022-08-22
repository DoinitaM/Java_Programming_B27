package day05_arithmetic_operators;

public class SalaryCalculator {
    public static void main(String[] args) {
        /* create a class SalaryCalculator
    add a main method
    declare and assign these variables:

       salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax

    Sample data:
       100000 (salary)
       0.08 (state tax rate)
       0.21 (federal tax rate)

    Hint: use tax rates of 0.08 and 0.21 for 8% and 21%

    Print the tax rates, your total salary, the amount of tax for state and federal, the total tax amount, and your salary after all taxes*/
        double salary = 100_000.00;
        double stateTaxeRate =0.08, federaTaxRate = 0.21;
       double stateTax = salary * stateTaxeRate;
        double federalTax = salary * federaTaxRate;
        double totalTax  = stateTax + federalTax;
        int totalTax1 = (int)totalTax;
        double salaryAfterTax = salary - totalTax;
        int salaryAfterTax1 = (int)salaryAfterTax;

        System.out.println("Salary: " + salary);
        System.out.println(" State Tax: " + stateTax);
        System.out.println("Federal Taxe: " + federalTax);
        System.out.println("Total Taxe: " +totalTax );
        System.out.println("Total salary after Tax: " +salaryAfterTax );
        System.out.println("The total tax will be $" + totalTax1 + " and salary after tax will be $" + salaryAfterTax1 );






    }
}
