import javax.swing.JOptionPane;

public class _12_DigitosNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce el número"));
		int contador=1;
		while(numero>10) {
			numero=numero/10;
			contador++;
		}
		System.out.println("El número tiene "+contador+" cifras");
	}

}
