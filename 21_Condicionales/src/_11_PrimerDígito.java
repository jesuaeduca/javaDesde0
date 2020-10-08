import java.util.Scanner;

public class _11_PrimerDígito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		System.out.print("Introduce un número (máximo de 5 cifras): ");
		int numero=entrada.nextInt();
		entrada.close();
		
		if (numero>99999) System.out.println("Lo siento, el número es demasiado grande");
		else {
			if (numero>10) numero=numero/10;
			if (numero>10) numero=numero/10;
			if (numero>10) numero=numero/10;
			if (numero>10) numero=numero/10;
			System.out.println("El primer dígito es "+numero);			
		}
	}

}
