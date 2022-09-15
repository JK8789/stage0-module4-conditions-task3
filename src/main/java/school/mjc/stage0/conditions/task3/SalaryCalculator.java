package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public static void calculateSalary(int salary) {
        float salaryAfterTax;
        if ((salary > 0) && (salary <= 10000)) {
            salaryAfterTax = salary - (salary / 100 * 15);
            System.out.println(salaryAfterTax);
        } else if ((salary > 10000) && (salary <= 20000)) {
            salaryAfterTax = salary - (salary / 100 * 18);
            System.out.println(salaryAfterTax);
        } else if (salary > 20000) {
            salaryAfterTax = salary - (salary / 100 * 20);
            System.out.println(salaryAfterTax);
        } else {
            System.out.println("wrong input!");
        }
    }

    public static void main(String[] args) {
        calculateSalary(12000);
    }
}
