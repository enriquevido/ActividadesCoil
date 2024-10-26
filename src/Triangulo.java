public class Triangulo extends FiguraGeometrica{

    private double lado1 = 1.0;
    private double lado2 = 1.0;
    private double lado3 = 1.0;

    Triangulo(){}

    Triangulo(double lado1, double lado2, double lado3){
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
        return "Lado 1: " + this.lado1 + ". Lado 2: " + this.lado2 + ". Lado 3: " + this.lado3;
    }
}
