public class Amphibian extends Vehicle implements WheeledEngine, JetPropulsionEngine{
    private String amphibianType;

    Amphibian(int power, int year, String brand, String amphibianType) {
        super(power, year, brand);
        this.amphibianType = amphibianType;
    }

    public String getAmphibianType() {
        return this.amphibianType;
    }

    public String pathProgramming(){
        return "Calculating path";
    }

    @Override
    public String moveWheels() {
        return "Moving wheels forward";
    }

    @Override
    public String moveJetPropulsion(String jetPropulsion) {
        return "Moving jet propulsion forward";
    }

    public String toString() {
        return ("El vehículo anfibio es de tipo: " + getAmphibianType() + ", tiene la potencia: " + this.getPower() +
                ", es del año: " + getYear() + " y de la marca: " + getBrand());
    }
}
