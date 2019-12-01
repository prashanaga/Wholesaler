package decorater;

public class tierC implements discount{
       
	   @Override
	   public double cal_discount() {
		   double d = 15.0;
		   System.out.printf("\nDisount (Customer in Platinum tier) : %.2f%%\n", d);
		   return d;
	   }
}