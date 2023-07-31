package design.pattern.observer.weatherobservable.implementations;

import design.pattern.observer.weatherobservable.interfaces.WeatherMeasurementsObserver;
import design.pattern.observer.weatherobservable.interfaces.WeatherMeasurementsSubject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements WeatherMeasurementsSubject {
  private final List<WeatherMeasurementsObserver> observerList;
  private float temperature;
  private float humidity;
  private float pressure;

  public WeatherData() {
    this.observerList = new ArrayList<>();
  }

  public float getTemperature() {
    return temperature;
  }

  public float getHumidity() {
    return humidity;
  }

  public float getPressure() {
    return pressure;
  }

  @Override
  public void registerObserver(final WeatherMeasurementsObserver observer) {
    observerList.add(observer);
  }

  @Override
  public void removeObserver(final WeatherMeasurementsObserver observer) {
    observerList.remove(observer);
  }

  @Override
  public void notifyObservers() {
    observerList.forEach(observer -> observer.update());
  }

  public void measurementsChanged() {
    notifyObservers();
  }

  public void setMeasurements(final float temperature, final float humidity, final float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }
}
