import java.util.Scanner;

public class Invertido {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        Integer numero = scanner.nextInt();
        int invertido = 0;

        while (numero != 0) {
            int digito = numero % 10;       
            invertido = invertido * 10 + digito;
            numero = numero / 10;          
        }

        System.out.println("quedo invertido mh: " + invertido);
        scanner.close();
    }
}

