package practicas;

import java.util.Scanner;

/*Pide al usuario una ruta (A, B, C, D, E)
En cada ruta... muestra por consola.. un mensaje con la fecha de
inicio y el precio (estos datos te los inventas tu)*/
public class Ruta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dime una ruta (a, b, c, d o e)");
		Scanner route = new Scanner(System.in);
		String ruta = route.next();
		switch (ruta) {
		case "a":
		case "A":
			System.out.println("Empieza el 1/1/12018 a las 12:00 y cuesta 4€");
			break;
		case "b":
		case "B":
			System.out.println("Empieza el 2/1/12018 a las 14:00 y cuesta 8€");
			break;
		case "c":
		case "C":
			System.out.println("Empieza el 3/1/12018 a las 16:00 y cuesta 12€");
			break;
		case "d":
		case "D":
			System.out.println("Empieza el 4/1/12018 a las 18:00 y cuesta 16€");
			break;
		case "e":
		case "E":
			System.out.println("Empieza el 5/1/12018 a las 20:00 y cuesta 20€");
			break;
		default:
			System.out.println("La ruta especificada no existe");
		}
	}

}
