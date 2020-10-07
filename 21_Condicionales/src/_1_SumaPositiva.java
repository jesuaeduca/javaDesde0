import java.util.Scanner;

public class _1_SumaPositiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		
		System.out.print("Introduce dos número separados por un espacio: ");
		int numero1=entrada.nextInt();
		int numero2=entrada.nextInt();
		int suma=numero1+numero2;
		if (suma>0) {
			System.out.println("La suma de los números es positiva");			
		}
		else
			if (suma==0)
				System.out.println("La suma de los números es CERO");
			else
				System.out.println("La suma de los números NO es positiva");
		entrada.close();
	}

}
