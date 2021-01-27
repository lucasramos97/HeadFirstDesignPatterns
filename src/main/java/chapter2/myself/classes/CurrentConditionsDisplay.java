package chapter2.myself.classes;

import chapter2.myself.interfaces.DisplayElement;
import chapter2.myself.interfaces.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

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
  public void update(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    display();
  }

}
