package synchronize;

public class SynchronizedSingleton {
  private static SynchronizedSingleton uniqueInstance;

  private SynchronizedSingleton() {
  }

  public static synchronized SynchronizedSingleton getInstance() {
    if (uniqueInstance == null) {
      uniqueInstance = new SynchronizedSingleton();
    }
    return uniqueInstance;
  }
}

/*
 * By adding the synchronized keyword to getInstance(), we force every thread to
 * wait its turn before it can enter the method.
 * That is, no two threads may enter the method at the same time.
 *
 * Note: Synchronization is expensive and
 * there is totally unneeded overhead after the first time through.
 */