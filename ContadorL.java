import java.util.Scanner;

public class ContadorL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame una frase ");
        String frase = scanner.nextLine();
        System.out.println("Dame una letra ");
        String letra = scanner.nextLine();
        int contador = 0;
        for(int i = 0; i < frase.length(); i++){
            if(Character.toLowerCase(frase.charAt(i)) == Character.toLowerCase(letra.charAt(0))){
                contador++;
            }
        }
        System.out.println("La letra " + letra + " aparece " + contador + " veces.");
        scanner.close();
    }
}
