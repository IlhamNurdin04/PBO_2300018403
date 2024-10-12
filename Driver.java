// Kelas anak ketiga, menginduk ke Person
class Driver extends Person {
    private String license;

    public Driver(String name, int age, String license) {
        super(name, age);
        this.license = license;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I have a " + license + " license.");
    }
}
