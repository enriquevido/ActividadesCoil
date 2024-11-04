public abstract class Vehicle {
    protected int power;
    protected int year;
    protected String brand;

    Vehicle(){}

    Vehicle(int power, int year, String brand) {
        this.power = power;
        this.year = year;
        this.brand = brand;
    }

    public int getPower() {
        return this.power;
    }

    public int getYear() {
        return this.year;
    }

    public String getBrand() {
        return this.brand;
    }

    public String toString() {
        return ("El vehículo tiene la potencia: " + this.getPower() +
                ", es del año: " + getYear() + " y de la marca: " + getBrand());
    }
}
