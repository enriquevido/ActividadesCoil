public class Rectangulo extends FiguraGeometrica{

    private double base;
    private double altura;

    Rectangulo(){}

    Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    Rectangulo(double base, double altura, String color, boolean relleno){
        this.base = base;
        this.altura = altura;
        setColor(color);
        setRelleno(relleno);
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
        return ("Base: " + this.base + ". Altura: " + this.altura + ". Area: "
                + this.getArea() + ". Perimetro: " + this.getPerimetro());
    }


}
