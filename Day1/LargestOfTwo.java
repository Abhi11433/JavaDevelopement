import java.util.*;
	class LargestOfTwo{
	public static void main (String args[]){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the two number and find the largest number :--");
	int FirstNum = input.nextInt();
	int SecondNum = input.nextInt();
	if (FirstNum < SecondNum ) {
	System.out.println(SecondNum + " is Greter then " + FirstNum);
	}else{
	System.out.println(FirstNum + " is Greater then " + SecondNum);
	}
}
}
