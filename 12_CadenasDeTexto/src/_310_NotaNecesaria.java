import java.util.Scanner;

public class _310_NotaNecesaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		
		System.out.print("Introduce la nota del primer examen: ");
		double nota1=entrada.nextDouble();
		System.out.print("¿Que nota quieres sacar en la evaluación? ");
		double notaEvaluacion=entrada.nextDouble();
		// La nota que necesito es un 65% de la nota final 
		// notaEvaluacion = nota1*0.35 + notaNecesaria*0.65;
		// notaNecesaria = (notaEvaluación - nota1*0.35) / 0.65
		double notaNecesaria=(notaEvaluacion-nota1*0.35)/0.65;
			
		System.out.println("Para tener un "+notaEvaluacion+" en la evaluación necesitas sacar un "+notaNecesaria+" en el segundo examen.");
	}

}
