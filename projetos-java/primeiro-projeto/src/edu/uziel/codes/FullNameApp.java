package edu.uziel.codes;

public class FullNameApp {
    public static void main(String[] args) throws Exception {

        String firstName = "Uziel";
        String lastName = "Menezes";

        String fullName = fullName(firstName, lastName);

        System.out.println(fullName);
    }

    public static String fullName(String firstName, String lastName) {
        return "Resultado do método: " + firstName.concat(" " + lastName);
    }
}
