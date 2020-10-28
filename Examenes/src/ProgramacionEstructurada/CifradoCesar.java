package ProgramacionEstructurada;

import java.util.Scanner;

/*
 * Crea un  programa que  sirva  para  cifrar  un  texto  con  el  conocido  
 * método  de  César. El criptosistema consiste en el desplazamiento de 3 caracteres 
 * en la posición del carácter a cifrar, es decir, la A se sustituye por la D, 
 * la B por la E, ..., la X por la A,  la  Y  por  la  B  y  la  Z  por  la  C.  
 * Por  simplicidad,  supondremos  que  el  texto  a  cifrar  
 * solo contiene caracteres alfabéticos en mayúscula.
 * 
 * Realiza un programa que lea una cadena de texto por teclado y muestre el texto cifrado.
 * No se puede utilizar condicionales.
 * 
 */

public class CifradoCesar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String alfabeto="ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		System.out.print("Introduce la cadena de texto a cifrar: ");
		Scanner scan=new Scanner(System.in);
		String cadena=scan.nextLine();
		String cadenaCifrada="";
		for (int i=0;i<cadena.length();i++) {
			cadenaCifrada+=alfabeto.charAt((alfabeto.indexOf(cadena.charAt(i))+3)%27);
		}
		System.out.println("Cadena cifrada: "+cadenaCifrada);
		scan.close();
	}

}
