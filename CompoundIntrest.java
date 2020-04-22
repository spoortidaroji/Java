package javaPrograming;
import java.util .*;
public class CompoundIntrest 
{
	public static void main (String args[])
	{
	    double pr, rate, t,ci;
	    Scanner sc=new Scanner (System. in);
	    System.out.println("Enter the principalamount:");
	    pr=sc.nextDouble();
	    System. out. println("Enter the No.of years:");
	    t=sc.nextDouble();
	    System. out. println("Enter the Rate of  interest");
	    rate=sc.nextDouble();
	    ci=pr * Math.pow(1.0+rate/100.0,t) - pr;
	    System.out. println("Compound Interest="+ci);
	  }
}
