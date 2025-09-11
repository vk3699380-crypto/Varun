package asignment_1;
import java.util.Scanner;
public class level_1_question_3 {
    public static double calculateRounds(double side1, double side2, double side3, double targetDistance) {
        double perimeter = side1 + side2 + side3;
        return targetDistance / perimeter;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of side 1 (in meters): ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter length of side 2 (in meters): ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter length of side 3 (in meters): ");
        double side3 = scanner.nextDouble();
        double targetDistance = 5000;
        double rounds = calculateRounds(side1, side2, side3, targetDistance);
        System.out.printf("To complete a 5 km run, the athlete must complete %.2f rounds around the triangular park.%n", rounds);
        scanner.close();
    }
}
