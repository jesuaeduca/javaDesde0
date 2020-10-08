import java.util.Scanner;

public class _9_ParDivisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		System.out.print("Introduce el número a comprobar: ");
		int numero=entrada.nextInt();
		entrada.close();
		boolean par=numero%2==0;
		boolean div7=numero%7==0;
		
		if (par&&div7) System.out.println("El número es par y divisible entre 7");
		else if (par) System.out.println("El número es par");
		else if (div7) System.out.println("El número es divisible entre 7");
	}

}
