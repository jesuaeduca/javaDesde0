import javax.swing.JOptionPane;

public class _05_TablaMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=0;
		while (numero<=0 || numero>9) {
			numero=Integer.parseInt(JOptionPane.showInputDialog("De que número hacemos la tabla de multiplicar? (1-9)"));
		}
		int i=1;
		do {
			System.out.println(numero+"*"+i+"="+(i*numero));
			i++;
		} while(i<=10);
	}

}
