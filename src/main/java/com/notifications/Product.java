package com.notifications;

public class Product implements Subject{
	private int stock;
	private String title;
	private ChangeManager chman;
	
	public Product(String title, int stock){
		this.title = title;
		this.stock = stock;
		this.chman = ChangeManager.getInstance();
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public boolean isInStock() {
		if(this.stock > 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void setStock(int stock) {
		this.stock = stock;
		this.notifyObservers();
		
	}
	
	@Override
	public void attach(Observer obj) {
		this.chman.Register(this, obj);
	}
	
	@Override
	public void detach(Observer obj) {
		this.chman.UnRegister(this, obj);
	}

	@Override
	public void notifyObservers() {
		this.chman.Notify(this);
	}
}
