package caughtSpeeding;
/*You are driving a little too fast, and a police officer stops you. 
 * Write code to compute the result, encoded as an int value: 0=no 
 * ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0.
 * If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more,
 * the result is 2. Unless it is your birthday -- on that day, your speed can be 5 
 * higher in all cases. 
 */
public class Speeding {
	
	public static void main(String[] args)
	
	{
		
		System.out.print(caughtSpeeding(60, false)); // should return 0
		System.out.print(caughtSpeeding(65, false)); // should return 1
		System.out.print(caughtSpeeding(65, true)); // should return 0
		
	}
	
	public static int caughtSpeeding(int speed, boolean isBirthday)
	
	{
		if (isBirthday = false){
			if (speed <= 60) {
				return 0;
			}
			if (speed >= 61 && speed <= 80) {
				return 1;
			}
			if (speed >= 81){
				return 2;
			}
			
		}
	
		if (isBirthday = true){
			if (speed <= 65) {
				return 0;
			}
			if (speed >= 66 && speed <= 85) {
				return 1;
			}
			if (speed >= 86){
				return 2;
			}
			
	return 0;	}
		return speed;
	
	}
}
