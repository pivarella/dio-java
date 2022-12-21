package edu.pietra.firstweek;

public class Variables {
    public static void main(String [] args) {
    
        final String FIRSTNAME = "Pietra";
        String lastName = "Silva";
        String name = FIRSTNAME + " " + lastName;

        boolean result = name == FIRSTNAME.concat(" ").concat(lastName) && name.equals(FIRSTNAME.concat(" ").concat(lastName))? true : false;

    }
}
