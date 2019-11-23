package com.notifications;

public abstract class Observer {
   protected Subject subject;
   public abstract String getName();
   public abstract void update(Subject subject);
}