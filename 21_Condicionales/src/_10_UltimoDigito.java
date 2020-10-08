import java.util.Scanner;

public class _10_UltimoDigito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		System.out.print("Introduce un número (máxinmo de 5 cifras): ");
		int numero=entrada.nextInt();
		entrada.close();
		
		System.out.println("El último dígito es: "+numero%10);
	}

}
