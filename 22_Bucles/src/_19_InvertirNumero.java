import java.util.Scanner;

/*
 * Realiza un programa que lea un número por teclado y lo muestre invertido.
 */

public class _19_InvertirNumero {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		// Bucle infinito para controlar que se introduce un número de verdad
		while (true) {
			System.out.print("Introduce el número a invertir:");
			if (!entrada.hasNextInt()) {
				System.out.println("No has introducido un número");
				entrada.next();
			}
			else break;
		} 
		// Ponemos el número leido en la variable, lo metemos en cadena de texto, 
		// pero sabemos que es un número 
		String numero=entrada.nextLine();
		// Una variable para contener el número invertido
		String numeroInvertido="";
		entrada.close();
		// Bucle para recorrer la cadena al revés, desde la longitud, menos uno, 
		// hasta 0 que el primer carácter  
		for (int i=numero.length()-1;i>=0;i--)
			// voy añadiendo a la variable del número invertido, los caracteres de la posición del bucle
			numeroInvertido=numeroInvertido+numero.charAt(i);
		// Termino mostrando el número invertido
		System.out.println(numeroInvertido);
	}

}
