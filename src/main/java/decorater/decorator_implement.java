package decorater;

public class decorator_implement {
	
	   public static void main(String[] args) {

		      discount silver = new tierA();
		      
		      discount gold = new tierB();
		      
		      discount platinum = new tierC();

		      // object for customer in tierA + order > 25000
		      discount cust_1 = new orderAmount1(new tierA());
		      
		      // object for customer in tierB + order > 25000
		      discount cust_2 = new orderAmount1(new tierB());
		      
		      
		      // object for customer in tierC + order > 25000
		      //discount cust_3 = new orderAmount1(new tierC());
		      
		      // object for customer in tierA + order > 50000
		      discount cust_4 = new orderAmount2(new tierA());
		      
		      // object for customer in tierB + order > 50000
		      discount cust_5 = new orderAmount2(new tierB());
		      
		      
		      // object for customer in tierC + order > 50000
		      //discount cust_6 = new orderAmount2(new tierC());
		      
		      // tier-A discount
		      double dis1 = silver.cal_discount();
		      
		      //tier-B discount
		      double dis2 = gold.cal_discount();
		      
		      //tier-C discount
		      double dis3 = platinum.cal_discount();

		      cust_1.cal_discount();
		      System.out.println("\nTotal Discount : 7.5 %\n");
		      		      
		      cust_2.cal_discount();
		      System.out.println("\nTotal Discount : 12.5 %\n");

		      //cust_3.cal_discount();
		      //System.out.println("\nTotal Discount : 17.5 %\n");
		      
		      cust_4.cal_discount();
		      System.out.println("\nTotal Discount : 10 %\n");
		      		      
		      cust_5.cal_discount();
		      System.out.println("\nTotal Discount : 15 %\n");

		      //cust_6.cal_discount();
		      //System.out.println("\nTotal Discount : 20 %\n");
	   }

}
