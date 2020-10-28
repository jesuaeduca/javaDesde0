import java.util.Scanner;

/*
 * Realiza un programa que muestre una figura del siguiente tipo:
 	*
 	**
 	***
 	****
 * El número de elementos de la base y el carácter con el que pintar la figura se deben pedir por teclado.
 */

public class _17_LaFigura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		String caracter;
		// Bucle para leer el caracter para pintar
		do {
			System.out.print("Introduce el caracter con el que pintar: ");
			// Leemos el caracter 
			caracter=entrada.nextLine();
			// Pero sólo queremos continuar si hemos leido uno y solo un carácter. 
			// Comprobamos la longitud de la cadena leida
		} while (caracter.length()!=1);
		// Leemos el número de elementos de la base
		// Hacemos un bucle infinito
		while (true) {
			System.out.print("Introduce el número de elementos de la base:");
			// Leemos, y si no es un entero
			if (!entrada.hasNextInt()) {
				// Mostramos un mensaje de error
				System.out.println("No has introducido un número");
				// Y desechamos lo leido
				entrada.next();
			}
			// Si es un entero, nos salimos del bucle infinito
			else break;
		} 
		// Aquí sabemos que es un entero lo que hay para obtener
		int base=entrada.nextInt();
		entrada.close();
		// Bucle para el número de líneas
		// i es el número de líneas
		for (int i=0;i<=base;i++) {
			// j es el número de caracteres para esa línea, y tenemos que pintar hasta llegar al mismo número que i, 
			// en la línea 1, se pinta 1, en la línea 2 se pintan 2, ...
			for (int j=0;j<i;j++) {
				System.out.print(caracter);
			}
			// Después de pintar los caracteres de la línea, saltamos a la siguiente
			System.out.println();
		}
	}

}
