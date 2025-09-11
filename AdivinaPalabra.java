import java.util.Scanner;

public class AdivinaPalabra {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        String palabraS =  "anuel";
        boolean verificacion = true;

        while (verificacion) {
            System.out.println("Intenta ");
            String intento = scanner.nextLine();

            if(intento.equalsIgnoreCase(palabraS)) {
                System.out.println("ADIVINO: " + palabraS);
                verificacion = false;
            }
        }

        scanner.close();
    }
}
