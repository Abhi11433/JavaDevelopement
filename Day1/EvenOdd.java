import java.util.*;
class EvenOdd{
	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.println("Ente the number and check 'Even or Odd' ");
	int InputNum = input.nextInt();
	if (InputNum % 2 == 0 ) {
	System.out.println(InputNum + " is a Even number.");
	}else{
	System.out.println(InputNum + " is a Odd number.");
	}
	}
}
