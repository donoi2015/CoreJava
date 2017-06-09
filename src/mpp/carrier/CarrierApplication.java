package mpp.carrier;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class CarrierApplication {
	public static void main(String[] args) {
		while (true) {
			Scanner in = new Scanner(System.in);
			putText("Enter a customer AGE:");
			int age = in.nextInt();
			Person customer = new Person(age);
			try {
				putText("Is student?(Y/N)");
				int choice = getChar();
				if(choice == 'Y')
					customer = new Student();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
			putText("Enter a number of package:");
			int numOfPackages = in.nextInt();
			
			String description = "";
			double weight = 0;
			String zone = "";
			FedEx fedEx;
			Ups ups;
			UsMail usMail;
			StringBuilder txt = new StringBuilder(String.format("\n%-20s %-10s $%-10s %-10s\n\n", "Description", "Weight", "Price", "Company"));
			double totalPrice = 0;
			
			while (numOfPackages > 0) {
				try {
					putText("\nEnter package description:");
					description = getString();
					putText("Enter package weight:");
					weight = getDouble();
					putText("Enter package zone:");
					zone = getString();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ups = new Ups(description, weight);
				usMail = new UsMail(description, weight);
				fedEx = new FedEx(description, weight, zone);
				
				ArrayList<ICarrier> carriers = new ArrayList<>();
				carriers.add(ups);
				carriers.add(usMail);
				carriers.add(fedEx);
				
				double minPrice = carriers.get(0).calculatePrice();
				int minObjIndex = 0;
				for(ICarrier carrier : carriers) {
					if(carrier.calculatePrice() < minPrice) {
						minObjIndex = carriers.indexOf(carrier);
						minPrice = carrier.getPrice();
					}
				}
				
				txt.append(String.format("%-20s %-10.2f $%-10.2f %-10s\n", description, weight, carriers.get(minObjIndex).getPrice(), carriers.get(minObjIndex).getClass().getSimpleName()));
				totalPrice += carriers.get(minObjIndex).getPrice();
				
//				double ups_price = ups.calculatePrice();
//				double usMail_price = usMail.calculatePrice();
//				double fedEx_price = fedEx.calculatePrice();
//				
//				if(ups_price < usMail_price && ups_price < fedEx_price) {
//					txt += String.format("%-20s %-5.2f $%-5.2f %-5s\n", description, weight, ups_price, "UPS");
//				}
//				else if(usMail_price < ups_price && usMail_price < fedEx_price) {
//					txt += String.format("%-20s %-5.2f $%-5.2f %-5s\n", description, weight, usMail_price, "US Mail");
//				}
//				else /*(fedEx_price < usMail_price && fedEx_price < ups_price)*/ {
//					txt += String.format("%-20s %-5.2f $%-5.2f %-5s\n", description, weight, fedEx_price, "FedEx");
//				}
				numOfPackages --;
			}
			
			putText(txt.toString());
			putText(String.format("\nTOTAL PRICE : %.2f", totalPrice));
			putText(String.format("DISCOUNT : %d", customer.getDiscountPercent()));
			putText(String.format("GRAND TOTAL : %.2f", totalPrice * (100 - customer.getDiscountPercent()) / 100));
			putText("----------------------------------------------------------------");
			
		}
	}

	private static void putText(String s) // writes string s to the screen
	{
		System.out.println(s);
	}
	
	private static char getChar() throws IOException //reads a character from the keyboard input
    {
	    String s = getString();
	    return s.charAt(0);
    }

	private static String getString() throws IOException // reads a string from
														// the keyboard input
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		return br.readLine();
	}

	private static double getDouble() throws IOException // reads an double from
														// the keyboard input
	{
		String s = getString();
		return Double.valueOf(s);
	}

}
