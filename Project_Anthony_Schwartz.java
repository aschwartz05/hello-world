import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Project_Anthony_Schwartz {
    public static void main(String[] args) {
        ArrayList<Policy> policies = new ArrayList<>(); 
        
        try {
            File file = new File("PolicyInformation.txt");
            Scanner fileScanner = new Scanner(file);

            
            while (fileScanner.hasNextLine()) {
                int policyNumber = Integer.parseInt(fileScanner.nextLine());
                String providerName = fileScanner.nextLine();
                String firstName = fileScanner.nextLine();
                String lastName = fileScanner.nextLine();
                int age = Integer.parseInt(fileScanner.nextLine());
                String smokingStatus = fileScanner.nextLine();
                int height = Integer.parseInt(fileScanner.nextLine());
                int weight = Integer.parseInt(fileScanner.nextLine());

                
                Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
                policies.add(policy); 
            }

            
            for (Policy policy : policies) {
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
            }

            
            int smokerCount = 0;
            int nonSmokerCount = 0;
            for (Policy policy : policies) {
                if ("smoker".equalsIgnoreCase(policy.getSmokingStatus())) {
                    smokerCount++;
                } else {
                    nonSmokerCount++;
                }
            }

            System.out.println("\nNumber of Smokers: " + smokerCount);
            System.out.println("Number of Non-Smokers: " + nonSmokerCount);

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please check the file path.");
        }
    }
}
