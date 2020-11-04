import javax.swing.JOptionPane;

/*
 * Vamos a hacer un programa para jugar a adivinar un número.

    El programa elegirá un número al azar entre el 1 y el 999
    Hay que intentar adivinar ese número en un número máximo de intentos. 
    El número máximo de intentos se preguntará al inicio del juego.
    Se podrá intentar adivinar el número hasta que queden intentos. 
    El programa mostrará cuantos intentos quedan, y al introducir el número mostrará si has 
    acertado o no.
    En caso de no acertar, el juego dará una pista para ayudarnos a encontrar el número.

 */
public class Pruebas {

	public static void main(String[] args) {

		int numeroSecreto=(int) (Math.random()*999+1);
		int numeroIntentos=Integer.parseInt(JOptionPane.showInputDialog("Introduce cuantos intentos quieres"));
		while (numeroIntentos>0) {
			int numero=Integer.parseInt(JOptionPane.showInputDialog("¿Cual crees que es el número? Te quedan "+numeroIntentos+" intentos"));			
			if (numero>numeroSecreto)
				System.out.println("El número que has elegido es mayor que el secreto");
			else if (numero<numeroSecreto)
				System.out.println("El número que has elegido es menor que el secreto");
			else
				break;
			numeroIntentos--;
		}
		if (numeroIntentos==0)
			System.out.println("Lo siento, no has adivinado el número, era el "+numeroSecreto);
		else
			System.out.println("Enhorabuena, has acertado el número");
	}
}
