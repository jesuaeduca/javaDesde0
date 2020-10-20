import javax.swing.JOptionPane;

public class _06_TablaMultiplicarFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=0;
		while (numero<=0 || numero>9) {
			numero=Integer.parseInt(JOptionPane.showInputDialog("De que número hacemos la tabla de multiplicar? (1-9)"));
		}		
		for (int i=1;i<=10;i++){
			System.out.println(numero+"*"+i+"="+(i*numero));
		}
	}

}
