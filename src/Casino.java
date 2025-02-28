
import java.util.Random;
import java.util.Scanner;

            public class Casino {
                public static void main(String[] args) {
                    Scanner teclado = new Scanner(System.in);
                    Random ale = new Random();
                    System.out.println("-------------------------------------------------");
                    System.out.println("               APUESTA Y GANA");
                    System.out.println("-------------------------------------------------");
                    System.out.println("Normativas:");
                    System.out.println("1. Si te sale el número 3, Pierdes TODO.");
                    System.out.println("2. Si te sale el número 2, Pierdes la mitad.");
                    System.out.println("3. Si te sale el número 1, Duplicas tu dinero.");
                    System.out.println("-------------------------------------------------");
                    System.out.println("    Ingresa tu cantidad inicial de dinero: ");
                    double dinero = teclado.nextDouble();
                    System.out.println("Saldo actual: " + dinero);
                    int numero=0;
                    int desicion=0;
                    do{
                        numero = ale.nextInt((3 - 1 + 1)) + 1;
                        System.out.println("El numero es: "+numero);
                        if (numero==1){
                            dinero=dinero*2;
                            System.out.println("Se te multiplico x2, ahora tienes: $"+dinero);
                        }else if(numero==2){
                            dinero=dinero/2;
                            System.out.println("Ahora tienes la mitad del dinero: $"+dinero);
                        }else{
                            System.out.println("Perdiste todo tu dinero");
                            break;
                        }
                        System.out.println("¿Quieres continuar? (1 Si/2 No)");
                        desicion = teclado.nextInt();
                    }while(desicion==1);

                }
            }