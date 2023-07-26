package trainManagementSystem;
import java.io.*;
import java.util.Scanner;

public class Passenger extends Train{
	 //Refactoring technique has been used
	//In Extract Class technique, created a new class and 
	//place the fields and methods responsible for the relevant functionality in it.
		Scanner scan = new Scanner(System.in);
		
		//overriding
		void Access()
		{
			int who = 0;
			while(who < 12)
			{
					who++;
			 System.out.println("\n 1>> Show Details of Availaible Trains ");
			 System.out.println(" 2>> Reserve Economy Class Train ");
			 System.out.println(" 3>> Reserve Business Class Train ");
			 System.out.println(" 4>> Passenger Feedback ");
			 System.out.println(" 5>> Exit ");
			 System.out.print(" -->> ");
			 int a = scan.nextInt();
			 
			 if(a==1)
			 {
				 Show_Records_of_All_Train();	
			 }
			
			 else if (a == 2)
			 {
				String Eco ="ECONOMY CLASS";
				//overloading
				Reserve_Class_Train(Eco);	 
			 }
			 
			 else if (a == 3)
			 {
				//overloading
				 Reserve_Class_Train();
			 }
			 else if(a == 4)
			 {
				 String Ratng = " ";
				 System.out.print("Enter your name: ");
				 String Passenger_n = scan.next();	
				 System.out.print("Enter rating out of 5: ");
				 int ratings = scan.nextInt();
				 
				 for (int rab = 0 ; rab < ratings ; rab++)
				 {
					 Ratng = Ratng + "* ";			 
				 }
				 if(ratings == 5)
				 {
					 Ratng =Ratng + " Excellent Service ";
				 }
				 else if(ratings == 4)
				 {
					 Ratng =Ratng + " Good Service ";
				 }
				 else if(ratings == 3)
				 {
					 Ratng =Ratng + " Average Service ";
				 }
				 else if(ratings == 2)
				 {
					 Ratng =Ratng + " Poor Service ";
				 }
				 else if(ratings == 1)
				 {
					 Ratng =Ratng + " Very Bad Service ";
				 }
				 else if(ratings >= 6)
				 {
					 Ratng =Ratng + " invalid rating ";
				 }
				 
				 for (int ra = who-1 ; ra < who ; ra++)
				 {
					 Passenger_name[ra] = Passenger_n;
					 Rating [ra] = Ratng;
				 }
				 
				 Ratings();
			 }
			 else if(a == 5 || a >=5 )
			 {
				 System.out.println("\nHave a nice day...!");
				 break;
			 }
		}
		}
		public void Show_Records_of_All_Train()
		{
			System.out.println("\t\t>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println("\t\t| BUSINESS CLASS TRAIN |");
			System.out.println("\t\t<<<<<<<<<<<<<<<<<<<<<<<<<<<\n"); 
				 
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
			
				System.out.println("\t\t>>>>>>>>>>>>>>>>>>>>>>>>>>>");
				System.out.println("\t\t| ECONOMY CLASS TRAIN |");
				System.out.println("\t\t<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");
				 
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
		
		 public void Reserve_Class_Train (String eco)
		 {
			 System.out.println(eco);
			 boolean flag = true;
			 System.out.print("ENTER YOUR DESTINATION: ");
			 String E_D = scan.next();
			 set_passenger_economy_destination(E_D);
			 
			 for (int d = 0 ; d < ID_e.length ; d++ )
			 {
				 if(City_e[d].equals(get_passenger_economy_destination()))
				 {
					 flag = false;
					 
					 
					 System.out.println("ID = " + ID_e[d]);
					 System.out.println("Available Seats = " + SeatsAvailableInEconomy[d]);
					 System.out.println("Price = " + Price_e[d]);
					 System.out.println("City = " + City_e[d]);
					 System.out.println("Departure Time = " + departure_Time_e[d]);
					 System.out.println("Day = " + Day_e[d]+"\n");
					 
					 System.out.print("\nDo you want to reserve seat? (yes or no)\n>>");
					String Eco_reservation = scan.next();
					set_reservation_economy_confirmation(Eco_reservation);
					
					 if (get_reservation_economy_confirmation().equals("yes"))
					 {
						 System.out.print("\nEnter name you want to reserve Ticket on ?\n");
						 String Eco_P_name=scan.next();
						 set_passenger_economy_name(Eco_P_name);
						 
						 System.out.print("\nHow many seats you want to reserve ?\n");
						 int Eco_seats=scan.nextInt();
						 set_passenger_economy_seat(Eco_seats);
						 
						 if(get_passenger_economy_seat()<=SeatsAvailableInEconomy[d])
						 {
						 SeatsAvailableInEconomy[d] = SeatsAvailableInEconomy[d] - get_passenger_economy_seat();
						 
						  
						    System.out.println("\t_________________________________________________________");
						    System.out.println("\n\t|| \t\t\t TICKET\t\t\t\t||");
							System.out.println("\t|| Name: "+get_passenger_economy_name()+"\t\t\t\t\t\t||");
							for(int i=(SeatsAvailableInEconomy[d]+1) ; i<=(get_passenger_economy_seat()+SeatsAvailableInEconomy[d]) ; i++)
							{
								System.out.println("\t|| Seat number : "+i+"\t\t\t\t\t||");
							}
							System.out.println("\t|| Train ID : " + ID_e[d]+"\t\t\t\t\t||");
							System.out.println("\t|| Price of "+get_passenger_economy_seat()+" seats : "+(get_passenger_economy_seat()*Price_e[d])+"\t\t\t\t||");
							System.out.println("\t|| City : " + City_e[d]+"\t\t\t\t\t||");
							System.out.println("\t|| Departure Time : " + departure_Time_e[d]+"\t\t\t\t||");
							System.out.println("\t|| Day : " + Day_e[d]+"\t\t\t\t\t||");
							System.out.println("\t|| Note: Arrive 15 minutes before departure time\t||\n\t||");
							System.out.println("\t^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
					 }
						 else
						 {
							 System.out.println("Only "+SeatsAvailableInEconomy[d]+ " seats available in this train....!\n\n ");  
						 }
					 }
				 }
			 }
			 if(flag == true)
			 {
				 System.out.println("No train availabe for "+get_passenger_economy_destination()+ " city....!\n"); 
			 } 
		 }
		 
		 public void Reserve_Class_Train()
		 {
			 System.out.println("BUSINESS CLASS");
			 boolean flag1 = true;
			 System.out.print("ENTER YOUR DESTINATION: ");
			 String B_D = scan.next();
			 set_passenger_business_destination(B_D);
			 
			 for (int d = 0 ; d < ID_b.length ; d++ )
			 {
				 if(City_b[d].equals(get_passenger_business_destination()))
				 {
					 flag1 = false;
					
					 System.out.println("ID = " + ID_b[d]);
					 System.out.println("Available Seats = " + Seats_Available_b[d]);
					 System.out.println("Price = " + Price_b[d]);
					 System.out.println("City = " + City_b[d]);
					 System.out.println("Departure Time = " + departure_Time_b[d]);
					 System.out.println("Day = " + Day_b[d]+"\n");
					 
					 System.out.print("\nDo you want to reserve seat? (yes or no)\n>>");
					 String bus_reserve = scan.next();
					 set_reservation_business_confirmation(bus_reserve);
					 
					 if (get_reservation_business_confirmation().equals("yes"))
					 {
						 System.out.print("\nEnter name you want to reserve Ticket on ?");
						 String Bus_P_name=scan.next();
						 set_passenger_business_name(Bus_P_name);
						 
						 System.out.print("\nHow many seats you want to reserve?");
						 int Bus_seats=scan.nextInt();
						 set_passenger_business_seat(Bus_seats);
						 
						 if(get_passenger_business_seat()<=Seats_Available_b[d])
						 {
						 Seats_Available_b[d] = Seats_Available_b[d] - get_passenger_business_seat();
						 
						    System.out.println("\t__________________________________________________________");
							System.out.println("\n\t|| \t\t\t TICKET\t\t\t\t||");
							System.out.println("\t|| Name: "+get_passenger_business_name()+"\t\t\t\t\t\t||");
							for(int i=(Seats_Available_b[d]+1) ; i<=(get_passenger_business_seat()+Seats_Available_b[d]) ; i++)
							{
								System.out.println("\t|| Seat number : "+i+"\t\t\t\t\t||");
							}
							System.out.println("\t|| Train ID : " + ID_b[d]+"\t\t\t\t\t||");
							System.out.println("\t|| Price of "+get_passenger_business_seat()+" seats : "+(get_passenger_business_seat()*Price_b[d])+"\t\t\t\t||");
							System.out.println("\t|| City : " + City_b[d]+"\t\t\t\t\t||");
							System.out.println("\t|| Departure Time : " + departure_Time_b[d]+"\t\t\t\t||");
							System.out.println("\t|| Day : " + Day_b[d]+"\t\t\t\t\t||");
							System.out.println("\t|| Note: Arrive 15 minutes before departure time\t||\n\t||");
							System.out.println("\t^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
					 }
						 else
						 {
							 System.out.println("Only "+Seats_Available_b[d]+ " seats available in this train....! \n\n"); 
						 }
					 }
				 }
			 }
			 if(flag1 == true)
			 {
				 System.out.println("No train availabe for "+get_passenger_business_destination()+ " city....!\n"); 
			 } 
		 }
		public void Ratings ()
		{
			 try {
					File rate = new File("Feedback.txt");
					rate.delete();	
					if (rate.createNewFile()) 
					{
						FileWriter writer = new FileWriter("Feedback.txt");
						for(int ra = 0 ; ra < 7 ; ra++)
						{
							if(Passenger_name[ra] != " ")
							{
								writer.write(Passenger_name[ra] + " : " + Rating [ra]+"\n");							
							}
		
						}
						
						writer.close();
						System.out.println("Rating done...!");
					}
				} 
				catch (IOException e) {
					System.out.println("Error while rating...!");
					e.printStackTrace();
				}
		}

}
