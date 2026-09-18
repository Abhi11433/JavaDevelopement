import java.util.*;
	class StudentResult{
	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.println("Plese enter your maks...");
	System.out.print("Maths :");
	int NumberOfMath =input.nextInt();
	System.out.print("English :");
	int NumberOfEnglish =input.nextInt();
	System.out.print("Computer :");
	int NumberOfComputer =input.nextInt();
	int Total = NumberOfMath + NumberOfEnglish + NumberOfComputer;
	System.out.println("Total :"+Total);
	double Percentage = (Total / 300.0)  * 100 ;
	Percentage = Math.round(Percentage * 100.0) / 100.0;
	System.out.println("Percentage : "+Percentage+"%");
	if(Percentage >= 33){ 
	System.out.println("Result : Pass");
	}else{
	System.out.println("Result : Fail");
	}
}}

