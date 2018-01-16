package practicas;

import java.util.Scanner;

public class Venta {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("¿Cuantas unidades quieres?");
			Scanner unidades = new Scanner(System.in);
			int units = unidades.nextInt();
			System.out.println("¿A que precio lo quieres?");
			Scanner precio = new Scanner(System.in);
			float price = precio.nextFloat();
			float total = units * price;
			System.out.println("Me debes: " + total);
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Mete un número con , cachondo");
			/*e.printStackTrace();*//*Esto te saca la pila de error*/
		}
	}

}
