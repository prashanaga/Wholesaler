package com.notifications;

public interface Subject {
	//methods to register and unregister observers
	public void attach(Observer obj);
	public void detach(Observer obj);
	public String getTitle();
	public boolean isInStock();
	public void setStock(int stock);
	//method to notify observers of change
	public void notifyObservers();
		
}
