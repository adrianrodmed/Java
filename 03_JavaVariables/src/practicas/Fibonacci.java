package practicas;
/*Muestra la serie de Fibonacci hasta lo primeros 20*/
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 0;
		int c;
		System.out.println(b); /*Para que salga el primer número*/
			while(a + b <= 5000) { /*5000 para que sean 20*/
				c = a;
				a = b;
				b = c + a;
				System.out.println(b);
			}
			
			}
		}

	