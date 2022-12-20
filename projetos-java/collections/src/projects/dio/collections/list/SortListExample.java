package projects.dio.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListExample {
    public static void main(String[] args) {

        List<Cat> myCats = new ArrayList<Cat>() {
            {
                add(new Cat("Jon", 18, "black"));
                add(new Cat("Simba", 6, "tigrado"));
                add(new Cat("Jon", 12, "amarelo"));
            }
        };
        System.out.println(myCats);

        System.out.println("Ordem de Insercao");
        System.out.println(myCats);

        System.out.println("Ordem Aleatória");
        Collections.shuffle(myCats);
        System.out.println(myCats);

        System.out.println("Ordem Natural");
        Collections.sort(myCats);
        System.out.println(myCats);

        System.out.println("Ordem de idade");
        // Collections.sort(myCats, new ComparatorAge());
        myCats.sort((Comparator<? super Cat>) new ComparatorAge());
        System.out.println(myCats);

        System.out.println("Ordem de cor");
        // Collections.sort(myCats, new ComparatorColor());
        myCats.sort((Comparator<? super Cat>) new ComparatorColor());
        System.out.println(myCats);

        System.out.println("Ordem de Nome/Cor/Idade");
        // Collections.sort(myCats, new ComparatorNameColorAge());
        myCats.sort((Comparator<? super Cat>) new ComparatorNameColorAge());
        System.out.println(myCats);

    }

}

// class Cat
class Cat implements Comparable<Cat> {
    private String name;
    private int age;
    private String color;

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    @Override
    public int compareTo(Cat cat) {
        return this.getName().compareToIgnoreCase(cat.getName());
    }

    // transforms the Class Cat in string
    @Override
    public String toString() {
        return "{" +
                "nome='" + name + '\'' +
                ", idade=" + age +
                ", cor='" + color + '\'' +
                '}';
    }
}

class ComparatorAge implements Comparator<Cat> {

    @Override
    public int compare(Cat c1, Cat c2) {
        return Integer.compare(c1.getAge(), c2.getAge());
    }
}

class ComparatorColor implements Comparator<Cat> {

    @Override
    public int compare(Cat c1, Cat c2) {
        return c1.getColor().compareToIgnoreCase(c2.getColor());
    }

}

class ComparatorNameColorAge implements Comparator<Cat> {

    @Override
    public int compare(Cat c1, Cat c2) {
        int name = c1.getName().compareToIgnoreCase(c2.getName());
        if (name != 0)
            return name;

        int color = c1.getColor().compareToIgnoreCase(c2.getColor());
        if (color != 0)
            return color;

        return Integer.compare(c1.getAge(), c2.getAge());
    }
}
