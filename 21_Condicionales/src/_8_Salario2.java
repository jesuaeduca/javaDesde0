import java.util.Scanner;

public class _8_Salario2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		System.out.print("Introduce las horas que has trabajo esta semana: ");
		double horas=entrada.nextDouble();
		entrada.close();
		
		final int horasSemana=35;
		double horas_extra=0;
		
		if (horas>horasSemana) horas_extra=horas-horasSemana;
		double salario=(11*horas-horas_extra)+(horas_extra*18);
		
		System.out.print("Salario semanal: "+(horas-horas_extra)+" horas normales a 11 euros son "
				+(11*(horas-horas_extra)));
		if (horas_extra>0)
			System.out.print(" y "+horas_extra+" horas extras a 18 euros son "+(horas_extra*18));
		System.out.println(" TOTAL:"+salario+" euros");
	}

}
