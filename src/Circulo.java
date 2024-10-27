class Circulo extends FiguraGeometrica {
    private double radio;

    Circulo() {}

    Circulo(double radio){
        this.radio = radio;
    }

    Circulo(double radio, String color, boolean relleno){
        super(color, relleno);
        this.radio = radio;
    }

    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double getArea() {
        return  Math.PI * (this.radio * this.radio);
    }

    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    public double getDiametro(){
        return this.radio * 2;
    }

    @Override 
    public String toString() {
        return ("El círculo es del color: " + this.getColor() + ". ¿Está relleno?: " + this.estaRelleno() +
                ". Su área: " + this.getArea() + ", perímetro: " + this.getPerimetro() + " y diametro: " + this.getDiametro() + ".");
    }
}
