import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        // scanner object
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String name = scanner.next();

        System.out.println("Digite seu sobrenome");
        String lastName = scanner.next();

        System.out.println("Digite sua idade");
        int age = scanner.nextInt();

        System.out.println("Digite sua altura");
        double heigth = scanner.nextDouble();

        System.out.println("Seu nome é: " + name);
        System.out.println("Seu sobrenome é: " + lastName);
        System.out.println("Sua idade é: " + age);
        System.out.println("Sua altura é: " + heigth);

    }
}
