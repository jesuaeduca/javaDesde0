
public class _02_ContarAtras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=860;i>=460;i=i-10) {
			System.out.println(i);
		}
		System.out.println();
		int i=860;
		while (i>=460) {
			System.out.println(i);
			i=i-10;
		}
		System.out.println();
		i=860;
		do {
			System.out.println(i);
			i=i-10;			
		} while (i>=460);
	}

}
