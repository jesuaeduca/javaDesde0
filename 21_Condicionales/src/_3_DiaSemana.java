import java.util.Scanner;

public class _3_DiaSemana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);		
		System.out.print("Introduce el número de la semana: ");
		int numeroDia=entrada.nextInt();
		entrada.close();
		switch(numeroDia) {
			case 1:
				System.out.println("Lunes");
				break;
			case 2:
				System.out.println("Martes");
				break;
			case 3:
				System.out.println("Miercoles");
				break;
			case 4:
				System.out.println("Jueves");
				break;
			case 5:
				System.out.println("Viernes");
				break;
			case 6:
				System.out.println("Sabado");
				break;
			case 7:
				System.out.println("Domingo");
				break;
			default:
				System.out.println("Número incorrecto");
		}
		
	}

}
