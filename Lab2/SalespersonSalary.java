import java.util.*;

public class SalespersonSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salary, input = 0;

        while (input != -1) {
            System.out.print("Enter sales in dollars (or -1 to end): ");
            input = sc.nextDouble();
            if (input == -1) break;
            salary = (input * 15 / 100) + 1000;
            System.out.println("Salary is: $" + salary + "\n");
        }

        System.out.println("bye");

        sc.close();
    }
}