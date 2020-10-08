import java.util.Scanner;

public class _6_Triangulos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);		
		System.out.print("Introduce la longitud de los tres lados separados por un espacio: ");
		double lado1=entrada.nextDouble();
		double lado2=entrada.nextDouble();		
		double lado3=entrada.nextDouble();
		entrada.close();
		boolean pitagoras=false;
		// Pitagoras?
		// h**2=c**2+c**2 
		// ¿Cual es h? La mayor
		
		if (lado1>=lado2 && lado1>=lado3) {
			if (Math.pow(lado1,2)==Math.pow(lado2,2)+Math.pow(lado3, 2))
					pitagoras=true;
		}
		else if (lado2>=lado1 && lado2>=lado3) {
			if (Math.pow(lado2,2)==Math.pow(lado1,2)+Math.pow(lado3, 2))
					pitagoras=true;
		}
		else if (lado3>=lado1 && lado3>=lado2) {
			if (Math.pow(lado3,2)==Math.pow(lado1,2)+Math.pow(lado2, 2))
					pitagoras=true;
		}
		if (pitagoras)
			System.out.println("El triángulo es ractángulo");
		else if (lado1==lado2 && lado1==lado3)
			System.out.println("El triánguo es equilatero");
		else if (lado1==lado2 || lado2==lado3)
			System.out.println("El triángulo es isósceles");
		else
			System.out.println("El triángulo es escaleno");
			
	}

}
