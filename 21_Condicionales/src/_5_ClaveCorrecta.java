import java.io.Console;


public class _5_ClaveCorrecta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner entrada=new Scanner(System.in);
		Console consola=null;		
		consola=System.console();
		char[] clave=null;
		String nombre=null;
		if (consola != null) {
			nombre = consola.readLine("Introduce tu nombre: ");
			clave=consola.readPassword("Introduce la clave: ");
		 }
		String claves=String.valueOf(clave);
		System.out.println("nombre:"+nombre);
		System.out.println("clave:"+claves);
		if (nombre=="DAM1" && claves=="JaVa")
			System.out.println("Usuario autorizado");
		else
			System.out.println("Usuario no autorizado");
	}

}
