import java.util.Random;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("______________________");
        System.out.println("Calculadora Aritmética");
        System.out.println("______________________");
        System.out.println("1. Suma (+)");
        System.out.println("2. Resta (-)");
        System.out.println("3. Multiplicación (*)");
        System.out.println("4. División (/)");
        System.out.println("5. Módulo (%)");
        System.out.println("_______________________");

        int repetir;
        do {
            int num1 = random.nextInt(100) + 1;
            int num2 = random.nextInt(100) + 1;

            System.out.println("Números generados: " + num1 + " y " + num2);
            System.out.print("Ingrese un signo aritmético: ");
            String operador = scanner.next();

            switch (operador) {
                case "+":
                    System.out.println("Resultado Suma: " + (num1 + num2));
                    break;
                case "-":
                    System.out.println("Resultado Resta: " + (num1 - num2));
                    break;
                case "*":
                    System.out.println("Resultado Multiplicación: " + (num1 * num2));
                    break;
                case "/":
                    if (num2 != 0) {
                        System.out.println("Resultado División: " + ((double) num1 / num2));
                    } else {
                        System.out.println("Error: División por cero");
                    }
                    break;
                case "%":
                    if (num2 != 0) {
                        System.out.println("Resultado Módulo: " + (num1 % num2));
                    } else {
                        System.out.println("Error: División por cero");
                    }
                    break;
                default:
                    System.out.println("El operador no es válido");
            }

            System.out.print("Deseas realizar otra operación? (1: Sí, 0: No): ");
            repetir = scanner.nextInt();

        } while (repetir == 1);

        scanner.close();
        System.out.print("Cerrando el programa....");
    }
}
