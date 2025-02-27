import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int max = 50;
        int min = 1;
        int i = 1;
        int numeros;
        int adivinado;
        int numeroadivinado = 0;
        int numerorandom = 0;
        Random numero = new Random();
        numeros = numero.nextInt((max - min + 1)) + min;
        numerorandom += numeros;
        System.out.println("Inserte el Número: ");
        while (i <= 3) {
            Scanner intento = new Scanner(System.in);
            adivinado = intento.nextInt();
            System.out.println("Inserte el Número: ");
            if (adivinado == numerorandom) {
                System.out.println("Número Adivinado!");
                break;
            } else {
                i++;
            }
        }
    }
}