
/* 	Sonia Sharma
	ICS3U
	Interactive Assignment
	Feb. 16th, 2021
	Description: This interactive assignment is for the user to interact with the computer by answering a simple series of questions
    			(i.e. what's your favorite colour, etc).
    This assignment demonstrates my understanding of incorporating variables, data-types & operators, using Math class for complex calculations,
    get user inputs via Scanner class, concatenation, use of comments, & using logic to program and provide a given output.
*/

// import classes 
import java.util.Scanner; // import Scanner class
import java.lang.Math; // import Math class

public class RandGame //
{
  public static void main(String[]args) //
  {
	Scanner keyb = new Scanner(System.in); //create link to input stream

	// Steps 1 & 2; Introduce User
	System.out.print(" Please enter your first name: ");
	String firstName = keyb.next(); // step1: get first name of user
	System.out.print(" Please enter your last name: ");
	String lastName = keyb.next(); // step1: get last name of user
	System.out.println(" Welcome "+firstName+" "+lastName+ ", AKA the greatest programmer in Mayfield!"); //step2: output greeting with concatenation
	
    //Steps 3-7; Calculations using Java operators
    System.out.println("\n Let's do some math calculations!!!!");
    System.out.print(" "+firstName+", enter an integer(a positive/negative number containing no fractions and/or decimals): ");
    int num1 = keyb.nextInt();// step3: get first integer from user
    System.out.print(" Enter another integer: ");
    int num2 = keyb.nextInt(); // step3: get second integer from user
    System.out.println(" The sum of your two numbers; "+num1+ "+"+num2+" is = "+(num1+num2));// step4: the addition of the user's two integers
	System.out.println(" The subtraction of your two numbers; "+num1+ "-"+num2+" is = "+ (num1-num2));// step5: the subtraction of the user's two integers
    System.out.println(" The product of your two numbers; " + num1+"x"+num2+" is = "+(num1*num2));// step6: multiplication of the user's two integers
    System.out.println(" "+num1+" to the power of "+num2+" is ="+Math.pow(num1,num2));// step7:user's first integer to the power of user's second integer using Math class
    
    // Steps 8 & 9; Characters
    System.out.println("\n Now, let's play around with characters!");
    System.out.print(" Please enter a character(a letter or a number): ");
    String chart1 = keyb.next(); // step8: get character from user
    System.out.print(" Please enter your second character: ");
    String chart2 = keyb.next(); // step8: get 2nd character from user
    System.out.print(" Please enter your third character: ");
    String chart3 = keyb.next(); // step8: get 3rd character from user
    System.out.print(" Please enter your fourth character: ");
    String chart4 = keyb.next(); // step8: get 4th character from user
    System.out.print(" Please enter your fifth character: ");
    String chart5 = keyb.next(); // step8: get 5th character from user
    System.out.println(" Hello"+chart3+num2+chart4+chart1+num1+chart5+chart2);
    
    //Steps 10 & 11; User's favorites
    System.out.println("\n Before I leave, i'd like to get to know you more "+firstName+" :) I'll be asking a series of questions and you'll enter your favorites!");
    System.out.print(" So "+firstName+", what's your favourite colour? ");
    String colour = keyb.next(); // step10: get user's favourite colour
    System.out.println(" Ooo that's a beautiful colour!!");
    System.out.print(" What's your favourite food? ");
    String food = keyb.next(); // step10: get user's favourite food
    System.out.println(" Mmm yummy! ");
	System.out.print(" Last but not least, what's your favorite animal? ");
    String animal = keyb.next(); // step10: get user's favourite animal
    System.out.println(" Aww me too :)");
    System.out.println(" Your favorite colour is "+food+animal+colour);// step11: user's favorites summarized into one word
    
    //Step 12: Thank you message to user
    System.out.println("\n Hello "+firstName+ "! Thank you for playing my game of random waste of the class time."); 
    System.out.println(" But your last name "+ lastName+ " is pretty non-random."); 
    System.out.println(" If you were to say "+firstName+" "+num1+" times, maybe the computer fairy will appear and grant you "+num2+" wishes. "); 
    System.out.println(" If you have reached this part of the assignment, I guess you must be a computer pro and should try to create the next video game winner!"); 
    System.out.println("\n HAL-2021 signing off!");
    
  } // main method
} // RandGame class

