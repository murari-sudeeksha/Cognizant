class Car {
    String make;
    String model;
    int year;

    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void displayDetails() {
        System.out.println("Make : " + make);
        System.out.println("Model: " + model);
        System.out.println("Year : " + year);
    }
}

public class ClassAndObjectCreation {
    public static void main(String[] args) {

        Car c1 = new Car("Toyota", "Innova", 2022);
        Car c2 = new Car("Hyundai", "Creta", 2024);

        c1.displayDetails();
        System.out.println();

        c2.displayDetails();
    }
}