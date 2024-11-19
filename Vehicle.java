package hackerrankProject;
import java.util.Scanner;

public class Vehicle {
    private double maxSpeed = 100.0;
    private double minSpeed = 0.0;
    private int weight = 4079;
    private boolean isCarOn = false;
    private char condition = 'A';
    private String nameOfCar = "Toyota";

    private double maxFuel = 16.0;
    private double currentFuel = 8.0;
    private double mpg = 26.4;

    private int numberOfPeopleInCar = 1;

    // Constructor
    public Vehicle(double customMaxSpeed, int customWeight, boolean customIsCarOn, char customCondition) {
        this.maxSpeed = customMaxSpeed;
        this.weight = customWeight;
        this.isCarOn = customIsCarOn;
        this.condition = customCondition;
    }

    public void printVariables() {
        System.out.println("Car Name: " + this.nameOfCar);
        System.out.println("Max Speed: " + this.maxSpeed + " mph");
        System.out.println("Min Speed: " + this.minSpeed + " mph");
        System.out.println("Weight: " + this.weight + " lbs");
        System.out.println("Car Condition: " + this.condition);
        System.out.println("Car State: " + (this.isCarOn ? "ON" : "OFF"));
        System.out.println("Current Fuel: " + this.currentFuel + " gallons");
        System.out.println("People in Car: " + this.numberOfPeopleInCar);
    }

    public void addPassenger() {
        numberOfPeopleInCar++;
        System.out.println("One person added. Total passengers: " + numberOfPeopleInCar);
    }

    public void removePassenger() {
        if (numberOfPeopleInCar > 0) {
            numberOfPeopleInCar--;
            System.out.println("One person removed. Total passengers: " + numberOfPeopleInCar);
        } else {
            System.out.println("The car is empty!");
        }
    }

    public double milesTillEmpty() {
        return currentFuel * mpg;
    }

    public double maxMilesPerFillUp() {
        return maxFuel * mpg;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter the maximum speed of the vehicle (mph):");
            double userMaxSpeed = input.nextDouble();

            System.out.println("Enter the weight of the vehicle (lbs):");
            int userWeight = input.nextInt();

            System.out.println("Is the car currently on? (true/false):");
            boolean userIsCarOn = input.nextBoolean();

            System.out.println("Enter the condition of the vehicle (A/B/C):");
            char userCondition = input.next().charAt(0);

            // Create Vehicle object
            Vehicle birthdayPresent = new Vehicle(userMaxSpeed, userWeight, userIsCarOn, userCondition);

            // Display vehicle details
            System.out.println("\n=== Vehicle Details ===");
            birthdayPresent.printVariables();

            // Add and remove passengers
            birthdayPresent.addPassenger();
            birthdayPresent.addPassenger();
            birthdayPresent.removePassenger();

            // Show fuel-related details
            System.out.println("Miles Left: " + birthdayPresent.milesTillEmpty());
            System.out.println("Max Miles Per Fill-Up: " + birthdayPresent.maxMilesPerFillUp());

        } catch (Exception e) {
            System.out.println("Invalid input! Please restart the program and enter the correct data types.");
        } finally {
            input.close(); // Always close the scanner
        }
    }
}
