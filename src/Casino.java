import java.util.Scanner;
import java.util.Random;

public class Casino {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        double dinero = 0;

        while (true) {
            System.out.print("Ingresa tu cantidad inicial de dinero: ");
            if (scanner.hasNextInt()) {
                dinero = scanner.nextInt();
                if (dinero > 0) break;
                System.out.println("Debe ser un número positivo");
            } else {
                System.out.println("Error: Ingresa solo números.");
                scanner.next();
            }
        }
        scanner.nextLine();

        boolean jugando = true;

        while (jugando && dinero > 0) {
            System.out.println("Saldo actual: " + dinero);
            System.out.print("Presiona Enter para jugar...");
            scanner.nextLine();

            int resultado = random.nextInt(3) + 1;

            switch(resultado) {
                case 3:
                    dinero = 0;
                    System.out.println("Salio 3. Has perdido todo");
                    jugando = false;
                    break;

                case 2:
                    dinero /= 2;
                    System.out.println("Salió 2. Pierdes la mitad");
                    System.out.print("Seguir jugando? (Si/No): ");
                    jugando = scanner.nextLine().equalsIgnoreCase("Si");
                    break;

                case 1:
                    dinero *= 2;
                    System.out.println("Salio 1. Duplicaste tu dinero");
                    System.out.print("Seguir jugando? (Si/No): ");
                    jugando = scanner.nextLine().equalsIgnoreCase("Si");
                    break;
            }
        }

        System.out.println("Dinero final: " + dinero);
        scanner.close();
    }
}