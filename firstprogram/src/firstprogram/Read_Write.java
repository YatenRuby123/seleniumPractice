package firstprogram;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Read_Write {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Read files
		
		try {
			Scanner input1 = new Scanner(new File("read.txt"));
			while(input1.hasNextLine()){
				System.out.println(input1.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Write files
		
		try {
			PrintWriter write = new PrintWriter("write.txt");
			write.println("Hello");
			write.write("World!!!");
			
			write.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
