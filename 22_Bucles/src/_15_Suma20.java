import javax.swing.JOptionPane;

/*
 * Realiza un programa que lea un número positivo mayor de 100, 
 * comprueba adecuadamente que se cumple, y muestre la  suma de los 20 números anteriores al número leído.
 */
public class _15_Suma20 {

	public static void main(String[] args) {
		// Variable para leer el número
		int numero;
		// Bucle para asegurar que el número es mayor a 100
		do {
			numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce número número positivo mayor de 100"));
		} while (numero<=100);
		// Variable de tipo acumulador
		int suma=0;
		// Bucle para sumar los 20 números anteriores a número 
		for (int i=20;i>0;i--) {
			// Acumulo en la variable suma.
			suma=suma+--numero;
		}
		System.out.println("La suma de los 20 números anteriores es "+suma);
	}

}
