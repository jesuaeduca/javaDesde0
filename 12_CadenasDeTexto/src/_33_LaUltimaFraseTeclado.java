import java.util.Scanner;

public class _33_LaUltimaFraseTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		System.out.print("Introduce la frase: ");
		String frase=entrada.nextLine();
		System.out.println(frase.charAt(frase.length()-1));
		entrada.close();
	}

}
