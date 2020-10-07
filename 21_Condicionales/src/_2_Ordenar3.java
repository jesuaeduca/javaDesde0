import java.util.Scanner;

public class _2_Ordenar3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);		
		System.out.print("Introduce tres números separados por un espacio: ");
		int numero1=entrada.nextInt();
		int numero2=entrada.nextInt();		
		int numero3=entrada.nextInt();
		entrada.close();
		if (numero1<=numero2 && numero1<=numero3) {			
			System.out.println(numero1);
			if (numero2<numero3) {				
				System.out.println(numero2);
				System.out.println(numero3);
			}
			else {
				System.out.println(numero3);
				System.out.println(numero2);				
			}
		}
		else if (numero2<=numero1 && numero2<=numero3) {
			System.out.println(numero2);
			if (numero1<numero3) {
				System.out.println(numero1);
				System.out.println(numero3);
			}
			else {
				System.out.println(numero3);
				System.out.println(numero1);
			}
		}
		else {
			System.out.println(numero3);
			if (numero1<numero2) {
				System.out.println(numero1);
				System.out.println(numero2);
			}
			else {
				System.out.println(numero2);
				System.out.println(numero1);
			}
		}
	}

}
