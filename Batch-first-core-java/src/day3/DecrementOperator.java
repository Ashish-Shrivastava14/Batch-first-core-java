package day3;

public class DecrementOperator {

	public static void main(String[] args) {
		/*int a=100;
		a=a-1;
		System.out.println(a); //99
		*/
		
		//post decrement
		
		/*int a=100;
		int res=a--;
		System.out.println(res); //100
		*/
		
		//pre-decrement
		int a=100;
		int res=--a;
		System.out.println(res); //99
		int res1=--res;
		System.out.println(res1);
			

	}

}
