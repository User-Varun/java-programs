// Demonstrating the concept of a class in Java
class Car {
    // Attributes (fields)
    String brand;
    String color;
    int speed;

    // Constructor to initialize the Car object
    Car(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    // Method to display car details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed + " km/h");
    }

    // Method to accelerate the car
    void accelerate(int increment) {
        speed += increment;
        System.out.println(brand + " accelerated. New speed: " + speed + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects of the Car class
        Car car1 = new Car("Toyota", "Red", 120);
        Car car2 = new Car("Honda", "Blue", 100);

        // Displaying details of each car
        System.out.println("Car 1 Details:");
        car1.displayDetails();

        System.out.println("\nCar 2 Details:");
        car2.displayDetails();

        // Accelerating the cars
        System.out.println("\nAccelerating Car 1:");
        car1.accelerate(20);

        System.out.println("\nAccelerating Car 2:");
        car2.accelerate(30);
    }
}
