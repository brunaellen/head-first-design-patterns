package design.pattern.observer.weatherobservable.implementations.displays;

import design.pattern.observer.weatherobservable.implementations.WeatherData;
import design.pattern.observer.weatherobservable.interfaces.DisplayWeatherElement;
import design.pattern.observer.weatherobservable.interfaces.WeatherMeasurementsObserver;

public class ForecastDisplay implements DisplayWeatherElement, WeatherMeasurementsObserver {
  private float pressure;
  private final WeatherData weatherData;

  public ForecastDisplay(final WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  @Override
  public void update() {
    this.pressure = weatherData.getPressure();
    calculateForecast();
    display();
  }

  void calculateForecast() {
    //TODO
  }

  @Override
  public void display() {
    System.out.println("forecast 3 days - Improving weather on the way!");
  }
}
