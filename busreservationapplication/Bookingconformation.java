package busreservationapplication;

import java.util.Scanner; //nested package/ hierarchical package
import java.util.ArrayList;

public class Bookingconformation{

	public static void main(String[] args) {
		
	
		ArrayList<Businfo> buses = new ArrayList<Businfo>();
		ArrayList<Bookinginfo> bookings = new ArrayList<Bookinginfo>();
		
		buses.add(new Businfo(1,true,2));
		buses.add(new Businfo(2,false,4));
		buses.add(new Businfo(3,true,5));
		
		int userOpt = 1;
		Scanner scanner = new Scanner(System.in);
		
		for(Businfo b:buses) {
			b.displayBusInfo();
		}
		while(userOpt==1) {
			System.out.println("Enter 1 to Book and ok to exit");
			userOpt = scanner.nextInt();
			if(userOpt == 1) {
				Bookinginfo booking = new Bookinginfo();
				if(booking.isAvailable(bookings,buses)) {
					bookings.add(booking);
					System.out.println("Your booking is confirmed");
				}
				else
					System.out.println("sorry :( ...Seats not availble You can book other bus or date... Thank you:) ");
			}
		}
	}

}
