package SyntaxBasics;

import java.util.Scanner;

// Email Slicer Program
public class SubString {
    public static void main(String[] args) {
        // .substring() = A method used to extract a portion of a string .substring(start, end)

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        if(email.contains("@")){
            String username = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@"));

            System.out.println("Username: " + username);
            System.out.println("Domain: " + domain);
        } else {
            System.out.println("Invalid Email!!");
        }


        scanner.close();
    }
}
