import java.util.Scanner;
import java.util.Random;
/**
*
* This class represents a basic AI that will chat with a human user.
* It isn't very human-like. Yet...............
* @author Mitchell Pavlak AP Comp Sci Orndorff
* @version 0.1
*/



public class ChatBot
{
	public static void main(String[] args)
	{
	
	
	System.out.println("Hi I'm ChatBot. What is your name?");
	Scanner keyboard = new Scanner(System.in);
	String name = keyboard.nextLine();
	
	System.out.println("Hey " + name);
	System.out.println("Nice to meet you, how old are you?");
	int age = keyboard.nextInt();
	keyboard.nextLine();
	Random rand = new Random();
	int computerAge = Math.abs(rand.nextInt());
	// So the age isn't fixed
	while (computerAge/10000000 < 1)
	// the /10000000 is just because of the default num range, just making sure the num
	// has a good probability of being fairly low
	{
		computerAge = Math.abs(rand.nextInt());
	}
	computerAge = computerAge/10000000;
	
	if (age > computerAge)
		{
			System.out.println("Wow, that's old!");
			System.out.println("I'm " + computerAge + " years old");
			System.out.println("You are " + (age - computerAge) + " years  older than me!");
		} 
		else
		{
			System.out.println("You're making me feel old!!!");
			System.out.println("I'm " + computerAge + " years old...");
			System.out.println("How long until you turn " + (age + 1) + "?");
			keyboard.nextLine();
		
		}
		
		String answer = "anything other than bye" ;
		while (! answer.equals("bye") && ! answer.equals("Bye"))
		{
			System.out.println("Tell me one of your hobbies (or say \"bye\" or \"Bye\" to exit)");
			answer = keyboard.nextLine();
		}
	
	
	// To Do bye or Bye && and || --> done
	
	
	}

}