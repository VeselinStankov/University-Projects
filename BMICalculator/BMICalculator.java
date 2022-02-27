package BMICalculator;

import java.util.Scanner;

public class BMICalculator {

    public static void printIntroduction(){
        System.out.println("Hello, Welcome to BMI Calculator");
    }

    public static double getBMI(Scanner scanner){
        System.out.printf("Enter height: ");
        double height = Double.parseDouble(scanner.nextLine());
        System.out.printf("Enter weight: ");
        double weight = Double.parseDouble(scanner.nextLine());
        double heightInSm = height * 2.54;
        double weightInKg = weight * 0.45359237;
        return bmiFor(heightInSm,weightInKg);
    }

    public static double bmiFor(double heightInSm, double weightInKg){
        double bodyMassIndex = weightInKg * 703 / (heightInSm*heightInSm);
        return bodyMassIndex;
    }

    public static String getStatus(double bodyMassIndex){
        String bmiIndex = "";
        if (bodyMassIndex <= 18.5){
            bmiIndex = "underweight";
            return bmiIndex;
        }
        else if (bodyMassIndex <= 25){
            bmiIndex = "normal";
            return bmiIndex;
        }
        else if (bodyMassIndex <= 30){
            bmiIndex = "overweight";
            return bmiIndex;
        }
        else {
            bmiIndex = "obese";
            return bmiIndex;
        }
    }

    public static void ReportResults(int counter,String bmiIndex,double bodyMassIndex){
        System.out.printf("Person number %d has a BMI of %.2f. Status: %s",counter,bodyMassIndex,bmiIndex);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        counter ++;

        printIntroduction();
        ReportResults(counter,getStatus(getBMI(scanner)),getBMI(scanner));
    }
}
