// Kelas Main
public class Main {
    public static void main(String[] args) {
        // Encapsulation & Constructor Overloading in action
        Car car = new Car("Toyota", 120, 4);
        Motorcycle motorcycle = new Motorcycle("Yamaha", 90, true);
        Driver driver = new Driver("John", 30, "B");

        // Inheritance & Polymorphism: Using Vehicle reference for Car and Motorcycle
        Vehicle vehicle1 = car;
        Vehicle vehicle2 = motorcycle;

        // Overriding and dynamic method dispatch
        vehicle1.displayInfo();
        vehicle2.displayInfo();

        // Polymorphism: Using Person reference for Driver
        Person person = driver;
        person.introduce();

        // Setter dan Getter
        car.setSpeed(150);
        System.out.println("Updated car speed: " + car.getSpeed());

        // Overloading method
        motorcycle.accelerate();
        motorcycle.accelerate(15);
    }
}
