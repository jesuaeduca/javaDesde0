import java.util.Scanner;

public class _22_Piramide {

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
		for (int i=1;i<=base;i+=2) {
			for (int j=0;j<(base-i)/2;j++) {
				System.out.print(" ");
			}
			
			for (int j=0;j<i;j++) {
				System.out.print(caracter);
			}
			System.out.println();
		}

	}

}
