package Exception;

import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double studentGrade = Double.parseDouble(scanner.nextLine());

        try {
            if (studentGrade >  6 || studentGrade < 2){
                throw new GradeException("Invalid Grade");
            }
            else {
                System.out.println("Success");
            }
        }
        catch (GradeException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Message");
        }

    }
}
