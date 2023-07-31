package design.pattern.observer.weatherobservable;

import design.pattern.observer.weatherobservable.implementations.WeatherData;
import design.pattern.observer.weatherobservable.implementations.displays.CurrentConditionsDisplay;
import design.pattern.observer.weatherobservable.implementations.displays.ForecastDisplay;
import design.pattern.observer.weatherobservable.implementations.displays.HeatIndexDisplay;
import design.pattern.observer.weatherobservable.implementations.displays.StatisticsDisplay;

public class WeatherStation {
  public static void main(String[] args) {
    final WeatherData weatherData = new WeatherData();

    final CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
    final StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
    final ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
    final HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

    weatherData.setMeasurements(80, 65, 30.4f);
    System.out.println("\n");
    weatherData.setMeasurements(82, 70, 29.2f);
    System.out.println("\n");
    weatherData.setMeasurements(78, 90, 29.2f);
  }
}
