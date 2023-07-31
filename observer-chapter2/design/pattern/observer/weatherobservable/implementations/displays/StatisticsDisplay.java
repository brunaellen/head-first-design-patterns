package design.pattern.observer.weatherobservable.implementations.displays;

import design.pattern.observer.weatherobservable.implementations.WeatherData;
import design.pattern.observer.weatherobservable.interfaces.DisplayWeatherElement;
import design.pattern.observer.weatherobservable.interfaces.WeatherMeasurementsObserver;

import java.util.ArrayList;
import java.util.List;

public class StatisticsDisplay implements DisplayWeatherElement, WeatherMeasurementsObserver {
  private List<Float> temperatures = new ArrayList<>();
  float minimumTemperature;
  float maximumTemperature;
  float sum;
  float avgTemp;
  private final WeatherData weatherData;

  public StatisticsDisplay(final WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  @Override
  public void update() {
    temperatures.add(weatherData.getTemperature());
    calculateAverageTemperature();
    display();
  }

  public void calculateAverageTemperature() {
    minimumTemperature = temperatures.get(0);
    maximumTemperature = temperatures.get(0);
    sum = 0f;

    for (double temp : temperatures) {
      minimumTemperature = (float) Math.min(minimumTemperature, temp);
      maximumTemperature = (float) Math.max(maximumTemperature, temp);
      sum += temp;
    }

    avgTemp = sum / temperatures.size();
  }

  @Override
  public void display() {
    System.out.println("Minimum Temperature: " + minimumTemperature);
    System.out.println("Maximum Temperature: " + maximumTemperature);
    System.out.println("Average Temperature: " + avgTemp);
  }
}
