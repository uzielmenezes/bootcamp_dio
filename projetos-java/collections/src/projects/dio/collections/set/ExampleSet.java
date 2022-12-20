package projects.dio.collections.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExampleSet {
    public static void main(String[] args) {

        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> grades = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(grades);

        // System.out.println("Exiba a posição da nota 5.0");

        // System.out.println("Adicione na lista a nota 8.0 na posição 4");

        // System.out.println("Substitua a nota 5.0 pela nota 6.0");

        System.out.println("Confira se a nota 5.0 está no conjunto");
        System.out.println(grades.contains(5d));

        System.out.println("Exiba a menor nota");
        System.out.println(Collections.min(grades));

        System.out.println("Exiba a maior nota");
        System.out.println(Collections.max(grades));

        System.out.println("Soma dos valores");
        Iterator<Double> iterator1 = grades.iterator();
        Double sum = 0d;
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            sum += next;
        }
        System.out.println(sum);

        System.out.println("Média das notas");
        System.out.println(sum / grades.size());

        System.out.println("Remova a nota 0");
        grades.remove(0d);
        System.out.println(grades);

        System.out.println("Remova as notas menores que 7");
        Iterator<Double> iterator2 = grades.iterator();
        while (iterator2.hasNext()) {
            Double next = iterator2.next();
            if (next < 7)
                iterator2.remove();
        }
        System.out.println(grades);

        System.out.println("Exiba todas as notas na ordem em que foram informados");
        Set<Double> grades2 = new LinkedHashSet<>();
        grades2.add(7d);
        grades2.add(8.5);
        grades2.add(9.3);
        grades2.add(5d);
        grades2.add(7d);
        grades2.add(0d);
        grades2.add(3.6);
        System.out.println(grades2);

        System.out.println("Exiba todas as notas em ordem crescente");
        Set<Double> grades3 = new TreeSet<>(grades2);
        System.out.println(grades3);

        System.out.println("Apague todo o conjunto");
        grades.clear();
        System.out.println(grades);
        System.out.println("Confira se o conjunto 1 está vazio");
        System.out.println(grades.isEmpty());

        System.out.println("Confira se o conjunto 2 está vazio");
        System.out.println(grades2.isEmpty());
        System.out.println("Confira se o conjunto 3 está vazio");
        System.out.println(grades3.isEmpty());

    }

}
