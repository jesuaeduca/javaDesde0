import javax.swing.JOptionPane;

/*
 * Realiza un programa que lea un número por teclado y nos diga si es primo o no.  
 * Un número es primo si sólo es divisible entre 1 y sí mismo.
 */
public class _14_Primo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce el número para saber si es primo"));
		boolean primo=true;
		for (int i=2;i<=numero/2;i++) {
			if (numero%i==0) {
				// el número no es primo
				primo=false;
				break;
			}
		}
		if (primo) System.out.println("El número es primo");
		else System.out.println("El número no es primo");
	}

}
