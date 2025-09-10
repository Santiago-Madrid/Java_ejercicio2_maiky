import java.util.Scanner;

public class ContadorVocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("dame una palabra");
        String palabra = scanner.nextLine();
        int vocales = 0;
        int letras = 0;
        for(int i = 0; i < palabra.length(); i++){
            char c = Character.toLowerCase(palabra.charAt(i));
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                vocales+=1;
            }else{
                letras+=1;
            }
        }
        System.out.println("las vocales que tiene esta palabra son: " + vocales);
        System.out.println("las letras que tiene esta palabra son: " + letras);
        scanner.close();
    }
}
