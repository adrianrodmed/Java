package practicas;

import java.util.Scanner;

/* Por consola te pregunto cuántas unidades quieres de camisas. cuando me lo digas ... te detallo la factura.

subtotal = numero de camisas * 9.95 (este precio es el nuestro)
Iva = subtotal * 21 %
total = subtotal + cuota iva*/
public class Factura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("¿Cuántas camisas quieres?");
			Scanner unidades = new Scanner(System.in);
			int units = unidades.nextInt();
			float price = 9.95f;
			float descuento = 0.21f;
			float subtotal = units*price;
			float iva = subtotal*descuento;
			float total = subtotal + iva;
			System.out.println("El número de camisas elegido es: " + units);
			System.out.println("El precio sin I.V.A es: " + subtotal);
			System.out.println("El I.V.A es: " + iva);
			System.out.println("El precio a pagar es: " + total);
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Mete un número entero");
			/*e.printStackTrace();*/
	}

}
}
