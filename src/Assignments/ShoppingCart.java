package Assignments;

import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String itemName;
        double price;
        int quantity;
        double total;

        System.out.print("What item would you like to buy?: ");
        itemName = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();

        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();

        System.out.println("Total = " + price * quantity);

        scanner.close();
    }
}
