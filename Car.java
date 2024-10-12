// Kelas anak pertama, menginduk ke Vehicle
class Car extends Vehicle {
    private int doors;

    public Car(String brand, int speed, int doors) {
        super(brand, speed);  // Memanggil constructor dari induk
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    // Overriding method displayInfo dari induk
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors: " + doors);
    }
}
