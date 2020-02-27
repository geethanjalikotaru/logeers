package simplecompound.sc;
import java.lang.Math;
import java.util.*;
import java.util.logging.Logger;
public class CI {
	   public float p,r;
	   public int t,n;
	   Logger log= Logger.getLogger(CI.class.getName());
       public void inputValues()
       {
    	   log.info("Enter principle amount for compound intrest");
    	   Scanner s=new Scanner(System.in);
    	   p=s.nextFloat();
    	   log.info("Enter time amount");
    	   t=s.nextInt();
    	   log.info("Enter rate of intrest amount");
    	   r=s.nextFloat();
    	   log.info("number of times interest applied per time period");
    	   n=s.nextInt();
       }
       public void compute()
       {
    	   double temp=1+(r/n);
    	   temp=Math.pow(temp, n*t);
    	   temp=temp*p;
    	   log.info("compound intrest is"+temp);
       }
}

