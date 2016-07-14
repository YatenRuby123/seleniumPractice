package firstprogram;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Tutorial_Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner input3 = new java.util.Scanner(System.in);
	
		
		String[] fNames = new String[4];
		
		for(int i = 0; i<fNames.length; i++){
			System.out.println("Enter "+(i+1)+ " friend name : ");
			fNames[i] = new StringBuffer(input3.nextLine()).reverse().toString();

	}
		ArrayList<String> alNames = new ArrayList<>();
		
		
		for(int i = 0; i<fNames.length; i++){
			System.out.print(fNames[i]+ " ");
			alNames.add(fNames[i]);
		}
		System.out.println("\n");
		System.out.println(alNames);	
		
		try {
			PrintWriter write = new PrintWriter(new File("revFriendsName.txt"));
			
			for(String obj : alNames){
				write.println(obj);
			}
			
			write.close();			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

}
}