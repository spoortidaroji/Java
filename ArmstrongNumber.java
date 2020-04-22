import java.util.Scanner;
public class ArmstrongNumber
{
    public static void main(String args[])
    {
	    	int arm=0,a,d,no; 
	    	Scanner s=new Scanner(System.in);
	    	System.out.println("Enter any positive number :");
	    	no=s.nextInt();
	    	d=no;
	    	while(no>0)
	    	{
	    	a=no%10;
	    	no/=10;
	    	arm=arm+a*a*a;
	    	}
	    	if(arm==d)
	    	{
	    	System.out.println("Armstrong");
	    	}
	    	else
	    	{
	    	System.out.println("not Armstrong");
	    	}
     }
}