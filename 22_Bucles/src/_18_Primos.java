/*
 * Realiza un programa que lea dos números, el primero menor que el segundo, 
 * realiza las comprobaciones adecuadas, 
 * y muestra los números primos que se encuentran entre los números leídos.
 */
	
import javax.swing.JOptionPane;

public class _18_Primos {

	public static void main(String[] args) {
		// Variables para contener los números
		int numero1,numero2;
		// Hacemos un bucle para asegurarnos que el número 1 es menor o igual que el número 2
		do {
			numero1=Integer.parseInt(JOptionPane.showInputDialog("Introduce el menor de los números"));
			numero2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el mayor de los números"));
		} while (numero1>=numero2);
		
		// Bucle para recorrer todos los números que están en medio
		// podemos hacerlo con una variable nueva o utilizar las variables que tenemos
		for (;numero1<=numero2;numero1++) {
			// Variable semaforo para controlar si ese número es primo o no
			boolean primo=true;
			// Bucle para comprobar si es primo el número
			for (int i=2;i<=numero1/2;i++) {
				if (numero1%i==0) {
					// el número no es primo
					primo=false;
					// No hace falta comprobar más
					break;
				}
			}
			// Imprimimos los números diciendo si son primos o no
			if (primo) System.out.println(numero1+" - Primo");
			else System.out.println(numero1);			
		}
	}

}
