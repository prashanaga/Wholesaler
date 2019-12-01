package decorater;

public class tierA implements discount{
	
	   @Override
	   public double cal_discount() {
		  double d = 5.0;
		 System.out.printf("\nDisount (Customer in Silver tier)   : %.2f%%\n", d);
	      return d;
	   }
}
