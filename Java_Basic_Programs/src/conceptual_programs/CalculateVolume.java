package conceptual_programs;

public class CalculateVolume {

	    public static void main(String s[])
	    {
	        System.out.println("Volume at given pressure is : " + getVolume(20.0, 14.0, 10.0));

	    }


	    public static Double getVolume(double pressure1, double volume1, double pressure2) { 

	    	return pressure1*volume1*pressure2 ;
	    }
}

/*
Output-
Volume at given pressure is : 2800.0
*/