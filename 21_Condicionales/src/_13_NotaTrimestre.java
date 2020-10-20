import java.util.Scanner;
import javax.swing.JOptionPane;

public class _13_NotaTrimestre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		System.out.print("Introduce la nota del primer exámen: ");
		double nota1=entrada.nextDouble();
		System.out.print("Introduce la nota del segundo exámen: ");
		double nota2=entrada.nextDouble();
		
		double notaMedia=(nota1+nota2)/2;
		
		if (notaMedia>=5) { // aprobado
			System.out.println("Aprobado, Nota:"+notaMedia);			
		}
		else {
			String recuperacion=JOptionPane.showInputDialog("Examen de recuperación (apto/no apto): ");
			if (recuperacion.equals("apto")) {
				System.out.println("Aprobado, Nota: 5");
			}
			else {
				System.out.println("Suspenso, Nota:"+notaMedia);
			}
		}

		entrada.close();

	}

}
