package basico;

import java.util.Scanner;

public class Prueba {
	public static boolean Primos(double n) {
		int sum = 0;
		for(int i = 2; i < (n+1); i++) {
			if(n % i == 0) {
				sum = sum + i;}
			}
			if(sum == n) {return true;}
		return false;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		double a, b, c;
		System.out.println("¿Cuántos números perfectos quieres? (max 7, y dando gracias)");
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
		//else if(numero == 8) {max = 31;}
		//else if(numero == 9) {max = 61;}
		//else if(numero == 10) {max = 89;}
		//else if(numero == 11) {max = 107;}
		//else if(numero == 12) {max = 127;}
		else {max = 0;
			System.out.println("Lo siento este número perfecto es demasiado grande");}
		for(int i = 2; i <= max; i++) {
			a = Math.pow(2, i - 1);
			b = (Math.pow(2, i) - 1);
			c = a * b;
			if(Primos(b) == true){//System.out.println(b + " es primo");
			System.out.println(c + " es un número perfecto");
			}
	        else {//System.out.println(b + "no es primo");
	        	}
	        }
			}
		}

