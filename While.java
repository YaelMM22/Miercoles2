package Viernes;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        int factorial = 1;
        int i = 1;

        if (numero < 0) {
            System.out.println("No se puede calcular el factorial de un número negativo.");
        } else {
            do {
                factorial *= i;
                i++;
            } while (i <= numero);

            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
    }
}
