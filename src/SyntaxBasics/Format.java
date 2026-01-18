package SyntaxBasics;

public class Format {
    public static void main(String[] args) {
        String name = "Deepak";
        char firstLetter = 'D';
        int age = 20;
        double height = 162.5;
        boolean isStudent = true;

        System.out.printf("Hello %s \n", name);
        System.out.printf("Your name starts with %c\n", firstLetter);
        System.out.printf("Your are %d year old\n", age);
        // .2f = precision
        System.out.printf("Your height is %.2f cms tall\n", height);
        System.out.printf("Student: %b\n", isStudent);

        double price = 781344324.89;
        // , = comma grouping separator
        System.out.printf("%,.2f\n", price);

        double negative = -67.89;
        // flag - ( = negative numbers are enclosed in ()
        System.out.printf("% (.2f\n", negative);

        // % + [flags] + [width] + [.precision] + [conversion] = correct order

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        // 0 = zero padding
        // number = right justified padding
        //negative number = left justified padding
        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);

    }
}
