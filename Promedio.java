import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = new int[5];
        for(int i = 0; i<=4;i++){
            System.out.println("ingresa un numero;");
            Integer num = scanner.nextInt();
            array[i]=num;
        }
        int acomulador=0;
        for(int j=0; j<=4;j++){
            acomulador+=array[j];
        }
        System.out.println("Su suma: " + acomulador);
        scanner.close();
    }

}

