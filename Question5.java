package assignment3.ArithmaticOperators;

public class Question5 {

	public static void main(String[] args) {

		int inputSecond = 3695;
		int hours;
		int minute;
		int second;
		
		second = inputSecond % 60;
		int remainSecond = inputSecond / 60;
		minute = remainSecond % 60;
		hours = remainSecond / 60 ; 
	
	
	
	System.out.println("Input Second is: " + inputSecond);
	System.out.println(hours + " hours, " + minute + " minutes, and "+ second + " seconds" );
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
