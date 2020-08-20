package pri;

public class privateee {

	
	private static int i = 0;
	private static int j = 0;
	
	public static void main(String[] args) {
		int i =2;
		int k = 3;
		{
			int j = 4;
			System.out.println("the sum is " + i + j);
		}
		
		k = i + j;
		System.out.println("k is "+ k);
		System.out.println("j is " + j);

	}

}
