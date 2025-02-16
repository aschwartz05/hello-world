import java.util.Scanner;

public class Project_Anthony_Schwartz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter the Policy Number: ");
        int policyNumber = input.nextInt();
        input.nextLine(); // Consume newline

        System.out.print("Enter the Provider Name: ");
        String providerName = input.nextLine();

        System.out.print("Enter the Policyholder’s First Name: ");
        String firstName = input.nextLine();

        System.out.print("Enter the Policyholder’s Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Enter the Policyholder’s Age: ");
        int age = input.nextInt();

        System.out.print("Enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
        String smokingStatus = input.next();

        System.out.print("Enter the Policyholder’s Height (in inches): ");
        int height = input.nextInt();

        System.out.print("Enter the Policyholder’s Weight (in pounds): ");
        int weight = input.nextInt();

        // Create Policy object
        Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);

        // Display policy details
        System.out.println("\nPolicy Details:");
        System.out.println("Policy Number: " + policy.getPolicyNumber());
        System.out.println("Provider Name: " + policy.getProviderName());
        System.out.println("Policyholder’s Name: " + policy.getFirstName() + " " + policy.getLastName());
        System.out.println("Policyholder’s Age: " + policy.getAge());
        System.out.println("Policyholder’s Smoking Status: " + policy.getSmokingStatus());
        System.out.println("Policyholder’s Height: " + policy.getHeight() + " inches");
        System.out.println("Policyholder’s Weight: " + policy.getWeight() + " pounds");
        System.out.printf("Policyholder’s BMI: %.2f\n", policy.calculateBMI());
        System.out.printf("Policy Price: $%.2f\n", policy.calculatePolicyPrice());

        input.close();
    }
}