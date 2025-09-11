import java.util.Scanner;

public class Descendente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite un numero: ");
        Integer numero = scanner.nextInt();
        System.out.println("------------------------");
        int numero2 = numero;
        for(int i = 1; i<=numero;i++){
            System.out.println(numero2);
            numero2 -= 1;
        }
        scanner.close();
    }
}
