package project.bootcamp;

public class Main {

    public static void main(String[] args) {

        // Calculator

        System.out.println("Calculadora");
        Calculator.add(3, 6);
        Calculator.sub(9, 1.8);
        Calculator.mult(7, 8);
        Calculator.div(5, 2.5);

        // Message

        System.out.println("Mensagem");
        Message.getMessage(9);
        Message.getMessage(14);
        Message.getMessage(1);
    }

}
