package Viernes;

import java.util.Scanner;

public class pedir5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        while (numero >= 0 || numero <= 5) {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();

            if (numero < 0 && numero > -5) {
                break;
            }
        }

        System.out.println("Ha ingresado un número negativo mayor a 5. Fin del programa.");
        scanner.close();
        
    }
}
