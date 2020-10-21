import javax.swing.JOptionPane;

/*
 * Escribe un programa que muestre la serie de Fibonacci. El primer término es 0, 
 * el segundo término es 1, el resto se calcula a partir de la suma de los dos anteriores, 
 * así la serie sería: 0, 1, 1, 2, 3, 5, 8, ….
 * El número de números a mostrar se leerá por teclado al inicio del programa
 */

public class _13_Fibonacci {

	public static void main(String[] args) {
		int numerosFib=Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos terminados de Fibonacci quieres mostrar?"));
		int f1=0;
		int f2=1;
		for (int i=1;i<=numerosFib;i++) {
			if (i==1)
				System.out.print(f1+" ");
			else if(i==2)
				System.out.print(f2+" ");
			else {
				int suma=f1+f2;
				System.out.print(suma+" ");
				f1=f2;
				f2=suma;
			}
		}
	}

}
