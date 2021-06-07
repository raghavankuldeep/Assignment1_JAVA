package n.p1;
// 5 random numbers between 1 to 100
public class Q3_randomGen {
	public static void main(String[] args) {
		
		//int z = (int) Math.random();//narrow casting double to integer
	//----Formula : (Math.random()*(max-min)+min);----------------------------
		int max = 100, min = 1;    // max excluded--
		int ranNum1 = (int)((Math.random()*99)+1); 
		int ranNum2 = (int)((Math.random()*99)+1);
		int ranNum3 = (int)((Math.random()*99)+1);
		int ranNum4 = (int)((Math.random()*99)+1);
		int ranNum5 = (int)((Math.random()*99)+1);
		System.out.print( "random Num1  "+ ranNum1+"\n"+
				          "random Num2  "+ ranNum2+"\n"+
				          "random Num3  "+ ranNum3+"\n"+
				          "random Num4  "+ ranNum4+"\n"+
				          "random Num5  "+ ranNum5+"\n");
	}
}
