import javax.swing.JOptionPane;

public class Video18_while_clave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String clave="pepito";
		String pass="";
		
		while (!clave.equals(pass)) {
			pass=JOptionPane.showInputDialog("Introduce la clave");
			if (!pass.equals(clave))
					System.out.println("Clave incorrecta");
		}
		System.out.println("Bienvenido al sistema");
	}

}
