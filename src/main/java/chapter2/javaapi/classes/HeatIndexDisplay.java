package chapter2.javaapi.classes;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import chapter2.myself.interfaces.DisplayElement;

public class HeatIndexDisplay implements PropertyChangeListener, DisplayElement {

  private float heatIndex;

  @Override
  public void display() {
    StringBuilder display = new StringBuilder();
    display.append("Heat index is ");
    display.append(this.heatIndex);
    System.out.println(display.toString());
  }

  @Override
  public void propertyChange(PropertyChangeEvent evt) {

    WeatherData weatherData = (WeatherData) evt.getNewValue();
    float temperature = weatherData.getTemperature();
    float humidity = weatherData.getHumidity();

    this.heatIndex = (float) ((16.923 + (0.185212 * temperature) + (5.37941 * humidity)
        - (0.100254 * temperature * humidity) + (0.00941695 * (temperature * temperature))
        + (0.00728898 * (humidity * humidity))
        + (0.000345372 * (temperature * temperature * humidity))
        - (0.000814971 * (temperature * humidity * humidity))
        + (0.0000102102 * (temperature * temperature * humidity * humidity))
        - (0.000038646 * (temperature * temperature * temperature))
        + (0.0000291583 * (humidity * humidity * humidity))
        + (0.00000142721 * (temperature * temperature * temperature * humidity))
        + (0.000000197483 * (temperature * humidity * humidity * humidity))
        - (0.0000000218429 * (temperature * temperature * temperature * humidity * humidity))
        + 0.000000000843296 * (temperature * temperature * humidity * humidity * humidity))
        - (0.0000000000481975
            * (temperature * temperature * temperature * humidity * humidity * humidity)));
    display();
  }

}
