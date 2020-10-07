import java.util.Scanner;

public class _4_DiasMes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);		
		System.out.print("Introduce el número del mes: ");
		int numeroDia=entrada.nextInt();
		entrada.close();
		switch(numeroDia) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("Ese mes tiene 31 dias");
				break;
			case 2:
				System.out.println("Ese mes tiene 28 dias, si no es bisiesto");
				break;
			default:
				System.out.println("Ese mes tiene 30 dias");
		}
				
	}

}
