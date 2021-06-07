//-------- Largest number is an array (here used sorting)---------------------
package n.p1;
import java.util.*;

public class Q15_sortMax {
	//------------array SORT MAX method-----------------------
	public static void arrayMax(int array[]) {
		
		int arrLen = array.length;
		//----------Max and Sorting Algorithm---------------
		for(int i =arrLen; i>1; i--) {
			
			for(int j =0; j<i-1; j++) {
				if(array[j]<array[j+1]) {
					int ex = array[j];
					array[j] = array[j+1];
					array[j+1] = ex;
					}
			}
		}
		//------------New Sorted Array Print------------------
				System.out.println();
				System.out.print(" Array Sorted : ");
				for(int i=0; i<arrLen; i++) {
					System.out.print( array[i]+"  ");  //print array
				}
				
		//--------------MAX number Print-----------------------
				System.out.println();
				System.out.print( "Maximum number in Array is : " + array[0]);// Max number
		
	}
//------------------------Main MEthod -------------------------------	
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
	System.out.print(" Array Given  : ");
	for(int i=0; i<n; i++) {
		System.out.print(array[i]+"  ");  
	}
	
	//-------------- Calling arrayMax() method------------------
		arrayMax(array);
}
}
