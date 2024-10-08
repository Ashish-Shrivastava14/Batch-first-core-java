package day4;

public class LargestOf3Numbers {

	/*
	Pre-requiste: all the numbers are having different values

	a>b and a>c   -- a is largest
	b>a  and b>c   --- b is largest
	c>a and c>b   -- c largest 
	*/

	public static void main(String[] args) {
		
int a=10, b=40,c=30;
		
		if(a>b && a>c)
		{
			System.out.println("a is largest number");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is largest number");
		}
		else
		{
			System.out.println("c is largest number");
		}


	}

}
