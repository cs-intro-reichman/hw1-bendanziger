// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend 
{
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int a = (int)(Math.random() * lim);
		int b = (int)(Math.random() * lim);
		int c = (int)(Math.random() * lim);
		System.out.println(a + " " + b + " " + c);
		int maxNum = Math.max(c, Math.max(a, b));
		int minNum = Math.min(c, Math.min(a, b));
		int midNum = (a + b + c) - minNum - maxNum;
        System.out.println(minNum + " " + midNum + " " + maxNum);
}
}