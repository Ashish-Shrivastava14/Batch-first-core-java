package day5;

public class JumpingStatements {

	public static void main(String[] args) {
		/*for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				break;
			}
			System.out.println(i);
		}
		*/
		
		/*
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println(i); //1 2 3 4 
		}
		*/
		
		for(int i=1;i<=10;i++)
		{
			if(i==1 || i==3 || i==5 || i==7 ||i==9)
			{
				continue;
			}
			System.out.println(i); //1 2 3 4 
		}

	}

}
