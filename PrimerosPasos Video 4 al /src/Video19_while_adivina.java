import java.util.Scanner;

public class Video19_while_adivina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		int aleatorio=(int)(Math.random()*100);
		System.out.println("Numero "+aleatorio);
		int numero=-1;
		int contador=0;
		while (numero!=aleatorio) {
			System.out.print("Introduce el número:");
			numero=entrada.nextInt();
			if (numero>aleatorio) {
				System.out.println("El número es menor");
			}
			if (numero<aleatorio) {
				System.out.println("El número es mayor");
			}
			contador++;
		}
		System.out.println("Perfecto! Has encontrado el número en "+contador+" intentos.");
		
		
	}

}
