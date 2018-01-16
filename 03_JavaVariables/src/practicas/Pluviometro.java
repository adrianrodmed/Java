package practicas;
//Durante esta semana ha llovido en litros
//lunes = 15.2
//martes = 7.5
//miercoles = 16.89
//jueves = 0
//viernes = 8.58
//sabado = 7.98
//domigo = 25.6
//muestra la media de litros y el total
public class Pluviometro {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float litros[] = {15.2f, 7.5f, 16.89f, 0f, 8.58f, 7.98f, 25.6f};
		float suma = 0;
		for (int i = 0; i < litros.length; i++) {
			suma = suma + litros[i];
		}
		float media = suma/litros.length;
		System.out.println("El total de litros es: " + suma);
		System.out.println("la media de litros es: "+ media);
	}

}
