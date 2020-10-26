/*
 * Realiza un programa que lea dos números, el primero menor que el segundo, 
 * realiza las comprobaciones adecuadas, 
 * y muestra los números primos que se encuentran entre los números leídos.
 */
	
import javax.swing.JOptionPane;

public class _18_Primos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1,numero2;
		do {
			numero1=Integer.parseInt(JOptionPane.showInputDialog("Introduce el menor de los números"));
			numero2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el mayor de los números"));
		} while (numero1>=numero2);
		
		for (;numero1<=numero2;numero1++) {
			boolean primo=true;
			for (int i=2;i<=numero1/2;i++) {
				if (numero1%i==0) {
					// el número no es primo
					primo=false;
					break;
				}
			}
			if (primo) System.out.println(numero1+" Primo");
			else System.out.println(numero1);			
		}
	}

}
