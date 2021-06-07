//-----------Minimum of Two numbers using Conditional Operaator------------------
package n.p1;

import java.util.Scanner;

public class Q2_MinOfNum {
		public static void main(String[] args) {
			
	//-----Taking Two numebrs as input from user--------------
			System.out.println("Enter two numbers ");
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			int y = sc.nextInt();
	//-------Minimum condition----------------------------	
			int min = (x<y) ? x : y;
			System.out.println("Minimum number is "+min);// printing min num
	
		}

}
