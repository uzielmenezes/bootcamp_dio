package edu.uziel.codes;

public class Operadores {
    public static void main(String[] args) {

        String name1 = "UZIEL";
        String name2 = new String("UZIEL");

        int numb1 = 2;
        int numb2 = 4;

        System.out.println(numb1 != numb2);

        System.out.println(name1.equals(name2));

        int negNumber = -5;

        System.out.println(negNumber);

        negNumber = -negNumber;

        System.out.println(negNumber);
    }

}
