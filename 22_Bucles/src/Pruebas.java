import java.util.Scanner;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		
	int numero=0, divisible;
	System.out.println("Introduce un numero");
	numero = entrada.nextInt();
		for(divisible=numero-1;divisible>=1;divisible--) {
			if(numero%divisible==0) {
				if(divisible!=1) {
					System.out.println("El numero no es primo");
				}
				else System.out.println("El numero es primo");
				break;
			}
			
		}
		entrada.close();
	
	}

}
