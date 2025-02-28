import java.util.Random;
public class Dados {
    public static void main(String[] args) {
        int max = 10;
        int min = 1;
        int contador1 = 0;
        int contador2 = 0;
        int rondas;
        Random ronda = new Random();
        rondas = ronda.nextInt((max - min + 1)) + min;
        System.out.println("-----------------------------------");
        System.out.println("Rondas: " + rondas);
        System.out.println("-----------------------------------");
        int rondadado = rondas;
        for(int i = 1; i <= rondas; i++) {
            int dado1;
            int dado2;
            Random dados = new Random();
            dado1 = dados.nextInt((max - min + 1)) + min;
            contador1 += dado1;
            dado2 = dados.nextInt((max - min - 6)) + min;
            contador2 += dado2;
            System.out.println("Ronda " + i + " Dado 1: " + dado1 + "  | Ronda " + i + " Dado 2: " + dado2);
        }
        System.out.println("-----------------------------------");
        System.out.println("Total 1: " + contador1);
        System.out.println("Total 2: " + contador2);
        System.out.println("-----------------------------------");
        if(contador1 <= contador2){
            System.out.println("DADO 2 GANADOR");
            System.out.println("-----------------------------------");
        } else {
            System.out.println("DADO 1 GANADOR");
            System.out.println("-----------------------------------");
        }
    }
}