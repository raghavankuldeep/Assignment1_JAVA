package n.p1;

//-----------------Given number is prime or not-------------
import java.util.*;
public class Q11_prime {
	public static void main(String[] args) {
		
	//----------------Taking a number from user as INPUT---------------
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number =  ");
		int num = sc.nextInt();
		boolean flag = false;
		if(num==0 || num ==1) {                  //----excluding 0 and 1----
			flag = true;
		}
		
	//---------------Prime number condition for numbers from 2 to n--------
		for(int i=2; i< num; i++) {
			if(num%i == 0) {
				flag = true;
				break;
			}

		}
		if(flag) {
			System.out.print(num+" is not a prime number" );
		}
		else {
			System.out.print(num+" is  a prime number");
			
		}
	}
}
