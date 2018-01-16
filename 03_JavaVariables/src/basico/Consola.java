package basico;

import java.util.Scanner;

public class Consola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Dime un número entero:");
			Scanner entrada = new Scanner(System.in);
			int dato = entrada.nextInt();
			System.out.println("Has dicho " + dato);
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Mete un número entero cachondo");
			/*e.printStackTrace();*//*Esto te saca la pila de error*/
		}
	}

}