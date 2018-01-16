package basico;

import org.omg.Messaging.SyncScopeHelper;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short edad = 18;
		int numero = 1200;
		long largo = 5000;
		float precio = 7.5f;
		double precision = 1.123456;
		char descuento = 'y';
		String nombre = "Juan";
		boolean estudia = true;
		String[] ciudades = new String[5];
		System.out.println(edad);
		ciudades[0] = "Madrid";
		ciudades[1] = "Valencia";
		ciudades[2] = "Sevilla";
		/*ciudades[3] = "Barcelona";
		ciudades[4] = "Zaragoza";*/
		for(int i = 0; i < ciudades.length; i++) {
			System.out.println(i+1 + ".-" + ciudades[i]);
		}
	}

}
