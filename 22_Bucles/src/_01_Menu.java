import java.util.Scanner;

public class _01_Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);		
		String respuesta="";
		while (respuesta.equals("0")==false) {
			System.out.println("1. Sumar");
			System.out.println("2. Restart");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("");
			System.out.println("0. Salir");
			System.out.print("Introduce la opción deseada:");
			respuesta=entrada.nextLine();
		}
		System.out.println("PROGRAMA TERMINADO");
		entrada.close();
	}

}
