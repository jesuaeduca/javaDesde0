import java.util.Scanner;

public class _01_AdivinaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// El rango de Math.random es max-min+1
		// (max-min+1)+min
		// 7-20 incluidos (..(20-7+1))+7
		
		
		// Generar número secreto
		// Pedir número de intentos
		// Mientras queden intentos
		//	Preguntar el número
		//	Si el número es el secreto se ha acertado
		// 	Si no lo es, mostrar si es menor o mayor
		// Si se ha llegado al final, se ha acertado o no?
		
		int numeroSecreto=(int)(Math.random()*999);
		Scanner entrada=new Scanner(System.in);		
		System.out.print("Introduce el número de intentos: ");
		int intentos=entrada.nextInt();
		while (intentos>0) {
			System.out.print("Te quedan "+intentos+" intentos. Introduce un número:");
			int numero=entrada.nextInt();
			if (numero==numeroSecreto) {
				System.out.println("ACERTADO!!");
				//break;
			}
			else if (numero>numeroSecreto)
				System.out.println("El número introducido es mayor");
			else
				System.out.println("El número introducido es menor");
			intentos--;
		}
		if (intentos==0)
			System.out.println("Lo siento, has PERDIDO, el número era "+numeroSecreto);
		entrada.close();		
	}

}
