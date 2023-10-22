package doublecheckedlocking;

public class DoubleCheckedLockingSingleton {
  private volatile static DoubleCheckedLockingSingleton uniqueInstance;

  private DoubleCheckedLockingSingleton() {
  }

  public static DoubleCheckedLockingSingleton getInstance() {
    if (uniqueInstance == null) {
      synchronized (DoubleCheckedLockingSingleton.class) {
        if (uniqueInstance == null) {
          uniqueInstance = new DoubleCheckedLockingSingleton();
        }
      }
    }
    return uniqueInstance;
  }
}

/*
  Note: we only synchronize the first time through!

  The volatile keyword ensures that multiple threads
  handle the uniqueInstance variable correctly when it
  is being initialized to the Singleton instance.
 */
