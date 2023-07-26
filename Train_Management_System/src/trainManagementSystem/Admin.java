package trainManagementSystem;
import java.io.*;
import java.util.Scanner;

public class Admin extends Train{

	private int[] ID_admin = {52023 , 52030 , 49251 , 17115};
	private String[] Pass = {"Wajiha123", "Yasir123" , "Haseeb123" , "Ali123"}; 
	Scanner scan = new Scanner(System.in);
	
	//overriding
	void Access ()
	{
		System.out.print("ENTER ID : ");
		int id = scan.nextInt();
		
		System.out.print("ENTER Password : ");
		String password = scan.next();
		
	 for(int i = 0 ; i < 4 ; i++)
	 {
		 if(ID_admin[i] == id)
		 {
			 if (Pass[i].equals(password))
					 
			 {
				 int who = 0;
					while(who < 12)
					{
				 System.out.println("\n 1>> Add Record of any train ");
				 System.out.println(" 2>> Delete Record of any train ");
				 System.out.println(" 3>> Edit Record of any train ");
				 System.out.println(" 4>> Show Record of all train ");
				 System.out.println(" 5>> Show Records of specific train ");
				 System.out.println(" 6>> Show All Feedbacks ");
				 System.out.println(" 7>> Exit ");
				 System.out.print(" -->> ");
				 int a = scan.nextInt();
				 if(a==1)
				 {
					 System.out.println("Choose your Train Class to ADD: (1) Business or (2) Economy");
					 int b = scan.nextInt();
					 
						 
					 System.out.println("Enter Train Id: ");
					 int trainid = scan.nextInt();
					 System.out.println("Enter Train Seats Availaible: ");
					 int seatsavailaible = scan.nextInt();
					 System.out.println("Enter Train Ticket Price: ");
					 int price = scan.nextInt();
					 System.out.println("Enter City: ");
					 String city = scan.next();
					 System.out.println("Enter Train Departure Time: ");
					 String departure = scan.next();
					 System.out.println("Enter Train Departure Day: ");
					 String day = scan.next(); 
					 
					 
					 if(b==1)
					 {
						 ID_b[6] = trainid;
						 Seats_Available_b[6] = seatsavailaible;
						 Price_b[6] = price;
						 City_b[6]=city;
						 departure_Time_b[6] = departure;
						 Day_b[6] = day; 
						 
					 }
					 else if (b==2)
					 {
						 ID_e[6] = trainid;
						 SeatsAvailableInEconomy[6] = seatsavailaible;
						 Price_e[6] = price;
						 City_e[6]=city;
						 departure_Time_e[6] = departure;
						 Day_e[6] = day; 
						 
					 }
					 else
					 {
						 System.out.println("INVALID CHOICE....!!");
					 }
					 
				 }
				 else if (a==2)
				 {
					 System.out.println("Choose your Train Class to Delete: (1) Business or (2) Economy");
					 int b = scan.nextInt();
					 
					 if(b==1)
					 {
						 System.out.println("Enter Train Id: ");
						 int trainid = scan.nextInt(); 
						 for (int d = 0 ; d < ID_b.length ; d++ )
						 {
							 if(trainid == ID_b[d])
							 {
								 ID_b[d] = 0;
								 Seats_Available_b[d] = 0;
								 Price_b[d] = 0;
								 City_b[d] = " ";
								 departure_Time_b[d] = " ";
								 Day_b[d] = " ";
								 System.out.println("Deleted...!");
							 }
						 }	 
					 }
					 else if (b==2)
					 {
						 
						 System.out.println("Enter Train Id: ");
						 int trainid = scan.nextInt(); 
						 for (int d = 0 ; d < ID_e.length ; d++)
						 {
							 if(trainid == ID_e[d])
							 {
								 ID_e[d] = 0;
								 SeatsAvailableInEconomy[d] = 0;
								 Price_e[d] = 0;
								 City_e[d] = " ";
								 departure_Time_e[d] = " ";
								 Day_e[d] = " "; 
								 System.out.println("Deleted...!");
							 }
						 }
						 
					 }
					 
					 
				 }
				 else if (a==3)
				 {
					 System.out.println("Choose your Train Class to EDIT: (1) Business or (2) Economy");
					 int b = scan.nextInt();
					 
					 if(b==1)
					 {
						 System.out.print("Enter the Id of train you want to edit details of : ");
						 int trainid = scan.nextInt(); 
						 boolean flag4 = true;
						 
						
						 
						 for (int d = 0 ; d < ID_b.length ; d++ )
						 {
							 if(trainid == ID_b[d])
							 {
								 flag4 = false;
								 System.out.println("Enter Train Id: ");
								 int newid = scan.nextInt();
								 System.out.println("Enter Train Seats Availaible: ");
								 int newseatsavailaible = scan.nextInt();
								 System.out.println("Enter Train Ticket Price: ");
								 int newprice = scan.nextInt();
								 System.out.println("Enter City: ");
								 String newcity = scan.next();
								 System.out.println("Enter Train Departure Time: ");
								 String newdeparture = scan.next();
								 System.out.println("Enter Train Departure Day: ");
								 String newday = scan.next(); 
								 
								 ID_b[d] = newid;
								 Seats_Available_b[d] = newseatsavailaible;
								 Price_b[d] = newprice;
								 City_b[d] = newcity;
								 departure_Time_b[d] = newdeparture;
								 Day_b[d] = newday; 
								 System.out.println("Saved...!");
							 }
						 }
						 if(flag4 == true)
						 {
							 System.out.println("invalid id.....!");
						 }
					 }
					 else if (b==2)
					 {
						 
						 System.out.print("Enter the Id of train you want to edit details of : ");
						 int trainid = scan.nextInt(); 
						 
						 boolean flag5 = true;
						 for (int d = 0 ; d < ID_e.length ; d++ )
						 {
							 if(trainid == ID_e[d])
							 {
								 flag5 = false;
								 System.out.println("Enter Train Id: ");
								 int newid = scan.nextInt();
								 System.out.println("Enter Train Seats Availaible: ");
								 int newseatsavailaible = scan.nextInt();
								 System.out.println("Enter Train Ticket Price: ");
								 int newprice = scan.nextInt();
								 System.out.println("Enter City: ");
								 String newcity = scan.next();
								 System.out.println("Enter Train Departure Time: ");
								 String newdeparture = scan.next();
								 System.out.println("Enter Train Departure Day: ");
								 String newday = scan.next(); 
								 
								 ID_e[d] = newid;
								 SeatsAvailableInEconomy[d] = newseatsavailaible;
								 Price_e[d] = newprice;
								 City_e[d] = newcity;
								 departure_Time_e[d] = newdeparture;
								 Day_e[d] = newday; 
								 System.out.println("Saved...!");
							 } 
						 }
						 if(flag5 == true)
						 {
							 System.out.println("invalid id.....!");
						 }
						 
					 }
					 
				 }
				 else if (a==4)
				 {

					 System.out.println("Choose your Train Class to show data: (1) Business or (2) Economy");
					 int b = scan.nextInt();
					 
					 if(b==1)
					 {
						 
						 
						 for (int d = 0 ; d < ID_b.length ; d++ )
						 {
							 if(ID_b[d] != 0)
							 {
								 System.out.println("\nTrain "+(d+1));
								 System.out.println("ID = " + ID_b[d]);
								 System.out.println("Available Seats = " + Seats_Available_b[d]);
								 System.out.println("Price = " + Price_b[d]);
								 System.out.println("City = " + City_b[d]);
								 System.out.println("Departure Time = " + departure_Time_b[d]);
								 System.out.println("Day = " + Day_b[d]+"\n");
				
							 }
						 }	 
					 }
					 else if (b==2)
					 {
						 
						 for (int d = 0 ; d < ID_e.length ; d++ )
						 {
							 if(ID_e[d] != 0)
							 {
								 System.out.println("\nTrain "+(d+1));
								 System.out.println("ID = " + ID_e[d]);
								 System.out.println("Available Seats = " + SeatsAvailableInEconomy[d]);
								 System.out.println("Price = " + Price_e[d]);
								 System.out.println("City = " + City_e[d]);
								 System.out.println("Departure Time = " + departure_Time_e[d]);
								 System.out.println("Day = " + Day_e[d]+"\n");
				
							 }
						 }
						 
					 }
					 
				 }
				 else if (a==5)
				 {

					 System.out.println("Choose your Train Class to show data: (1) Business or (2) Economy");
					 int b = scan.nextInt();
					 
					 if(b==1)
					 {
						 
						 System.out.print("Enter the Id of specific train you want to see : ");
						 int trainid = scan.nextInt(); 
						 boolean flag2 = true;
						 
						 for (int d = 0 ; d < ID_b.length ; d++ )
						 {
							 if(trainid == ID_b[d])
							 {
								 System.out.println("\nTrain "+(d+1));
								 System.out.println("ID = " + ID_b[d]);
								 System.out.println("Available Seats = " + Seats_Available_b[d]);
								 System.out.println("Price = " + Price_b[d]);
								 System.out.println("City = " + City_b[d]);
								 System.out.println("Departure Time = " + departure_Time_b[d]);
								 System.out.println("Day = " + Day_b[d]+"\n");
								 flag2 = false;
							 }
							 
						 }	 
						 if (flag2 == true)
						 {
							 System.out.println("invalid id...!");
						 }
					 }
					 else if (b==2)
					 {
						 
						 System.out.print("Enter the Id of specific train you want to see : ");
						 int trainid = scan.nextInt(); 
						 boolean flag3 = true;
						 for (int d = 0 ; d < ID_e.length ; d++ )
						 {
							 if(trainid == ID_e[d])
							 {
								 System.out.println("\nTrain "+(d+1));
								 System.out.println("ID = " + ID_e[d]);
								 System.out.println("Available Seats = " + SeatsAvailableInEconomy[d]);
								 System.out.println("Price = " + Price_e[d]);
								 System.out.println("City = " + City_e[d]);
								 System.out.println("Departure Time = " + departure_Time_e[d]);
								 System.out.println("Day = " + Day_e[d]+"\n");
								 flag3 = false;
				
							 }
						 }
						 if(flag3 == true)
						 {
							 System.out.println("invalid id...!");
						 }
					 } 
				 }
				 else if (a==6)
				 {
					 System.out.println("\t\tFEEDBACKS");
					 try {
						 File f = new File ("Feedback.txt");
						 Scanner fileReader = new Scanner(f);
						 while(fileReader.hasNextLine())
						 {
							 String Feedbacks = fileReader.nextLine();
							 System.out.println(Feedbacks);
						 }
						 fileReader.close();
						 
					 }
					 catch(Exception e)
					 {
						 e.printStackTrace();
						 System.out.println("Error while seeing feedbacks...!");
					 }
				 }
				 else if (a==7)
				 {
					 break;
				 }
				}
		 }
		 }	
	 }
	}
}
