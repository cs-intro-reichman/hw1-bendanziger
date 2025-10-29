// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // Replace this comment with your code
     int theNumber = Integer.parseInt(args[0]);
	 int ones = theNumber % 10;
	 int tens = (theNumber/10)%10;
	 int hundreds = theNumber / 100;
     System.out.println(hundreds + " hundreds, " + tens + " tens, and "
		                                        + ones + " ones.");
	    
	}
}
