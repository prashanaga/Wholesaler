package decorater;

public class orderAmount1 extends discountDecorater {
	

		   public orderAmount1(discount decorateddiscount) {
		      super(decorateddiscount);		
		   }

		   @Override
		   public double cal_discount() {
		      double d = decorateddiscount.cal_discount();	       
		      return set_add_discount(decorateddiscount, d);
		   }

		   private double set_add_discount(discount decorateddiscount, double d){
			   double add_d = 2.5;
		      System.out.printf("Additional discount(Order > 25000) : %f%%", add_d);
		      return add_d + d;
		   }


}
