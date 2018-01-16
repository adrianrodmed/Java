package practicas;

import java.util.Scanner;

/*Muestra por consola, los 20 primeros numeros pares*/
public class Pares {

	public static void main(String[] args) {
		System.out.println("¿Cuántos números pares quieres?");
		Scanner num = new Scanner(System.in);
		int numero = num.nextInt();
		System.out.println("¿Donde quieres empezar?");
		Scanner ini = new Scanner(System.in);
		int inicio = ini.nextInt();
		// TODO Auto-generated method stub
		int[] pares = new int[numero];
		for(int i = 0; i < pares.length; i++) {
			pares[i] = 2 * ((inicio + 1)/2 + i);
			System.out.println(pares[i]);
		}
	}
}
