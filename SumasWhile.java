package Viernes;

import java.util.Scanner;

public class SumasWhile {
//Calculará la suma de los dígitos de un número ingresado por el usuario utilizando un bucle while
	
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("¿Cuantos numeros vamos a sumar entre si? : ");
	        int cantidad = scanner.nextInt();
	        
	        int [] numero = new int [cantidad];
	        int i = 0;
	        int suma = 0;

	        
	        while( i < cantidad) {
	            System.out.println("Ingresa un numero: ");
	            numero[i] = scanner.nextInt();
	            suma += numero[i];
	            i++;
	        }
	        
	        System.out.println("La suma de los dígitos es: " + suma);



	    }
	}
