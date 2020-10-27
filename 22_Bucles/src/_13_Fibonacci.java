import javax.swing.JOptionPane;

/*
 * Escribe un programa que muestre la serie de Fibonacci. El primer término es 0, 
 * el segundo término es 1, el resto se calcula a partir de la suma de los dos anteriores, 
 * así la serie sería: 0, 1, 1, 2, 3, 5, 8, ….
 * El número de números a mostrar se leerá por teclado al inicio del programa
 */

public class _13_Fibonacci {

	public static void main(String[] args) {
		// Leemos cúantos números de la serie queremos mostrar
		int numerosFib=Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos terminados de Fibonacci quieres mostrar?"));
		// Inicializamos 2 variables a los dos primeros números de la serie
		int f1=0;
		int f2=1;
		// Bucle para mostrar la cantidad de números solicitada
		for (int i=1;i<=numerosFib;i++) {
			// Comprobación de si es el primer número
			if (i==1)
				// Mostramos el primer número
				System.out.print(f1+" ");
			// Comprobación de si es el segundo número
			else if(i==2)
				// Mostramos el segundo número
				System.out.print(f2+" ");
			else {
				// Si no es primero, ni el segundo, es igual a la suma de los dos anteriores
				int suma=f1+f2;
				System.out.print(suma+" ");
				// Actualizo la información de las variables, y guardo los dos últimos números mostrados de la serie.
				f1=f2;
				f2=suma;
			}
		}
	}

}
