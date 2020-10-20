import javax.swing.JOptionPane;

public class _07_Divisores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce el número para obtener sus divisores"));
		for (int i=2;i<=numero/2;i++) {
			if (numero%i==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		String salida="Los divisores del número "+numero+" son: ";
		for (int i=2;i<=numero/2;i++) {
			if (numero%i==0) {
				salida=salida+i+" ";
			}
		}
		System.out.println(salida);

	}

}
