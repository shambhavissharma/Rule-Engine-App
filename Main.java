package src.main.java;

import src.main.java.controller.RuleController;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user inputs for age and salary
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        
        System.out.print("Enter salary: ");
        int salary = scanner.nextInt();

        RuleController controller = new RuleController();

        // Hardcoded rule for example; can be customized as needed
        String ruleString = "(age > 30 AND salary > 50000)";
        boolean isEligible = controller.isUserEligible(ruleString, age, salary);

        System.out.println("Is user eligible? " + isEligible);
        
        // Close the scanner
        scanner.close();
    }
}
