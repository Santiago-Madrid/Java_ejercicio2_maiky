import java.util.Scanner;

public class Grados {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("ingresa una temperatura: ");
         Integer grados = scanner.nextInt();
         double farenheit = (grados * 9/5 ) + 32;
         System.out.println(" Sus grados en fahrenheit son: " + farenheit);
         double kelvin = grados+273.15;
         System.out.println(" Sus grados en kelvin son: " + kelvin);
         scanner.close();
    }

}