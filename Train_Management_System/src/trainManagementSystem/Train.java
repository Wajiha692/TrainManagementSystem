package trainManagementSystem;
import java.util.ArrayList;
public class Train {
	ArrayList<String> pName = new ArrayList<String>();
	private String passengerEconomyDestination;
	private String economyReservation;
	private String economyPassengerName;
	private int economySeat;
	
	private String passengerBusinessDestination;
	private String BusinessReservation;
	private String BusinessPassengerName;
	private int BusinessSeat;
	
	Train()
	{
		System.out.println("\t\t>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("\t\t| TRAIN RESERVATION SYSTEM |");
		System.out.println("\t\t<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");
	}
	//overriding
	void Access()
	{
		System.out.println("\t\t>>>>>>>>>");
		System.out.println("\t\t| START |");
		System.out.println("\t\t<<<<<<<<<\n");
	}
	
	//providing details of train
	protected int[] ID_e = {102, 103, 109, 107, 101, 108, 0};
	protected int[] SeatsAvailableInEconomy = {26, 18, 29, 14, 18, 27, 0};
	protected int[] Price_e = {3000, 3000, 3000, 3000, 3000, 3000, 0};
	protected String[] City_e = {"Lahore", "Peshawar", "Islamabad", "Karachi" ,"Rawalpindi", "Quetta" , " "};
	protected String[] departure_Time_e= {"11:00 pm","9:00 am","12:00 pm","3:00 pm","4:00 am","8:00 pm", " "};
	protected String[] Day_e = {"Friday", "Sunday", "Thursday", "Tuesday", "Monday", "Wednesday", " "};
	
	protected int[] ID_b = {52, 12, 32, 74, 21, 89, 0};
	protected int[] Seats_Available_b = {5, 9 ,10, 12, 6, 7, 0};
	protected int[] Price_b = {5000, 5000, 5000, 5000, 5000, 5000, 0};
	protected String[] City_b = {"Islamabad", "Peshawar" , "Rawalpindi", "Karachi" , "Quetta" , "Lahore", " "};
	protected String[] departure_Time_b = {"10:00 pm","8:00 am","9:00 pm","12:00 pm","6:00 am","4:00 pm", " "};
	protected String[] Day_b = {"Friday","Thursday","Monday","Tuesday","Wednesday","Sunday", " "};
	
	protected String[] Passenger_name= {" "," "," "," "," "," ", " "," "," "," ", " "};
	protected String[] Rating = {" ", " ", " ", " ", " ", " ", " "," "," "," ", " "};

	//encapsulation
	//getter and setter methods for economy train
	//Refactoring Technique has been used
	
	//Created getters and setters for a field instead of direct access within the class' methods.
	public void set_passenger_economy_destination(String b)
	{
		this.passengerEconomyDestination = b;
	}
	public String get_passenger_economy_destination()
	{
		return this.passengerEconomyDestination;
	}
	
	public void set_reservation_economy_confirmation(String b)
	{
		this.economyReservation = b;
	}
	public String get_reservation_economy_confirmation()
	{
		return this.economyReservation;
	}
	
	public void set_passenger_economy_name(String b)
	{
		this.economyPassengerName = b;
	}
	public String get_passenger_economy_name()
	{
		return this.economyPassengerName;
	}
	
	public void set_passenger_economy_seat(int b)
	{
		this.economySeat = b;
	}
	public int get_passenger_economy_seat()
	{
		return this.economySeat;
	}
	
	//getter and setter methods for business train
	public void set_passenger_business_destination(String b)
	{
		this.passengerBusinessDestination = b;
	}
	public String get_passenger_business_destination()
	{
		return this.passengerBusinessDestination;
	}
	public void set_reservation_business_confirmation(String b)
	{
		this.BusinessReservation = b;
	}
	public String get_reservation_business_confirmation()
	{
		return this.BusinessReservation;
	}
	
	public void set_passenger_business_name(String b)
	{
		this.BusinessPassengerName = b;
	}
	public String get_passenger_business_name()
	{
		return this.BusinessPassengerName;
	}
	
	public void set_passenger_business_seat(int b)
	{
		this.BusinessSeat = b;
	}
	public int get_passenger_business_seat()
	{
		return this.BusinessSeat;
	}
	
 public void test(String PassengerName) {
	 for(int i=0; i<pName.size(); i++) {
		 if(pNameget(i).equalIgnoreCase(PassengerName))
		 {
			 System.out.println("Print names");
			 break;
		 }
		 else {
			 System.out.println("invalid name");
		 }
	 }
 }
}
