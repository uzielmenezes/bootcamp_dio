package project.bootcamp;

public class RunCar {

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.setColor("Azul");
        car1.setModel("BMW");
        car1.setCapacity(60);

        System.out.println(car1.getColor());
        System.out.println(car1.getModel());
        System.out.println(car1.getCapacity());
        System.out.println(car1.totalCapacityValue(6.7));

        Car car2 = new Car("Cinza", "Mustang", 65);

        System.out.println(car2.getColor());
        System.out.println(car2.getModel());
        System.out.println(car2.getCapacity());
        System.out.println(car2.totalCapacityValue(7.9));

    }

}
