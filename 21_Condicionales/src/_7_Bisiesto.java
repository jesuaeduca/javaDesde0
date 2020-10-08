import java.util.Scanner;

public class _7_Bisiesto {
	
	// Pruebas Bisiestos, 1600, 2000, 2020
	// No bisiestos, 2021, 2200

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		System.out.print("Introduce el año a comprobar: ");
		int anyo=entrada.nextInt();
		entrada.close();
		
		if (anyo%4==0 && (anyo%100!=0||anyo%400==0))
			System.out.println("BISIESTO");
		else
			System.out.println("NO bisiesto");
	}

}
