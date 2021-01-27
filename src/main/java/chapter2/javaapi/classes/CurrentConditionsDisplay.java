package chapter2.javaapi.classes;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import chapter2.myself.interfaces.DisplayElement;

public class CurrentConditionsDisplay implements PropertyChangeListener, DisplayElement {

  private float temperature;
  private float humidity;

  @Override
  public void display() {
    StringBuilder display = new StringBuilder();
    display.append("Current conditions: ");
    display.append(temperature);
    display.append("F degrees and ");
    display.append(humidity);
    display.append("% humidity");
    System.out.println(display.toString());
  }

  @Override
  public void propertyChange(PropertyChangeEvent evt) {

    WeatherData weatherData = (WeatherData) evt.getNewValue();

    this.temperature = weatherData.getTemperature();
    this.humidity = weatherData.getHumidity();
    display();
  }

}
