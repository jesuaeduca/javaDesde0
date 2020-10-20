import java.util.Scanner;

public class _04_SumaPositivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		int numero;
		int contadorPositivos=0,contadorNegativo=0;		
		int acumulador=0;
		do {
			System.out.print("Introduce un número: ");
			numero=entrada.nextInt();
			if (numero>0) {
				acumulador+=numero;
				contadorPositivos++;
			} 
			else if (numero<0) {
				++contadorNegativo;
			}
		} while(numero!=0);
		System.out.println("Se han introducido "+contadorPositivos+" números positivos que suman "+acumulador);
		System.out.println("Además se han introducido "+contadorNegativo+" números negativos");
		entrada.close();
	}

}
