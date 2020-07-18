import java.util.Scanner;

import javax.swing.JOptionPane;

public class Video14_15_PeticionDatos {

	public static void main(String[] args) {
		
		double x=10000/3;
		System.out.printf("%1.2f,",x);
		
		Scanner entrada=new Scanner(System.in);
		System.out.print("Introduce tu nombre: ");
		String nombre=entrada.nextLine();
		System.out.println("Hola "+nombre);
		entrada.close();
		
		String edad=JOptionPane.showInputDialog("Introduce tu edad:");
		System.out.println("Y tu edad será "+(Integer.parseInt(edad)+1));
	}

}
