import java.util.Scanner;

public class ContadorDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite el numero que usted quiera: ");
        Integer numero = scanner.nextInt();
        String numeroC = String.valueOf(numero);
        int contadorD = numeroC.length();
        System.out.println("Los digitos que tiene su numero son: " + contadorD);
        scanner.close();
    }
}