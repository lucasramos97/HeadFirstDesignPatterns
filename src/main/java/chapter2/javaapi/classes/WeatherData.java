package chapter2.javaapi.classes;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import lombok.Getter;

public class WeatherData {

  @Getter
  private float temperature;

  @Getter
  private float humidity;

  @Getter
  private float pressure;

  private PropertyChangeSupport propertyChangeSupport;

  public WeatherData() {
    this.propertyChangeSupport = new PropertyChangeSupport(this);
  }

  public void addPropertyChangeListener(PropertyChangeListener pcl) {
    this.propertyChangeSupport.addPropertyChangeListener(pcl);
  }

  public void removePropertyChangeListener(PropertyChangeListener pcl) {
    this.propertyChangeSupport.removePropertyChangeListener(pcl);
  }

  public void measurementsChanged() {
    this.propertyChangeSupport.firePropertyChange("weatherData", null, this);
  }

  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }

}
