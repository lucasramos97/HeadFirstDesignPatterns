package chapter2.myself.classes;

import java.util.ArrayList;
import java.util.List;
import chapter2.myself.interfaces.Observer;
import chapter2.myself.interfaces.Subject;

public class WeatherData implements Subject {
  
  private float temperature;
  private float humidity;
  private float pressure;
  
  private List<Observer> observers;
  
  public WeatherData() {
    this.observers = new ArrayList<>();
  }

  public void registerObserver(Observer observer) {
    this.observers.add(observer);
  }

  public void removeObserver(Observer observer) {
    this.observers.remove(observer);
  }

  public void notifyObservers() {
    this.observers.stream().forEach(observer -> {
      observer.update(this.temperature, this.humidity, this.pressure);
    });
  }
  
  public void measurementsChanged() {
    notifyObservers();
  }
  
  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }

}
