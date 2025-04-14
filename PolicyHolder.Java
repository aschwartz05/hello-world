public class PolicyHolder {
    private String firstName;
    private String lastName;
    private int age;
    private boolean smoker; // true for smoker, false for non-smoker
    private double height; // in inches
    private double weight; // in pounds

    public PolicyHolder(String firstName, String lastName, int age, boolean smoker, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smoker = smoker;
        this.height = height;
        this.weight = weight;
    }

    public PolicyHolder(PolicyHolder other) {
        this(other.firstName, other.lastName, other.age, other.smoker, other.height, other.weight);
    }

    public String getFirstName() { return firstName; }

    public String getLastName() { return lastName; }

    public int getAge() { return age; }

    public boolean isSmoker() { return smoker; }

    public double getHeight() { return height; }

    public double getWeight() { return weight; }

    public double getBMI() {
        return (weight * 703) / (height * height);
    }

    
    public String toString() {
        return String.format(
            "Policyholder's First Name: %s\nPolicyholder's Last Name: %s\nPolicyholder's Age: %d\n" +
            "Policyholder's Smoking Status (Y/N): %s\nPolicyholder's Height: %.1f inches\n" +
            "Policyholder's Weight: %.1f pounds\nPolicyholder's BMI: %.2f",
            firstName, lastName, age, (smoker ? "smoker" : "non-smoker"), height, weight, getBMI()//added toString
        );
    }
}
