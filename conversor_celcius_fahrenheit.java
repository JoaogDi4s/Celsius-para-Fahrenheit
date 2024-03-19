package exercicio_operadores_aritmeicos;

import java.util.Scanner;

public class conversor_celcius_fahrenheit {
			public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			// valor em Celsius
			System.out.println("Insira a temperatura em Celsius:");
			int n1 = scan.nextInt();
					
			System.out.println("\nA temperatura em Celsius é " + (n1));
			System.out.println("A temperatura em Fahrenheit é " + (n1*1.8+32));

		        scan.close();
			}
}


