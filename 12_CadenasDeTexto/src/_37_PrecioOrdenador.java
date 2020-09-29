import java.util.Scanner;

public class _37_PrecioOrdenador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce el precio del ordenador sin IVA: ");
		double precio=entrada.nextDouble();
		int precioConIVA=(int)(precio+precio*0.185);
		System.out.println("El precio del ordenador con IVA (18.5) es "+precioConIVA);
		entrada.close();
	}

}
