package n.p1;
//----------------Checking a number is Armstrong or not----------------
import java.util.*;
public class Q10_Armstrong {
	public static void main(String[] args) {
		
	//------------Taking a number as user INput----------
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number  ");
		int num = sc.nextInt();
		
	//-------------Getting digits of the number and Summing the cube of digits-------
		int q=num,r=0, newNum=0;
		while(q!=0) {
			r=q%10;
			q=q/10;
			newNum = newNum + (r*r*r);
		}
		//System.out.println("new number = "+newNum);
	//-------------- Checking the Armstrong condition------------
		if(newNum == num) {
			System.out.println(num+" is an Armstrong number");
		}
		else {System.out.println(num+" is not an Armstrong number");}
	}

}
