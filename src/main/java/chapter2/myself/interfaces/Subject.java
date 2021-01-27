package chapter2.myself.interfaces;

public interface Subject {

  public void registerObserver(Observer observer);
  
  public void removeObserver(Observer observer);
  
  public void notifyObservers();
  
}
