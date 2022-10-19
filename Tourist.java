package Mini_Project;

import java.util.*;

public class Tourist {
	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		try {
		Tourist_Places t = new Tourist_Places();
		
		while (true) {
			System.out.println("\nWelcome To Tourist Management System ...\n");
			System.out.println("PLease Select Your City \n"
					+ "\n1.Chennai\n2.Bangalore\n");
			int Choice = sc.nextInt();

			
				switch (Choice) {

				case 1:

					t.Chennai();
					break;

				case 2:

					t.Bangalore();
					break;

				default:
					System.out.println("Sorry you are  Selected Wrong Choice ,Pleace Select Correct One");
					break;
				}
			} 

		}
		catch (Exception e) {
			System.out.println("Sorry Wrong Search!!!");
		}
	}

}
class Tourist_Data extends Tourist
{
	 static final int Speed = 0;
		static HashMap<String, Integer> h1 = new HashMap<String, Integer>();
		static HashMap<String, Integer> h2 = new HashMap<String, Integer>();
	    static float speed1=0.5f;
	    static int speed2=1;
	    static float speed3=1.5f;
	    static String place;
	    static String place12;
	
	    static int count=0;
}

class Tourist_Places extends Tourist_Data {
	
	public  void Chennai()
	{
		

		h1.put("MARINABEACH", 14);
		h1.put("ELLIOT'SBEACH", 17);
		h1.put("VALLUVARKOTTAM", 7);
		h1.put("VADAPALANIMURUGANTEMPLE", 2);
		h1.put("SEMMOZHLIPOONGA", 8);
		h1.put("RIPPONBUILDING", 10);
		h1.put("VANDALOORZOO", 30);
		h1.put("GUINDYNATIONALPARK", 13);
		h1.put("VGPMARINEKINGDOM", 25);
		h1.put("TNAGAR", 8);
		h1.put("GOVERMENTMUSIEUM", 9);
		h1.put("DHAKSHANACHITRA", 37);	
		h1.put("CONNEMORAPUBLICLIBRARY", 9);	
		h1.put("MYLAPORE", 11);	
		h1.put("SOWKARPET",12 );	
		h1.put("BONDYBAZZAR", 8);
		h1.put("MGRFLIMCITY", 16);	
		h1.put("QUEENSLAND",23 );	
		h1.put("PARISCORNER", 12);	
		h1.put("RAYAPURAMFISHINGHARBOUR", 16);	
		
			
		System.out.println("\n**********************");

		for (Map.Entry m : h1.entrySet()) {

			System.out.println(++count+"."+m.getKey());

		}
		System.out.println("\n**********************");
 
		
		try {
			System.out.println("\nPleace Enter Your Destination  Place in Chennai From CMBT\n");
			 place = sc.next();
			 place12=place.toUpperCase();
			System.out.println("Your Selected Place Is "+place12+"\n");
		} catch (Exception e) {
			System.out.println("Sorry");
		}

			if (h1.containsKey(place12)) {
				int Distance = h1.get(place12);
				System.out.println("Your Distance Is " + Distance+" km.");
				System.out.println("\nSelect Your Speed\n1.10 to 40kmphr\n2.40 to 80kmphr\n3.80 and above kmphr:");
				int selectspeed = sc.nextInt();
				if(selectspeed==1)
				{
				int Time = (int) ((int) Distance / speed1);
				
				System.out.println("You Reached " + place12 + " in " + Time  + " Mints");
				System.out.println("\nHappy And Safe Journey. ");
				}
				else if(selectspeed==2)
				{
					int Time = (int) ((int) Distance / speed2);
					
					System.out.println("You Reached " + place12 + " in " + Time + " Mints");
					System.out.println("\nHappy And Safe Journey. ");
			    }
				else if(selectspeed==3)
				{
					int Time = (int) ((int) Distance / speed3);
					
					System.out.println("You Reached " + place12 + " in " + Time + " Mints");
					System.out.println("\nHappy And Safe Journey. ");

				}
				else
				{
					System.out.println("Sorry Wrong Speed");
				}
				
				
			}

		

	}

	public  void Bangalore()
	{
				
		h2.put("bangalorepalace", 5);
		h2.put("nandihills", 60);
		h2.put("cubbonpark", 3);
		h2.put("iskontemple", 6);
		h2.put("shivatemple", 10);
		h2.put("wonderla", 3);
		h2.put("tippusultanpalace", 3);
		h2.put("commercialstreet", 6);
		h2.put("innovativeflimcity", 33);
		h2.put("vidhanasoudha", 4);
		h2.put("kirshnarajanmarket", 10);
		h2.put("mgroad", 7);
		h2.put("devenabalifort", 36);
		h2.put("govermentmuseum", 5);
		h2.put("tippusultansummerpalace", 4);
		h2.put("ubcitymall", 6);
		h2.put("botanicalgardens", 5);
System.out.println("\n**********************");
		for (Map.Entry m : h2.entrySet()) {

			System.out.println(++count+"."+m.getKey());

		}
		System.out.println("\n**********************");

		
		try {

			System.out.println("\n   Pleace Enter Your Destination  Place in Bangalore from Bangabre Busstop    ");
			  place = sc.next();
			place12=place.toLowerCase();
			 System.out.println("\nYour Selected Place Is "+place12+"\n");
		}catch (Exception e) {
			System.out.println("Sorry");
		}

			if (h2.containsKey(place12)) {
				int Distance1 = h2.get(place12);
				System.out.println("Your Distance Is " + Distance1+" km.");
				
				System.out.println("Select Your Speed\n1.10 to 40kmphr\n2.40 to 80kmphr\n3.80 and above kmphr:");
				int selectspeed = sc.nextInt();
				if(selectspeed==1)
				{
				int Time1 = (int) ((int) Distance1 / speed1);
				System.out.println("You Reached " + place12 + " in " + Time1 + " Mints");
				System.out.println("\nHappy And Safe Journey. ");
				}
				else if(selectspeed==2)
				{
					int Time1 = (int) ((int) Distance1 / speed2);
					System.out.println("You Reached " + place12 + " in " + Time1 + " Mints");
					System.out.println("\nHappy And Safe Journey. ");
			    }
				else if(selectspeed==3)
				{
					int Time1 = (int) ((int) Distance1 / speed3);
					System.out.println("You Reached " + place12 + " in " + Time1 + " Mints");
					System.out.println("\nHappy And Safe Journey. ");

				}
				else
				{
					System.out.println("Sorry Wrong Speed");
				}

			}
		}
		

	
}