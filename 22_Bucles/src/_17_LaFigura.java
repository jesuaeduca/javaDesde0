import java.util.Scanner;

/*
 * Realiza un programa que muestre una figura del siguiente tipo:
 	*
 	**
 	***
 	****
 * El número de elementos de la base y el carácter con el que pintar la figura se deben pedir por teclado.
 */

public class _17_LaFigura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		String caracter;
		do {
			System.out.print("Introduce el caracter con el que pintar: ");
			caracter=entrada.nextLine();
		} while (caracter.length()!=1);
		while (true) {
			System.out.print("Introduce el número de elementos de la base:");
			if (!entrada.hasNextInt()) {
				System.out.println("No has introducido un número");
				entrada.next();
			}
			else break;
		} 
		int base=entrada.nextInt();
		entrada.close();
		// Bucle para el número de líneas
		for (int i=0;i<=base;i++) {
			for (int j=0;j<i;j++) {
				System.out.print(caracter);
			}
			System.out.println();
		}
	}

}
