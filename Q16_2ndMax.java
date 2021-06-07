//-----------Second max number in array in Single Loop without Sorting---------------
package n.p1;
import java.util.*;
public class Q16_2ndMax {
	//----------------Creating a Method to find 2nd max num----------------
	public static void max2nd(int array[]) {
		
		int arrLen = array.length;
		int max1 = 0, max2 = 0;
		
		for(int i=0; i<arrLen; i++) {
			
			if(max1<array[i]) {
				max2 = max1;
				max1 = array[i];
			}
			if(max2<array[i] && array[i]<max1) {
				max2 = array[i];
			}
		}
		//----------- print Max 1 and Max 2------------------------
		System.out.println();
		System.out.println("1st maximum  :  "+max1);
		System.out.println("2nd maximum  :  "+max2);
	}
	
	//--------------------Main Method------------------------------------
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many numbers to be compared : ");
		int n = sc.nextInt();
		
		 // ------Creating Array of size n;---------- 
		
		System.out.println("Enter "+n+ " numbers ");
		int array[] = new int[n]; 
		for(int i=0; i<n; i++) {
			array[i] = sc.nextInt();   // taking inputs values of array
		}
		//---------------print array-----------------
		System.out.print("Array Given  : ");
		for(int i=0; i<n; i++) {
			System.out.print( array[i]+"  ");  
		}
		
		//-------------- Calling arrayMax() method to find 2nd MAX------------------
			max2nd(array);
		
	}
}
