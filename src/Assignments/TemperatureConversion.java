package Assignments;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         double temperature;
         double newTemp;
         String unit;

        System.out.print("Enter the temperature: ");
        temperature = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temperature - 32) * 5.0 / 9.0 : (temperature * 9.0/5.0) + 32;

        System.out.printf("New Temperature: %.2f %s", newTemp, unit);
         scanner.close();


    }
}
