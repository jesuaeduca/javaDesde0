import javax.swing.JOptionPane;

/*
 * Realiza un programa que lea un número por teclado y nos diga si es primo o no.  
 * Un número es primo si sólo es divisible entre 1 y sí mismo.
 */
public class _14_Primo {

	public static void main(String[] args) {
		// Leo el número a comprobar
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce el número para saber si es primo"));
		// Variable de tipo semáforo para saber si es primo o no
		boolean primo=true;
		// Desde el núemro 2, hasta el número dividido entre 2 (podría ser hasta número-1, 
		// pero si ya es mayor que la mitad, nunca va a ser divisible
		for (int i=2;i<=numero/2;i++) {
			// Si el número es divisible, es decir, si el resto de la división es 0
			if (numero%i==0) {
				// el número no es primo
				primo=false;
				// salimos del bucle, ya no hace falta seguir comprobando
				break;
			}
		}
		// Si llegamos hasta aquí con primo==true, es que no hemos encontrado ningún número que lo divida
		if (primo) System.out.println("El número es primo");
		else System.out.println("El número no es primo");
	}

}
