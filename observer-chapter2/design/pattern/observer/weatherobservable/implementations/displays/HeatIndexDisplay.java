package design.pattern.observer.weatherobservable.implementations.displays;

import design.pattern.observer.weatherobservable.implementations.WeatherData;
import design.pattern.observer.weatherobservable.interfaces.DisplayWeatherElement;
import design.pattern.observer.weatherobservable.interfaces.WeatherMeasurementsObserver;

public class HeatIndexDisplay implements WeatherMeasurementsObserver, DisplayWeatherElement {
  private float heatIndex;
  private final WeatherData weatherData;

  public HeatIndexDisplay(final WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  @Override
  public void update() {
    heatIndex = calculateHeatIndex(weatherData.getTemperature(), weatherData.getHumidity());
    display();
  }

  @Override
  public void display() {
    System.out.printf("Heat index is: %5.2f", heatIndex);
  }

  private static float calculateHeatIndex(final float temperature, final float humidity) {
    return (float) ((16.923 + (0.185212 * temperature) + (5.37941 * humidity) - (0.100254 * temperature * humidity)
        + (0.00941695 * (temperature * temperature)) + (0.00728898 * (humidity * humidity))
        + (0.000345372 * (temperature * temperature * humidity)) - (0.000814971 * (temperature * humidity * humidity)) +
        (0.0000102102 * (temperature * temperature * humidity * humidity)) - (0.000038646 * (temperature * temperature * temperature)) + (0.0000291583 *
        (humidity * humidity * humidity)) + (0.00000142721 * (temperature * temperature * temperature * humidity)) +
        (0.000000197483 * (temperature * humidity * humidity * humidity)) - (0.0000000218429 * (temperature * temperature * temperature * humidity * humidity)) +
        0.000000000843296 * (temperature * temperature * humidity * humidity * humidity)) -
        (0.0000000000481975 * (temperature * temperature * temperature * humidity * humidity * humidity)));
  }
}
