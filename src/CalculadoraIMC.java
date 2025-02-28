import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String respuesta;

        do {
            System.out.print("Ingrese su peso en kilogramos: ");
            double peso = scanner.nextDouble();
            System.out.print("Ingrese su estatura en metros: ");
            double estatura = scanner.nextDouble();

            double imc = peso / (estatura * estatura);
            System.out.printf("Su IMC es: %.2f | ", imc);

            if (imc < 18.5) {
                System.out.println("Tiene: Bajo Peso");
            } else if (imc <= 24.9) {
                System.out.println("Tiene: Normopeso");
            } else if (imc <= 26.9) {
                System.out.println("Tiene: Sobrepeso Grado I");
            } else if (imc <= 29.9) {
                System.out.println("Tiene: Sobrepeso Grado II");
            } else if (imc <= 34.9) {
                System.out.println("Tiene: Obesidad de tipo I");
            } else if (imc <= 39.9) {
                System.out.println("Tiene: Obesidad de tipo II");
            } else if (imc <= 49.9) {
                System.out.println("Tiene: Obesidad de Tipo III (Mórbida)");
            } else {
                System.out.println("Tiene: Obesidad de tipo IV (Extrema)");
            }

            System.out.print("Deseas realizar otro cálculo? (Si/No): ");
            respuesta = scanner.next();

        } while (respuesta.equalsIgnoreCase("Si"));

        scanner.close();
    }
}
