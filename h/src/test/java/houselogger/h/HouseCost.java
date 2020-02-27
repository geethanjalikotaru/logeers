package houselogger.h;
import java.util.*;
import java.util.logging.Logger;
public class HouseCost {
	int ms,totalarea;
	 Scanner s= new Scanner(System.in);
	 Logger log= Logger.getLogger(HouseCost.class.getName());
     public void inputvalues()
     {
    	 log.info("enter material standard");
    	 log.info("1.Standard");
    	 log.info("2.above standard");
    	 log.info("3.high standard ");
    	 log.info("4.high standard and automated");
    	 ms=s.nextInt();
    	 log.info("enter area required per feet");
    	 totalarea=s.nextInt();
     }
     public void compute()
     {
    	 int amt=0;
    	 switch(ms)
    	 {
    	 case 1:amt=1200;
    	 		break;
    	 case 2:amt=1500;
    	 		break;
    	 case 3:amt=1800;
    	 		break;
    	 case 4:amt=2500;
    	 }
    	 amt=amt*totalarea;
    	 log.info("total cost for house construction is"+amt);
     }
}