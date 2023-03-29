package exceptions;

public class CalcAverage extends IllegalArgumentException{
	
	public static double avgFirstN(int n) throws IllegalArgumentException{
		if(n > 0) {
			int sum = 0;
			for(int i = n; i > 0; i--) {
				sum += i;
			}
			
			return (double)sum/n;
		}
		else {
			throw new IllegalArgumentException("That is not a natural number!");
		}
		
	}
}
