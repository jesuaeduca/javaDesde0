/*
 * Realiza un programa que muestre el factorial de un número que se lee desde teclado.
 */
import java.util.Scanner;

public class _20_Factorial {

	public static void main(String[] args) {
		// Utilizo Scanner para la lectura
		Scanner entrada=new Scanner(System.in);
		// Bucle infinito para comprobar que leo un número correcto
		while (true) {
			System.out.print("Introduce el número a calcular el factorial:");
			// Comprobación que hay algo distinto a entero para leer
			if (!entrada.hasNextInt()) {
				System.out.println("No has introducido un número");
				// Desecho la entrada
				entrada.next();
			}
			// Si es un entero, me salgo
			else break;
		} 
		// Asigno la lectura a la variable de tipo entero
		int numero=entrada.nextInt();
		entrada.close();
		// Cómo es un acumulador multiplicando, necesito inicializarlo a 1, no a 0
		int factorial=1;
		// Bucle para multiplicar por cada uno de los números, empezando desde el 2 hasta llegar al número
		for (int i=2;i<=numero;i++)
			// Acumulo multiplicando la variable acumuladora por la variable del bucle
			factorial*=i;
		// Finalizo mostrando el resultado
		System.out.println("el factorial de "+numero+" es "+factorial);
	}

}
