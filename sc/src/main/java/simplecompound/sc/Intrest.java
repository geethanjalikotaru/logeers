package simplecompound.sc;

public class Intrest {
	public static void main(String args[])
	{
		//System.out.printf("%s hi %f", "message" , (float)101);
		CI c=new CI();
		SI s=new SI();
		c.inputValues();
		c.compute();
		s.inputValues();
		s.compute();
	}
}
