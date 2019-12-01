package statepattern;

import javax.naming.Context;

public interface Cust_tierState {
	   public void alert(tierstateContext  ctx);
	}


class tierstateContext  
{ 
    private Cust_tierState currentState; 
  
    public tierstateContext()  
    { 
        currentState = new tierA(); 
    } 
  
    public void setState(Cust_tierState state)  
    { 
        currentState = state; 
    } 
  
    public void alert()  
    { 
        currentState.alert(this); 
    } 
} 


class tierA implements Cust_tierState  
{ 
    @Override
    public void alert(tierstateContext ctx)  
    { 
         System.out.println("Customer is in  Tier-A(Silver)\n"); 
    } 
  
} 
  

class tierB implements Cust_tierState 
{ 
    @Override
    public void alert(tierstateContext ctx)  
    { 
        System.out.println("Customer is in  Tier-B (GOLD)\n"); 
    } 
  
} 

class tierC implements Cust_tierState 
{ 
    @Override
    public void alert(tierstateContext ctx)  
    { 
        System.out.println("Customer is in  Tier-C (Platinum)\n"); 
    } 
  
}


class StatePattern  
{ 
    public static void main(String[] args)  
    { 
    	tierstateContext stateContext = new tierstateContext(); 
        stateContext.alert(); 
        stateContext.alert(); 
        stateContext.setState(new tierB()); 
        stateContext.alert(); 
        stateContext.alert(); 
        stateContext.setState(new tierC());
        stateContext.alert(); 
        stateContext.alert(); 
    } 
} 