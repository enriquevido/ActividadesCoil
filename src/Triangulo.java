public class Triangulo extends FiguraGeometrica{

    private double lado1 = 1.0;
    private double lado2 = 1.0;
    private double lado3 = 1.0;

    Triangulo(){}

    Triangulo(double lado1, double lado2, double lado3, String color, boolean relleno){
        super(color, relleno);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return this.lado1;
    }

    public double getLado2() {
        return this.lado2;
    }

    public double getLado3() {
        return this.lado3;
    }

    public double getArea(){
        double semiperimetro = ((this.lado1 + this.lado2 + this.lado3) / 2);
        return Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
    }

    public double getPerimetro(){
        return this.lado1 + this.lado2 + this.lado3;
    }

    @Override
    public String toString() {
        return ("El triángulo es del color: " + this.getColor() + ". ¿Está relleno?: " + this.estaRelleno() +
                ". Su área es: " + this.getArea() + " y su perimetro: " + this.getPerimetro() + ".");
    }
}
