package Assignments;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Height: ");
        double height = scanner.nextDouble();

        System.out.print("\nEnter Width: ");
        double width = scanner.nextDouble();

        System.out.println("Area of Rectangle is: " + height * width);

        scanner.close();
    }
}
