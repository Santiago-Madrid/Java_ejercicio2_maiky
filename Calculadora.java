import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el numero de la opcion que desea ver: \n 1. Sumar \n 2. Restar \n 3. Multiplicar \n 4. Dividir ");
        Integer opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
            System.out.println("Deme el primer numero");
                Integer num1 = scanner.nextInt();
                System.out.println("Deme el segundo numero");
                Integer num2 = scanner.nextInt();
                int resultado = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + resultado);
                break;
            case 2:
                System.out.println("Deme el primer numero");
                Integer num1R = scanner.nextInt();
                System.out.println("Deme el segundo numero");
                Integer num2R = scanner.nextInt();
                int resultadoR = num1R - num2R;
                System.out.println(num1R + " - " + num2R + " = " + resultadoR);
                break;
            case 3:
                System.out.println("Deme el primer numero");
                Integer num1M = scanner.nextInt();
                System.out.println("Deme el segundo numero");
                Integer num2M = scanner.nextInt();
                int resultadoM = num1M * num2M;
                System.out.println(num1M + " * " + num2M + " = " + resultadoM);
                break;
            case 4: 
                System.out.println("Deme el primer numero");
                Double num1D = scanner.nextDouble();
                System.out.println("Deme el segundo numero");
                Double num2D = scanner.nextDouble();
                Double resultadoD =  num1D / num2D;
                System.out.println(num1D + " / " + num2D + " = " + resultadoD);
                break;
        
            default:
                System.out.println("ERROR");
                break;
        }
        scanner.close();
    }
}
