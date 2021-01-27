package chapter2.javaapi.classes;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import chapter2.myself.interfaces.DisplayElement;

public class StatisticsDisplay implements PropertyChangeListener, DisplayElement {

  private float maxTemp = 0.0f;
  private float minTemp = 200;
  private float tempSum = 0.0f;
  private int numReadings;

  @Override
  public void display() {
    StringBuilder display = new StringBuilder();
    display.append("Avg/Max/Min temperature = ");
    display.append(tempSum / numReadings);
    display.append("/");
    display.append(maxTemp);
    display.append("/");
    display.append(minTemp);
    System.out.println(display.toString());
  }

  @Override
  public void propertyChange(PropertyChangeEvent evt) {

    WeatherData weatherData = (WeatherData) evt.getNewValue();
    float temperature = weatherData.getTemperature();

    tempSum += temperature;
    numReadings++;

    if (temperature > maxTemp) {
      maxTemp = temperature;
    }

    if (temperature < minTemp) {
      minTemp = temperature;
    }

    display();
  }

}
