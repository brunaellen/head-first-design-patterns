package design.pattern.observer.weatherobservable.interfaces;

public interface WeatherMeasurementsSubject {
  void registerObserver(final WeatherMeasurementsObserver observer);

  void removeObserver(final WeatherMeasurementsObserver observer);

  void notifyObservers();
}
