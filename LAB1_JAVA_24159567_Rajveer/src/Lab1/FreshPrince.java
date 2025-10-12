package Lab1;

public class FreshPrince{
	
    static void Task1() {

        //Printing strings with println statements (always prints in the new line)
		System.out.println("Yo, this is a story all about how");
		System.out.println("My life got flipped, turned upside-down");
		System.out.println("And I'd like to take a minute,");
		System.out.println("just sit right there");
		System.out.println("I'll tell you how I became the prince");
		System.out.println("of a town called Bel-Air");
	}
    
    static void Task2() {
    	
    	String homeTown = "West Philadelphia";
    	String place = "On the playground"; 
    	String activity = "shootin' some b-ball";
    	
    	System.out.println("In " + homeTown + ", born and raised");
    	System.out.println( place + " was where I spent most of my days ");
    	System.out.println("Chillin' out, maxin', relaxin' all cool ");
    	System.out.println("And all " + activity + " outside of the school");
    }
    
    static void Task3() {
    	String newTown = "West Philadelphia";
    	String place = "On the playground"; 
    	String activity = "shootin' some b-ball";
    	
    
		System.out.println("In " + newTown + ", born and raised");
    	System.out.println( place + " was where I spent most of my days ");
    	System.out.println("Chillin' out, maxin', relaxin' all cool ");
    	System.out.println("And all " + activity + " outside of the school");
    }
	
	 public static void main(String[] args) {
         // Main method - Executes all three tasks in sequence
		 System.out.println("Task 1" );
		 Task1(); 
		 System.out.println("");  //creates a line gap between each functions.
		 System.out.println("Task 2");
		 Task2();
		 System.out.println("");
		 System.out.println("Task 3");
		 Task3();
	    }
	
}