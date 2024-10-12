// Kelas induk pertama
class Vehicle {
    private String brand;
    private int speed;

    // Constructor overloading
    public Vehicle() {
        this.brand = "Unknown";
        this.speed = 0;
    }

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Setter and getter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Method yang bisa di override
    public void displayInfo() {
        System.out.println("Vehicle Brand: " + brand + ", Speed: " + speed);
    }

    // Overloading method
    public void accelerate() {
        this.speed += 10;
        System.out.println("Vehicle accelerates. New speed: " + this.speed);
    }

    public void accelerate(int increase) {
        this.speed += increase;
        System.out.println("Vehicle accelerates by " + increase + ". New speed: " + this.speed);
    }
}
