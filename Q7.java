package n.p1;
//-----------------Sum of integers between 100 and 200 divisible by 7-----------
public class Q7 {
	public static void main(String[] args) {
		int sum = 0;
		System.out.println("Number   Sum");
		for(int i=101; i<=200;i++) {
			if(i%7==0) {
				sum= sum + i;
				System.out.println(i+"      "+sum);
			}
		}
		System.out.print("Total Sum = "+ sum);
	}

}
