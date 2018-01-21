package basico;

import java.util.Scanner;

public class Perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("¿Cuántos números perfectos quieres? (max 12, si no... no lo muestra)");
		Scanner num = new Scanner(System.in);
		int numero = num.nextInt();
		int max;
		if(numero == 1) {max = 2;}
		else if(numero == 2) {max = 3;}
		else if(numero == 3) {max = 5;}
		else if(numero == 4) {max = 7;}
		else if(numero == 5) {max = 13;}
		else if(numero == 6) {max = 17;}
		else if(numero == 7) {max = 19;}
		else if(numero == 8) {max = 31;}
		else if(numero == 9) {max = 61;}
		else if(numero == 10) {max = 89;}
		else if(numero == 11) {max = 107;}
		else if(numero == 12) {max = 127;}
		else {max = 0;
			System.out.println("Lo siento este número perfecto es demasiado grande");}
		int cnt = 0;
		boolean primo;

		for(int i = 2; i <= max; i++) {
			double a = Math.pow(2, i - 1);
			double b = (Math.pow(2, i) - 1);
			double c = a * b;
			
			for(int j = 2; j <= b ; j++){
				primo = true;
				
				for(int k = 2; k < j; k++) {
					if(j % k == 0){
						primo = false;}
					}
	         if(primo){
	        	 //System.out.println(b + " es número primo de Mersenne");
	        	 System.out.println(c + " es número perfecto");
	              cnt ++;
	              break;
	              }
	         else {cnt = 0;}
	         }
			}
		}
	}
