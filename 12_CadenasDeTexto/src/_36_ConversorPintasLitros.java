import java.util.Scanner;

public class _36_ConversorPintasLitros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double LITROS_PINTA=0.473176;
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce el número de pintas que te has tomado: ");
		double pintas=entrada.nextDouble();
		System.out.println("Te has tomado "+LITROS_PINTA*pintas+" litros de cerveza!!");
		entrada.close();
	}

}
