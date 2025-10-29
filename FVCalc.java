// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code
        int currentValue = Integer.parseInt(args[0]);
		int rate = Integer.parseInt(args[1]);
		int n = Integer.parseInt(args[2]);
		double futureValue = currentValue * Math.pow(1.0 + (rate / 100.0), n);
        System.out.println("after " + n + " years, $" + currentValue + " saved at "
		                    + rate + "% will yield $" + (int)futureValue);
	    
	}
}