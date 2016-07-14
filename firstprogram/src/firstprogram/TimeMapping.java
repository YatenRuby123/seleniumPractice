package firstprogram;

public class TimeMapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long startTime = System.currentTimeMillis();
		for(int i = 0; i<500000; i++){
			System.out.print(i+ " ");
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("\nTime take in this process was :" + (endTime - startTime)/(1000));
	}

}
