package chapter2.javaapi.main;

import chapter2.javaapi.classes.CurrentConditionsDisplay;
import chapter2.javaapi.classes.ForecastDisplay;
import chapter2.javaapi.classes.HeatIndexDisplay;
import chapter2.javaapi.classes.StatisticsDisplay;
import chapter2.javaapi.classes.WeatherData;

public class WeatherStation {

  public static void main(String[] args) {

    WeatherData weatherData = new WeatherData();

    weatherData.addPropertyChangeListener(new CurrentConditionsDisplay());
    weatherData.addPropertyChangeListener(new StatisticsDisplay());
    weatherData.addPropertyChangeListener(new ForecastDisplay());
    weatherData.addPropertyChangeListener(new HeatIndexDisplay());

    weatherData.setMeasurements(80, 65, 30.4f);
    weatherData.setMeasurements(82, 70, 29.2f);
    weatherData.setMeasurements(78, 90, 29.2f);

  }

}
