
public class _10_ElDado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aleatorio,tiradas=0;
		do {
			aleatorio=(int)(Math.random()*6)+1; // Número aleatorio entre el 1 y el 6
			//System.out.println(aleatorio);
			tiradas++;
		} while (aleatorio!=5);
		System.out.println("Has necesitado "+tiradas+" tiradas");
	}
}
