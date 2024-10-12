// Kelas anak kedua, menginduk ke Vehicle
class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, int speed, boolean hasSidecar) {
        super(brand, speed);
        this.hasSidecar = hasSidecar;
    }

    public boolean hasSidecar() {
        return hasSidecar;
    }

    public void setSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}
