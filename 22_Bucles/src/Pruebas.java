import java.util.Scanner;

public class Pruebas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Introduzca numero de filas: ");
        int num = input.nextInt();
        System.out.print("Introduzca el caracter: ");
        String cara = input.next();
         
        int cont = 0;
                 
        for(int i=0; i<(num+1); i++ ){
        	
        	for(int x=1;x<=cont;x++){
                System.out.print(cara);
            }
        	cont++;
            System.out.println();
        }
        
        input.close();
	}

}
