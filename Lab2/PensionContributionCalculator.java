import java.util.*;

public class PensionContributionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the monthly salary: $");
        int monthlySalary = sc.nextInt();
        System.out.print("Enter the age: ");
        int employeeAge = sc.nextInt();

        double employeeContribution = 0,employerContribution = 0;

        if (employeeAge <= 55) {
            employeeContribution = monthlySalary * (20.0/100.0);
            employerContribution = monthlySalary * (17.0/100.0);
        } else if (employeeAge <= 60) {
            employeeContribution = monthlySalary * (13.0 / 100.0);
            employerContribution = monthlySalary * (13.0 / 100.0);
        } else if (employeeAge <= 65) {
            employeeContribution = monthlySalary * (7.5 / 100.0);
            employerContribution = monthlySalary * (9 / 100.0);
        } else {
            employeeContribution = monthlySalary * (5 / 100.0);
            employerContribution = monthlySalary * (7.5 / 100.0);
        }

        double totalContribution = employeeContribution + employerContribution;

        System.out.println("The employee's contribution is: $" + String.format("%.2f", employeeContribution));
        System.out.println("The employer's contribution is: $" + String.format("%.2f", employerContribution));
        System.out.println("The total contribution is: $" + String.format("%.2f", totalContribution));
        sc.close();
    }

}