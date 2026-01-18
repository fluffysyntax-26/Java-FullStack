package SyntaxBasics;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        // ternary operator ? = Return 1 of 2 values if a condition is true

        // variable = (condition) ? ifTrue : ifFalse;

        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        String passOrFail = (score >= 60) ? "PASS" : "FAIL";
        System.out.println(passOrFail);
    }
}
