import javax.swing.JOptionPane;

public class _08_PideNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cantidad=Integer.parseInt(JOptionPane.showInputDialog("Introduce cuantos números se van a introducir"));
		int pares=0,impares=0;
		
		for(int i=1;i<=cantidad;i++) {
			int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce el número "+i));
			if (numero%2==0) pares++;
			else impares++;
		}
		System.out.println("Has introducido "+pares+" números pares y "+impares+" números impares");	
	}

}
