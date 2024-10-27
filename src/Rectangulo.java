class Rectangulo extends FiguraGeometrica{

    private double base;
    private double altura;

    Rectangulo(){}

    Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    Rectangulo(double base, double altura, String color, boolean relleno){
        super(color, relleno);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea(){
        return this.base * this.altura;
    }

    public double getPerimetro(){
        return ((this.base + this.altura)* 2);
    }

    public String toString(){
        return ("El rectángulo es del color: " + this.getColor() + ". ¿Está relleno?: " + this.estaRelleno() +
                ". Su área es: " + this.getArea() + " y su perimetro: " + this.getPerimetro());
    }


}
