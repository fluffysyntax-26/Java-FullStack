package SyntaxBasics;

import org.w3c.dom.ls.LSOutput;

public class StringMethods {
    public static void main(String[] args) {
        String name = "  Deepak  ";

        int length = name.length(); // length of string
        char letter = name.charAt(2); // return a character at given index from a string
        int index = name.indexOf('a'); // return the index of the specified character from a string
        int lastIndex = name.lastIndexOf('e');

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        name = name.trim();
        System.out.println(name); // remove whitespaces

        name = name.replace("e", "o"); // replace characters
        System.out.println(name);

        System.out.println(name.isEmpty()); // check if string is empty

        String anotherName = "Deepak Krishna";
        // check if string contains a character
        if (anotherName.contains(" ")){
            System.out.println("Your name contains a space!");
        } else {
            System.out.println("Your name does not contain a space!");
        }

        // check for string equality using the equals() method
        String password = "password";

        if(password.equals("password")) {
            System.out.println("Your password cannot be 'password'");
        }
    }
}
