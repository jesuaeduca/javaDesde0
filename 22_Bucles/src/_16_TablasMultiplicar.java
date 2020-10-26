/*
 * Realiza un programa que muestre las tablas de multiplicar del 1 hasta el 10.
 */

public class _16_TablasMultiplicar {

	public static void main(String[] args) {
		// Ejemplo de bucle anidado, un bucle dentro de otro
		// Bucle externo, para las tablas de multiplicar, 1..10
		for (int tablaDel=1;tablaDel<=10;tablaDel++) {
			System.out.println("Tabla del "+tablaDel);
			System.out.println("------------");
			// Bucle interno, lo va a ejecutar para cada tabla, y es por cada número que queremos multiplicar, 1..10 
			for (int numero=1;numero<=10;numero++) {
				System.out.println(tablaDel+"*"+numero+"="+tablaDel*numero);
			}
			// Esto separa las tablas entre si 
			System.out.println();
		}
	}

}
