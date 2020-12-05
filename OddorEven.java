package basics;
import java.util.Scanner;
public class OddorEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		if(a%2==0)
		{
			//Formatted ouput 
			System.out.printf("%d is Even\n",a);
			//concatenating Output
			System.out.println("The number is Even "+a);
		}
		else
		{
			System.out.println("Odd");
		}

	}

}
