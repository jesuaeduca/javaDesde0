import java.util.Scanner;

public class _12_Capicua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		System.out.print("Introduce un número (máximo de 5 cifras y mínimo de 3): ");
		int numero=entrada.nextInt();
		entrada.close();
		
		int numeroInvertido=0;
		int numeroTemp=numero;
		if (numero>99999 || numero<99) System.out.println("Lo siento, el número no cumple las condiciones");
		else {
			// Invertimos el número
			numeroInvertido=numeroTemp%10;
			numeroTemp=numeroTemp/10;			
			if (numeroTemp>10) {
				numeroInvertido=(numeroInvertido*10)+numeroTemp%10;
				numeroTemp=numeroTemp/10;							
			}
			if (numeroTemp>10) {
				numeroInvertido=(numeroInvertido*10)+numeroTemp%10;
				numeroTemp=numeroTemp/10;							
			}
			if (numeroTemp>10) {
				numeroInvertido=(numeroInvertido*10)+numeroTemp%10;
				numeroTemp=numeroTemp/10;							
			}
			numeroInvertido=numeroInvertido*10+numeroTemp;
			if(numero==numeroInvertido)
				System.out.println("El número es capicua");
			else
				System.out.println("El número no es capicua");
		}
	}

}
