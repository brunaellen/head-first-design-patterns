package chocolatefactory;

public class ChocolateBoilerSingleton {
  private boolean empty;
  private boolean boiled;
  private static ChocolateBoilerSingleton uniqueInstance;

  private ChocolateBoilerSingleton() {
    empty = true;
    boiled = false;
  }

  public static ChocolateBoilerSingleton getInstance() {
    if (uniqueInstance == null) {
      synchronized (ChocolateBoilerSingleton.class) {
        if (uniqueInstance == null) {
          System.out.println("Creating unique instance of Chocolate Boiler");
          uniqueInstance = new ChocolateBoilerSingleton();
        }
      }
    }
    return uniqueInstance;
  }

  public void fill() {
    if (isEmpty()) {
      empty = false;
      boiled = false;
      System.out.println("fill the boiler with a milk/chocolate mixture");
    }
  }

  public void drain() {
    if (!isEmpty() && isBoiled()) {
      empty = true;
      System.out.println("drain the boiled milk and chocolate");
    }
  }

  public void boil() {
    if (!isEmpty() && !isBoiled()) {
      boiled = true;
      System.out.println("bring the contents to a boil");
    }
  }

  public boolean isEmpty() {
    return empty;
  }

  public boolean isBoiled() {
    return boiled;
  }
}
