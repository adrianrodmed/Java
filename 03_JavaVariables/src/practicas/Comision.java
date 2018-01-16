package practicas;
/* Los meses de enero, julio y octubre... tienes una comisión de 500
en febrero y noviembre ... de 800
el resto de meses... solo 250

el usuario introduce por consola mes que quiere consultar... y muestras
el resultado correspondiente.*/
import java.util.Scanner;

public class Comision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dime un mes del año");
		Scanner month = new Scanner(System.in);
		String mes = month.next();
		switch (mes) {
		case "enero":
		case "julio":
		case "octubre":
			System.out.println("En " + mes + " la comisión es de 500");
			break;
		case "febrero":
		case "noviembre":
			System.out.println("En " + mes + " la comisión es de 800");
			break;
		case "marzo":
		case "abril":
		case "mayo":
		case "junio":
		case "agosto":
		case "septiembre":
		case "diciembre":
			System.out.println("En " + mes + " la comisión es de 250");
		default:
			System.out.println("Introduce un mes válido");

		}
	}

}
