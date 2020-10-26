/*
 * Realiza un programa que muestre las tablas de multiplicar del 1 hasta el 10.
 */

public class _16_TablasMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int tablaDel=1;tablaDel<=10;tablaDel++) {
			System.out.println("Tabla del "+tablaDel);
			System.out.println("------------");
			for (int numero=1;numero<=10;numero++) {
				System.out.println(tablaDel+"*"+numero+"="+tablaDel*numero);
			}
			System.out.println();
		}
	}

}
