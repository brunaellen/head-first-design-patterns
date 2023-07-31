package design.pattern.observer.weatherobservable.implementations.displays;

import design.pattern.observer.weatherobservable.implementations.WeatherData;
import design.pattern.observer.weatherobservable.interfaces.DisplayWeatherElement;
import design.pattern.observer.weatherobservable.interfaces.WeatherMeasurementsObserver;

public class CurrentConditionsDisplay implements DisplayWeatherElement, WeatherMeasurementsObserver {
  private float temperature;
  private float humidity;
  private final WeatherData weatherData;

  public CurrentConditionsDisplay(final WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  @Override
  public void update() {
    this.temperature = weatherData.getTemperature();
    this.humidity = weatherData.getHumidity();
    display();
  }

  @Override
  public void display() {
    System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
  }
}
