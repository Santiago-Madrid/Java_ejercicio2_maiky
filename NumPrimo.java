import java.util.Scanner;

public class NumPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número positivo: ");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("ERROR número negativo mh ");
        } else {
            boolean esPrimo = true;

            if (numero == 1) {
                esPrimo = false; 
            } else {
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }

            if (esPrimo) {
                System.out.println(numero + " es un número primo.");
            } else {
                System.out.println(numero + " NO es un número primo.");
            }
        }

        scanner.close();
    }
}

