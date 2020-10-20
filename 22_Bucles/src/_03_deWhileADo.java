
public class _03_deWhileADo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		while (x++ <= 10){
		    System.out.print(x);
		    if (x%4 == 0) System.out.print(" es múltiplo de cuatro");
		    System.out.println();
		}
		/*
		x = 1;
		do {
		    System.out.print(x);
		    if (x%4 == 0) System.out.print(" es múltiplo de cuatro");
		    System.out.println();
		} while (x++ <= 100);
		*/
	}

}
