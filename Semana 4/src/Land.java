public class Land extends Vehicle implements WheeledEngine{
    private short vehicleType;
    private City city;


    Land(int power, int year, String brand, short vehicleType, City city) {
        super(power, year, brand);
        this.vehicleType = vehicleType;
        this.city = city;

    }

    Land(short vehicleType, City city) {
        this.vehicleType = vehicleType;
        this.city = city;
    }

    public short getVehicleType() {
        return this.vehicleType;
    }

    public City getCity() {
        return this.city;
    }


    @Override
    public String moveWheels() {
        return "Moving wheels forward";
    }

    public String toString() {
        return ("El vehículo terrestre es de tipo: " + getVehicleType() + ", de la ciudad: " + getCity()
                + ", tiene la potencia: " + this.getPower() + ", es del año: " + getYear() + " y de la marca: " + getBrand());
    }
}
