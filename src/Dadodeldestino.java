import java.util.Random;
import java.util.Scanner;

public class Dadodeldestino {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random ale = new Random();
        int puntos = 0;
        int vidas = 5;
        int rondas = 1;
        int dado;
        int max = 6;
        int min = 1;
        int desicion = 1;
        Random dados = new Random();
        dado = dados.nextInt((max - min));
        System.out.println("");
        System.out.println("-------- INFORMACIÓN --------");
        System.out.println("      Dados del destino      ");
        System.out.println("-----------------------------");
        System.out.println("Reglamento:");
        System.out.println("Saca 1 | Pierde una Vida.");
        System.out.println("Saca 2 o 4 | Gana 1 Punto.");
        System.out.println("Saca 3 o 5 | No pasa nada.");
        System.out.println("Saca 6 | Gana 3 Puntos.");
        System.out.println("-----------------------------");
        System.out.println("El juego terminara cuando");
        System.out.println("llegues a 10 puntos o 0 vidas");
        System.out.println("-----------------------------");
        System.out.println("");
            do {
                switch (dado) {
                    case 1:
                        System.out.println("¡Has perdido una vida!");
                        vidas = vidas - 1;
                        System.out.println("Has sacado 1 y tienes actualmente " + vidas + " Vidas");
                        System.out.println("Has sacado 1 y tienes actualmente " + puntos + " Puntos");
                        System.out.println("Continuar (1 Si/2 No)");
                        desicion = teclado.nextInt();
                        rondas = rondas + 1;
                        System.out.println("Ronda número | " + rondas);
                    case 2:
                        System.out.println("¡Has ganado 1 punto!");
                        puntos = puntos + 1;
                        System.out.println("Has sacado 2 y tienes actualmente " + vidas + " Vidas");
                        System.out.println("Has sacado 2 y tienes actualmente " + puntos + " Puntos");
                        System.out.println("Continuar (1 Si/2 No)");
                        desicion = teclado.nextInt();
                        rondas = rondas + 1;
                        System.out.println("Ronda número | " + rondas);
                    case 3:
                        System.out.println("¡No ha pasado nada!");
                        System.out.println("Has sacado 3 y tienes actualmente " + vidas + " Vidas");
                        System.out.println("Has sacado 3 y tienes actualmente " + puntos + " Puntos");
                        System.out.println("Continuar (1 Si/2 No)");
                        desicion = teclado.nextInt();
                        rondas = rondas + 1;
                        System.out.println("Ronda número | " + rondas);
                    case 4:
                        System.out.println("¡Has ganado 1 punto!");
                        puntos = puntos + 1;
                        System.out.println("Has sacado 4 y tienes actualmente " + vidas + " Vidas");
                        System.out.println("Has sacado 4 y tienes actualmente " + puntos + " Puntos");
                        System.out.println("Continuar (1 Si/2 No)");
                        desicion = teclado.nextInt();
                        rondas = rondas + 1;
                        System.out.println("Ronda número | " + rondas);
                    case 5:
                        System.out.println("¡No ha pasado nada!");
                        System.out.println("Has sacado 5 y tienes actualmente " + vidas + " Vidas");
                        System.out.println("Has sacado 5 y tienes actualmente " + puntos + " Puntos");
                        System.out.println("Continuar (1 Si/2 No)");
                        desicion = teclado.nextInt();
                        rondas = rondas + 1;
                        System.out.println("Ronda número | " + rondas);
                    case 6:
                        System.out.println("¡Has ganado 3 puntos!");
                        puntos = puntos + 3;
                        System.out.println("Has sacado 6 y tienes actualmente " + vidas + " Vidas");
                        System.out.println("Has sacado 6 y tienes actualmente " + puntos + " Puntos");
                        System.out.println("Continuar (1 Si/2 No)");
                        desicion = teclado.nextInt();
                        rondas = rondas + 1;
                        System.out.println("Ronda número | " + rondas);
                    default:
                        System.out.print("");
                }
            } while (vidas > 0 && puntos < 10);
            if (puntos > 10) {
                System.out.println("HAS GANADO POR TENER MAS DE 10 PUNTOS");
            } else {
                System.out.println("HAS PERDIDO POR TENER 0 VIDAS");
            }
        }
    }

