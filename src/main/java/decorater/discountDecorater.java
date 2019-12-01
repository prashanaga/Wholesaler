package decorater;

public class discountDecorater implements discount {
	
	   protected discount decorateddiscount;

	   public discountDecorater(discount decorateddiscount){
	      this.decorateddiscount = decorateddiscount;
	   }

	   public double cal_discount() {
		 double  d = decorateddiscount.cal_discount();
		 return d;
	   }

}
