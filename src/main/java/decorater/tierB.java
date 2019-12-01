package decorater;

public class tierB implements discount{
	
	   @Override
	   public double cal_discount() {
		   double d = 10.0;
	      System.out.printf("\nDisount  (Customer in Gold tier)    : %.2f%%\n", d);
	      return d;
	   }

}
