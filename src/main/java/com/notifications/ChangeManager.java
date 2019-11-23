package com.notifications;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ChangeManager {
	
	// Hashmap for subject and observer links
    private HashMap<Subject, List<Observer>> SubjectObserverMapping = new HashMap<Subject, List<Observer>>();
	
	private static ChangeManager SINGLE_INSTANCE = null;
	
	// Private constructor
	private  ChangeManager() {}
	
	// Static FACTORY method for instantiation
	public static ChangeManager getInstance() {
		if(SINGLE_INSTANCE == null) {
			synchronized(ChangeManager.class) {
				SINGLE_INSTANCE = new ChangeManager();
			}
		}
	return SINGLE_INSTANCE;
	}
	
	public void Register(Subject subject, Observer observer) {
		if (this.SubjectObserverMapping.containsKey(subject)){
			this.SubjectObserverMapping.get(subject).add(observer);
		}
		else {
			List<Observer> templist= new ArrayList<Observer>();
			templist.add(observer);
			this.SubjectObserverMapping.put(subject, templist);
		}
	}
	
	public void UnRegister(Subject subject, Observer observer) {
		if (this.SubjectObserverMapping.containsKey(subject)){
			this.SubjectObserverMapping.get(subject).remove(observer);
		}
	}
	
	public void Notify(Subject subject) {
		if (this.SubjectObserverMapping.containsKey(subject)){
			for(Observer obs:this.SubjectObserverMapping.get(subject)){
				obs.update(subject);
				}
		}
	}
	
	public void PrintMapping() {
		for (Subject i : this.SubjectObserverMapping.keySet()) {
			System.out.println("Observers for : " + i.getTitle());
			for(Observer obs:this.SubjectObserverMapping.get(i)){  
				 System.out.println("-> "+obs.getName());  
				}
		}
	}
}
