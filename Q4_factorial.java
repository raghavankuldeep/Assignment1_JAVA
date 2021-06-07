package n.p1;
	
import java.util.*;  

public class Q4_factorial {
	public static void main(String[] args) {
	
	//---------- Taking input from user------------
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number- ");  
		int a= sc.nextInt();  
		//System.out.println(a);
		
	//-----------Caalculating Factorial-----------
		int fact = 1;
		while(a>=1) {
			fact = fact*a;
			a--;
		}
		System.out.print("factorial of given number is "+ fact);
	}
	
}
