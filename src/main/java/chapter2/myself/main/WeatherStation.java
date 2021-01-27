package chapter2.myself.main;

import chapter2.myself.classes.CurrentConditionsDisplay;
import chapter2.myself.classes.ForecastDisplay;
import chapter2.myself.classes.HeatIndexDisplay;
import chapter2.myself.classes.StatisticsDisplay;
import chapter2.myself.classes.WeatherData;

public class WeatherStation {

  public static void main(String[] args) {

    WeatherData weatherData = new WeatherData();

    weatherData.registerObserver(new CurrentConditionsDisplay());
    weatherData.registerObserver(new StatisticsDisplay());
    weatherData.registerObserver(new ForecastDisplay());
    weatherData.registerObserver(new HeatIndexDisplay());

    weatherData.setMeasurements(80, 65, 30.4f);
    weatherData.setMeasurements(82, 70, 29.2f);
    weatherData.setMeasurements(78, 90, 29.2f);

  }

}
