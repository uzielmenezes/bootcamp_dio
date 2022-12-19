package project.bootcamp;

public class Car {

    String color;
    String model;
    int capacity;

    Car() {

    }

    Car(String color, String model, int capacity) {

        this.color = color;
        this.model = model;
        this.capacity = capacity;
    }

    void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return color;
    }

    void setModel(String model) {
        this.model = model;
    }

    String getModel() {
        return model;
    }

    void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    int getCapacity() {
        return capacity;
    }

    double totalCapacityValue(double fuelValue) {
        return this.capacity * fuelValue;
    }

}
