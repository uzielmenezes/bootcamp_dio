package project.bootcamp;

public class Calculator {

    public static void add(double num1, double num2) {

        double result = num1 + num2;
        System.out.println("A soma de " + num1 + " mais " + num2 + " é " + result);
    }

    public static void sub(double num1, double num2) {

        double result = num1 - num2;
        System.out.println("A subtração de " + num1 + " mais " + num2 + " é " + result);

    }

    public static void mult(double num1, double num2) {

        double result = num1 * num2;
        System.out.println("A multiplicação de " + num1 + " mais " + num2 + " é " + result);

    }

    public static void div(double num1, double num2) {

        double result = num1 / num2;
        System.out.println("A a divisão de " + num1 + " mais " + num2 + " é " + result);

    }

}
