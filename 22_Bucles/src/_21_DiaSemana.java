import java.util.Scanner;

public class _21_DiaSemana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		int dia=0,mes=0,anyo=0;
		System.out.print("Introduce el día: ");
		if (entrada.hasNextInt()) {
			dia=entrada.nextInt();
		} 
		else {
			System.out.println("Debe introducir un número");
			System.exit(0);
		}
		System.out.print("Introduce el mes: ");
		if (entrada.hasNextInt()) {
			mes=entrada.nextInt();
		} 
		else {
			System.out.println("Debe introducir un número");
			System.exit(0);
		}
		System.out.print("Introduce el año (a partir de 1583): ");
		if (entrada.hasNextInt()) {
			anyo=entrada.nextInt();
			if (anyo<1584) {
				System.out.println("El año debe ser superior a 1583");
				System.exit(0);
			}
		} 
		else {
			System.out.println("Debe introducir un número");
			System.exit(0);
		}
		entrada.close();
		int a,b,c,d,e,f,g,h,i;
		a=(14-mes)/12;
		b=anyo-a;
		c=(mes+(12*a))-2;
		d=b/4;
		e=b/100;
		f=b/400;
		g=(31*c)/12;
		h=dia+b+d-e+f+g;
		i=h%7;
		switch (i) {
		case 0:
			System.out.println("Domingo");
			break;
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		}
	}

}
