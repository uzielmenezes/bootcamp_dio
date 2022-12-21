package projects.dio.collections.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleStreamApi {
    public static void main(String[] args) {
        List<String> randomNumbers = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista");
        /*
         * unsual anonymous class
         * randomNumbers.stream().forEach(new Consumer<String>() {
         * 
         * @Override
         * public void accept(String s) {
         * System.out.println(s);
         * }
         * });
         */

        // lambda
        // randomNumbers.stream().forEach(string -> System.out.println(string));

        // method reference
        randomNumbers.stream().forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set");
        randomNumbers.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);

        System.out.println("Transforme esta lista de string em uma lista de números inteiros");
        List<Integer> collectList = randomNumbers.stream().map(Integer::parseInt)
                .collect(Collectors.toList());
        collectList.stream().forEach(System.out::println);

        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista");

        List<Integer> evenBiggerThan2 = randomNumbers.stream().map(Integer::parseInt)
                .filter((i) -> (i % 2 == 0 && i > 2))
                .collect(Collectors.toList());
        System.out.println(evenBiggerThan2);

        System.out.println("Mostre a média dos números");

        randomNumbers.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out::println);

        System.out.println("Remova os valores ímpares");
        collectList.removeIf((intenger) -> (intenger % 2 != 0));
        System.out.println(collectList);

    }
}
