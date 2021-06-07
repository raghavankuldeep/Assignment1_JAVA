package n.p1;

//----------Given number is Pallindrome or not----------------
import java.util.*;
public class Q12_palindrome {
	public static void main(String[] args) {
		
	//--------- Taking a number as USER INPUT---------
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Number  ");
		int number = sc.nextInt();
	//---------Reversing the digit of number----------
		int q= number;
		int r= 0;
		int newNum = 0;
		while(q!=0) {
			r=q%10;
			q=q/10;
			newNum = (newNum * 10) + r;
		}
		//System.out.println("new number = "+newNum);
	//--------- Comparing the two numbers------------------------
				if(newNum == number) {
					System.out.println(number +" is Pallindrome number");
				}
				else {System.out.println(number +" is not an Pallindrome number");}
		
	}

}
