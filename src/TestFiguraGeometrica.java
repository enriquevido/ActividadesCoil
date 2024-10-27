import java.util.Scanner;

public class TestFiguraGeometrica {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int eleccion;

        System.out.println("Bienvenido al creador de Figuras Geometricas.");

        do {
            System.out.println("Introduce la figura geometrica que quieras crear: ");
            System.out.println("1) Circulo. \n2) Rectángulo. \n3) Triángulo. \n4) Salir.");

            eleccion = input.nextInt();
            switch (eleccion) {
                case 1:
                    System.out.print("Ingrese el radio de su círculo: ");
                    double radio = input.nextDouble();

                    System.out.print("Ingrese el color de su círculo: ");
                    String colorCirculo = input.next();

                    System.out.println("¿El círculo está relleno?: \n1) Si. \n2)No.");
                    int rellenoCirculo = input.nextInt();

                    Circulo circulo = new Circulo(radio, colorCirculo, (rellenoCirculo == 1));
                    System.out.println(circulo.toString());
                    break;

                case 2:
                    System.out.print("Ingrese la base de su rectangulo: ");
                    double base = input.nextDouble();

                    System.out.print("Ingrese la altura de su rectangulo: ");
                    double altura = input.nextDouble();

                    System.out.print("Ingrese el color de su círculo: ");
                    String colorRectangulo = input.next();

                    System.out.println("¿El círculo está relleno?: \n1) Si. \n2) No.");
                    int rellenoRectangulo = input.nextInt();

                    Rectangulo rectangulo = new Rectangulo(base, altura, colorRectangulo, (rellenoRectangulo == 1));
                    System.out.println(rectangulo.toString());
                    break;

                case 3:
                    System.out.print("Ingrese el lado 1 del triángulo: ");
                    double lado1 = input.nextDouble();

                    System.out.print("Ingrese el lado 2 del triángulo: ");
                    double lado2 = input.nextDouble();

                    System.out.print("Ingrese el lado 3 del triángulo: ");
                    double lado3 = input.nextDouble();

                    System.out.print("Ingrese el color de su triángulo: ");
                    String colorTriangulo = input.next();

                    System.out.println("¿El triángulo está relleno?: \n1) Si. \n2) No.");
                    int rellenoTriangulo = input.nextInt();

                    Triangulo triangulo = new Triangulo(lado1, lado2, lado3, colorTriangulo, (rellenoTriangulo == 1));
                    System.out.println(triangulo.toString());
                    break;

                case 4:
                    System.out.println("Chaoo.");
                    break;

                default:
                    System.out.println("Opción no valida.");
                    break;
            }
        } while (eleccion != 4);
    }
}
