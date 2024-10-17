package day7;

public class NumberOfEvenAndOddNumbersInArray {

	public static void main(String[] args) {
int a[]= {2,5,8,10,15,20,25};
		
		int even=0;
		int odd=0;
			
		
		for(int value:a)
		{
			if(value%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
					
		}
		
		System.out.println("Number of even numbers:"+ even);
		System.out.println("Number of odd numbers:"+odd);
		


	}

}
