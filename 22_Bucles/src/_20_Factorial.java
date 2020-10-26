/*
 * Realiza un programa que muestre el factorial de un número que se lee desde teclado.
 */
import java.util.Scanner;

public class _20_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		while (true) {
			System.out.print("Introduce el número a calcular el factorial:");
			if (!entrada.hasNextInt()) {
				System.out.println("No has introducido un número");
				entrada.next();
			}
			else break;
		} 
		int numero=entrada.nextInt();
		entrada.close();
		int factorial=1;
		for (int i=2;i<=numero;i++)
			factorial*=i;
		System.out.println("el factorial de "+numero+" es "+factorial);
	}

}
