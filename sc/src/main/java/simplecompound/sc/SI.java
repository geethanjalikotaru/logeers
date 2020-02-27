package simplecompound.sc;

import java.util.Scanner;
import java.util.logging.Logger;

public class SI {
	 public float p,r;
	   public int t,n;
	   Logger log= Logger.getLogger(CI.class.getName());
     public void inputValues()
     {
       log.info("Enter principle amount for simple intrest");
  	   Scanner s=new Scanner(System.in);
  	   p=s.nextFloat();
  	   log.info("Enter time amount");
  	   t=s.nextInt();
  	   log.info("Enter rate of intrest amount");
  	   r=s.nextFloat();
     }
     public void compute()
     {
  	   double temp=(p*t*r)/100;
  	   log.info("simple intrest is"+temp);
     }
}
