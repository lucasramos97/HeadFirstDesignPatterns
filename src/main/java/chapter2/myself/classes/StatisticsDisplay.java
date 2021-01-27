package chapter2.myself.classes;

import chapter2.myself.interfaces.DisplayElement;
import chapter2.myself.interfaces.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {

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
  public void update(float temperature, float humidity, float pressure) {

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
