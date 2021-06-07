package n.p1;

//--------Average of N consecutive odd numbers and even numbers--------------
import java.util.*;
public class Q14_average {
	public static void main(String[] args) {
	
	//------ Getting a number from User---------------
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of N ");
		int n = sc.nextInt();
		int sumOfEven = 0;
		int sumOfOdd = 0;
		int averageOfEven = 0;
		int averageOfOdd = 0;
		int counterEven = 1;
		int counterOdd = 1;
	//--------- Calculating Sum of n consecutive EVEN numbers------	
		for(int i=1; counterEven<=n; i++) {
			if(i%2==0) {
				counterEven++;
				sumOfEven = sumOfEven + i;
				//System.out.println("i = "+i+" counter "+ counterEven+" SumEven = "+sumOfEven);
			}
		}
	
	//--------- Calculating Sum of n consecutive odd numbers------	
		for(int j=1; counterOdd<=n; j++) {
			if(j%2!=0) {
				counterOdd++;
				sumOfOdd = sumOfOdd + j;
				
			}
		}
	//----------- Calculating AVERAGE of n consecutive EVEN numbers and ODD numbers------	
		
		averageOfOdd = sumOfOdd/n;
		averageOfEven = sumOfEven/n;
		
	//---------Printing both SUM and AVERAGES---------------
		System.out.println("Sum of " + n+ " consecutive ODD number is = "+ sumOfOdd);
		System.out.println("Sum of " + n+ " consecutive EVEN number is = "+ sumOfEven);
		System.out.println("Average of " + n+ " consecutive ODD number is = "+ averageOfOdd);
		System.out.println("Average of " + n+ " consecutive EVEN number is = "+ averageOfEven);
	}

}
