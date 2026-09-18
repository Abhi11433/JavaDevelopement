import java.util.*;
	class Calculator{
	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the First number:= ");
	double FirstNum = input.nextDouble();
	System.out.println("Enter an Operator(+ , - , * , /) ");
	char Operator = input.next().charAt(0);
	if (Operator == '+' || Operator == '-' || Operator == '*' || Operator == '/'){
	System.out.println("Enter the Secon number:= ");
	double SeconNum = input.nextDouble();
	double output ;

	switch (Operator){
	case '+':
	output = FirstNum + SeconNum ;
	System.out.println("Sume of two no. "+ output);
	break;
	
	case '-':
	output = FirstNum - SeconNum ;
	System.out.println("Substraction of two no. "+ output);
	break;

	case '/':
        output = FirstNum / SeconNum ;
        System.out.println("Devesion of two no. "+ output);
        break;

	case '*':
        output = FirstNum * SeconNum ;
        System.out.println("Multiplaction of two no. "+ output);
        
}

	}else{
	System.out.println("Plese enter a valid operator like (+ , - , * , / )");
	}
}
}
