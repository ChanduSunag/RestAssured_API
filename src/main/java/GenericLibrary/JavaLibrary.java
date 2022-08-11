package GenericLibrary;

import java.util.Date;
import java.util.Random;

/**
 * This class contains all java specific generic methods
 * @author chandan
 */

public class JavaLibrary {

	/**
	 * This method will generate random number for every execution
	 * @return intRandom
	 */
	public  int getRandomNumber()
	{
		Random random=new Random();
		int intRandom = random.nextInt(1000);
		return intRandom;
	}

	/**
	 * This method is used to get system date and time in IST format
	 * @return 
	 * @return intDate
	 */
	public String getSystemDateAndTime() 
	{	
		Date date=new Date(0);
		String intDate = date.toString();
		return intDate;
	}
}
