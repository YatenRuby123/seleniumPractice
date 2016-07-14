package firstprogram;

import java.util.*;



public class Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scan input = new Scan();
		
		String name =  "Sham";
		System.out.println("Enter your name : "+name);
		//System.out.println(name);
		
		
		Random random = new Random();
		int randomNumber = random.nextInt(100);
		System.out.println("Your random number is : "+ randomNumber);
		
		Vehicle v1 = new Vehicle();
		System.out.println(v1.getYear());
		System.out.println(v1.getColor());
		System.out.println(v1.getModelNumber());

	}

//	public String nextLine() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}

class Vehicle{
	private int year;
	private String modelNumber;
	private String color;


public Vehicle(){
	year = 2007;
	modelNumber = "Civic123";
	color = "Dark Blue";
}

public Vehicle(int yr, String modNum, String clr){
	this.year = yr;
	this.modelNumber = modNum;
	this.color = clr;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

public String getModelNumber() {
	return modelNumber;
}

public void setModelNumber(String modelNumber) {
	this.modelNumber = modelNumber;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

}


