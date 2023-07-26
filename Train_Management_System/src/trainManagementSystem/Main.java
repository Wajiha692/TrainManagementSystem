package trainManagementSystem;
import java.util.Scanner;

public class Main {

	public static void main (String[] args)
	{
		Train o = new Train();
		o.Access();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("\n 1 >>PASSSENGER \n 2 >>ADMINISTRATION DEPARTMENT\n >> ");
		int choice = scan.nextInt();
		
		if (choice == 1)
		{
			Passenger P = new Passenger(); 
			P.Access();
		}
		else if(choice == 2)
		{
			Admin A = new Admin();
			A.Access();
		}
		}	
}
