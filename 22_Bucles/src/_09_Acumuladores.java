import javax.swing.JOptionPane;

public class _09_Acumuladores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cantidad=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos números se van a introducir?"));
		int mayor=Integer.MIN_VALUE,menor=Integer.MAX_VALUE,suma=0;
		for(int i=1;i<=cantidad;i++) {
			int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce el número "+i));
			suma+=numero; // suma=suma+numero
			if (numero<menor) menor=numero;
			if (numero>mayor) mayor=numero;			
		}
		System.out.println("El número mayor introducido es "+mayor);
		System.out.println("El número meno introducido es "+menor);
		System.out.println("La media de los números introducidos es "+suma/cantidad);
		
	}

}
