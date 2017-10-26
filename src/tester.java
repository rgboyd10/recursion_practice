import java.util.*;
public class tester {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10");
		int userin = input.nextInt();
		recursiveMethod(userin);
	}
	public static int recursiveMethod(int input)
	{
	    return recursiveMethod(input - 1);

	    if (input < 0)
	    {
	        return 0;
	    }
	}
}
