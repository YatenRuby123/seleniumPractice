package firstprogram;

public class Arrays {

	public static void main(String[] args) {
		
		int[] numbers = new int[4];
		numbers[0] = 0;
		numbers[1] = 1;
		numbers[2] = 2;
		numbers[3] = 3;
		
		for(int i = 0; i<numbers.length; i++)
		System.out.print(i+" ");
		System.out.println(" ");
		System.out.println(numbers[2]);
		
		System.out.println(" ");
		
		String[] string = new String[10];
		string[0] = "Tom";
		string[2] = "Kim";
		string[9] = "KumKum";
		
		
		for(int j=0; j<string.length; j++){
			System.out.println(string[j]);
		}
		

	}

}
