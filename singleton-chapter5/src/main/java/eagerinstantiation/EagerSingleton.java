package eagerinstantiation;

public class EagerSingleton {
  private static EagerSingleton uniqueInstance = new EagerSingleton();

  private EagerSingleton() {
  }

  public static EagerSingleton getInstance() {
    return uniqueInstance;
  }
}
/*
 * If your application always creates and uses an instance of the Singleton,
 * create your Singleton eagerly
 */
