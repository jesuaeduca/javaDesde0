import javax.swing.JOptionPane;

public class _39_SalarioSemanal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Cálculo del salario");
		
		int precioHora=11;
		String horas=JOptionPane.showInputDialog("¿Cuántas horas has trabajado esta semana?");
		
		System.out.print("Tu salario esta semana es de "+Integer.parseInt(horas)*precioHora+" euros.");
	}

}
