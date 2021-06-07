
package n.p1;

import java.util.Scanner;

//---------------Reverse the digit of any number-----------
public class Q5_reverse {
			public static void main(String[] args) {
			
	//---------- Taking input from user------------
				Scanner sc= new Scanner(System.in);
				System.out.print("Enter number- ");  
				int n= sc.nextInt();  
				//System.out.println(n);
	//-----------Reversing Algorith with remainder and quotient----------	
				int q = n,r = 0;
				int revNum = 0;
				while(q!=0) {
					r= q%10;  
					q = q/10;
					revNum = (revNum *10) +(r);
					//String  revNum = {" "};
					//revNum = revNum + r;
				}
				
				System.out.println("Reverse of "+n+ " is "+revNum);
			}
	
}
