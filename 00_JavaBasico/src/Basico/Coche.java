/**
 * 
 */
package Basico;

/**
 * @author Curso mañana
 *
 */
public class Coche {
	public static String mensaje; /*static sirve para convertir una variable local a global*//*public es para cambiar el ámbito de la variable (poder usarla dentro o fuera del método)*/
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola Champion");
		String ciudad = "Madrid";
		System.out.println("Bienvenido a " + ciudad);
		int numero1 = 10;
		int numero2 = 3;
		int solucion1 = numero1 * numero2;
		int solucion2 = numero1 / numero2;
		System.out.println("La multiplicación es: " + solucion1);
		System.out.println("La división es: " + solucion2); /*Nos da mal porque esta declarado como int*/
		char inicial = 'a';
		boolean descuento = true;
		float precio = 15.2f;/*la f es para indicar que es un float acotando el conjunto de decimales*/
		double precision = 1.123456;
		int unidades = 10;
		float total = unidades*precio;
		System.out.println("El total es: " + total);
		if(unidades < 10) {
			mensaje = "Pocas unidades";}
		else {
			mensaje = "Gracias por su compra";}
		System.out.println(mensaje);
	}

}
