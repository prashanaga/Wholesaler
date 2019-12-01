package decorater;

public class orderAmount2 extends discountDecorater {
	

	   public orderAmount2(discount decorateddiscount) {
	      super(decorateddiscount);		
	   }

	   @Override
	   public double cal_discount() {
	      double d = decorateddiscount.cal_discount();	       
	      return set_add_discount(decorateddiscount, d);
	   }

	   private double set_add_discount(discount decorateddiscount, double d){
		  double add_d = 5.0;
	      System.out.printf("Additional discount(Order > 50000) : %.2f%%", add_d);
		  return add_d + d;
	   }

}
