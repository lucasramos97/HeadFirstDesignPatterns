package chapter2.javaapi.classes;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import chapter2.myself.interfaces.DisplayElement;

public class ForecastDisplay implements PropertyChangeListener, DisplayElement {

  private float currentPressure = 29.92f;
  private float lastPressure;

  @Override
  public void display() {
    System.out.print("Forecast: ");
    if (currentPressure > lastPressure) {
      System.out.println("Improving weather on the way!");
    } else if (currentPressure == lastPressure) {
      System.out.println("More of the same");
    } else if (currentPressure < lastPressure) {
      System.out.println("Watch out for cooler, rainy weather");
    }
  }

  @Override
  public void propertyChange(PropertyChangeEvent evt) {

    WeatherData weatherData = (WeatherData) evt.getNewValue();

    lastPressure = currentPressure;
    currentPressure = weatherData.getPressure();
    display();
  }

}
