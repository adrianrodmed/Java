package practicas;

import java.util.Scanner;

/*Por consola te pregunta... la capital de Italia. hasta que no digas roma... no deja de preguntarte.*/
public class Italia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			boolean si;
			do{
				System.out.println("¿Cúal es la capital de Italia?");
				Scanner capital = new Scanner(System.in);
				String cap = capital.next();
				if(cap.equals("Roma")||cap.equals("roma")) {
					System.out.println("Correcto");
					si = true;
				}
				else {
					System.out.println("Incorrecto");
					si = false;}
			}
			while(si == false);
	}

	
}
