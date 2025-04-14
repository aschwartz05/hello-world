
public class Policy {
    
    private int policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private int height; 
    private int weight; 

    
    public Policy() {
        this.policyNumber = 0;
        this.providerName = "Unknown";
        this.firstName = "John";
        this.lastName = "Doe";
        this.age = 0;
        this.smokingStatus = "non-smoker";
        this.height = 0;
        this.weight = 0;
    }

    
   
    public Policy(int policyNumber, String providerName, String firstName, String lastName,
                  int age, String smokingStatus, int height, int weight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus.toLowerCase(); 
        this.height = height;
        this.weight = weight;
    }

    
    public int getPolicyNumber() { return policyNumber; }
    public String getProviderName() { return providerName; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getSmokingStatus() { return smokingStatus; }
    public int getHeight() { return height; }
    public int getWeight() { return weight; }

    
    public void setPolicyNumber(int policyNumber) { this.policyNumber = policyNumber; }
    public void setProviderName(String providerName) { this.providerName = providerName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setAge(int age) { this.age = age; }
    public void setSmokingStatus(String smokingStatus) { this.smokingStatus = smokingStatus.toLowerCase(); }
    public void setHeight(int height) { this.height = height; }
    public void setWeight(int weight) { this.weight = weight; }

   
    public double calculateBMI() {
        if (height == 0) return 0; 
        return (weight * 703.0) / (height * height);
    }

    
    public double calculatePolicyPrice() {
        final double BASE_FEE = 600;
        double additionalFee = 0;

        if (age > 50) additionalFee += 75;
        if (smokingStatus.equals("smoker")) additionalFee += 100;

        double bmi = calculateBMI();
        if (bmi > 35) additionalFee += (bmi - 35) * 20;

        return BASE_FEE + additionalFee;
    }
    public String toString() {
        return String.format("Policy Number: %d\nProvider Name: %s\n%s\nPolicy Price: $%.2f\n",
            policyNumber, providerName, policyHolder.toString(), getPolicyPrice()
        );
    }
}
