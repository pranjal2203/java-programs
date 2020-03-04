import java.util.Scanner;


public class question_8 
{
	public static void main(String args[])
	{
		Scanner val = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = val.nextInt();
		
		switch (num)
		{
		case(1):
			System.out.println("The entered number is ONE");
		break;
		
		case (2):
			System.out.println("The entered number is TWO");
		break;
		
		case(3):
			System.out.println("The entered number is THREE");
		break;
		
		case(4):
			System.out.println("The entered number is FOUR");
		break;
		
		case(5):
			System.out.println("The entered number is FIVE");
		break;
		
		case(6):
			System.out.println("The entered number is SIX");
		break;
		
		case(7):
			System.out.println("The entered number is SEVEN");
		break;
		
		case(8):
			System.out.println("The entered number is EIGHT");
		break;
		
		case(9):
			System.out.println("The entered number is NINE");
		break;
		
		default:
			System.out.println("The entered number is out of bounds");
			
		}
		
	}
}
