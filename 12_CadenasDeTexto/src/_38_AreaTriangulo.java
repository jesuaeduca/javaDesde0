
import javax.swing.JOptionPane;

public class _38_AreaTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Cálculo del área de un triángulo\n");
		
		String base=JOptionPane.showInputDialog("Introduce la base del triángulo:");
		String altura=JOptionPane.showInputDialog("Introduce la altura del triángulo:");
		
		System.out.println("El área del triángulo es "+(Double.parseDouble(base)*Double.parseDouble(altura))/2);	
	}

}
