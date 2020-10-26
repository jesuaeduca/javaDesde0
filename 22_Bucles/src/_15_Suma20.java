import javax.swing.JOptionPane;

/*
 * Realiza un programa que lea un número positivo mayor de 100, 
 * comprueba adecuadamente que se cumple, y muestre la  suma de los 20 números anteriores al número leído.
 */
public class _15_Suma20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		do {
			numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce número número positivo mayor de 100"));
		} while (numero<=100);
		int suma=0;
		for (int i=20;i>0;i--) {
			suma=suma+--numero;
		}
		System.out.println("La suma de los 20 números anteriores es "+suma);
	}

}
