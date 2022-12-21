package edu.pietra.firstweek;
public class MyClass {

    public static void main (String[] args) {
        
        System.out.print("Hello World!");

        String firstName = "Pietra";
        String middleName = "Varella Gomes";
        String lastName = "da Silva";

        String myName = fullName(firstName, middleName, lastName);

        int age = 23;
        boolean isTrue = true;




    }
    public static String fullName (String firstName, String middleName, String lastName) {
        return firstName.concat(" ").concat(middleName).concat(" ").concat(lastName);
    }
}