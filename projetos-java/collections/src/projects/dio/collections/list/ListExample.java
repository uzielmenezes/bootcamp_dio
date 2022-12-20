package projects.dio.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) throws Exception {

        System.out.println("Crie uma lista e adicione as sete notas");

        List<Double> grades = new ArrayList<>();
        grades.add(7.0);
        grades.add(8.0);
        grades.add(7.4);
        grades.add(9.5);
        grades.add(6.5);
        grades.add(5.0);
        grades.add(8.3);

        System.out.println(grades);

        System.out.println("Exiba a posição da nota 9.5");
        System.out.println(grades.indexOf(9.5));

        System.out.println("Adicione na lista a nota 4.6 na posição 4");
        grades.add(4, 4.6);
        System.out.println(grades);

        System.out.println("Substitua a nota 5.0 pela 8.3");
        grades.set(grades.indexOf(5d), 6d);
        System.out.println(grades);

        System.out.println("Confira se a nota 9.5 está na lista");
        grades.contains(6.5);

        System.out.println("Exiba todas as notas na ordem que foram informadas");
        // the method List sorts the elements the same order they were added
        for (Double grade : grades)
            System.out.println(grade);

        System.out.println("Exiba a terceira nota adicionada");
        System.out.println(grades.get(2));

        System.out.println("Exiba a menor nota");
        System.out.println(Collections.min(grades));

        System.out.println("Exiba a maior nota");
        System.out.println(Collections.max(grades));

        System.out.println("Exiba a soma dos valores");
        Iterator<Double> iterator = grades.iterator();
        Double sum = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            sum += next;
        }
        System.out.println(sum);

        System.out.println("Exiba a media das notas");
        System.out.println(sum / grades.size());

        System.out.println("Remova a nota 8.0");
        grades.remove(1);
        System.out.println(grades);

        System.out.println("Remova a nota da posição 0");
        grades.remove(0);
        System.out.println(grades);

        System.out.println("Remova as notas menores que 7.0 e exiba a lista");
        Iterator<Double> iterator2 = grades.iterator();
        while (iterator2.hasNext()) {
            Double next = iterator2.next();
            if (next < 7d)
                iterator2.remove();
        }
        System.out.println(grades);

        System.out.println("Apague toda a lista");
        grades.clear();
        System.out.println(grades);
        System.out.println("A lista está vazia? " + grades.isEmpty());

    }
}
