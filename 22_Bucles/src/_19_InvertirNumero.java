import java.util.Scanner;

/*
 * Realiza un programa que lea un número por teclado y lo muestre invertido.
 */

public class _19_InvertirNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		while (true) {
			System.out.print("Introduce el número a invertir:");
			if (!entrada.hasNextInt()) {
				System.out.println("No has introducido un número");
				entrada.next();
			}
			else break;
		} 
		String numero=entrada.nextLine();
		String numeroInvertido="";
		entrada.close();
		for (int i=numero.length()-1;i>=0;i--)
			numeroInvertido=numeroInvertido+numero.charAt(i);
		System.out.println(numeroInvertido);
	}

}
