import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        // instanciate scanner object
        Scanner scanner = new Scanner(System.in);

        // take string input
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello! " + name);

        // take int input
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Your age is: " + age);

        // take double as input
        System.out.println("Enter your GPA: ");
        double gpa = scanner.nextDouble();
        System.out.println("Your GPA is: " + gpa);

        scanner.close();
    }
}
