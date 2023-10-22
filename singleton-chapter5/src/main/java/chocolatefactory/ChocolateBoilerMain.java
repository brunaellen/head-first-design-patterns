package chocolatefactory;

public class ChocolateBoilerMain {
  public static void main(String args[]) {
    ChocolateBoilerSingleton boiler = ChocolateBoilerSingleton.getInstance();
    System.out.println(boiler);

    boiler.fill();
    boiler.boil();
    boiler.drain();

    // will return the existing instance
    ChocolateBoilerSingleton boiler2 = ChocolateBoilerSingleton.getInstance();
    System.out.println(boiler2);
  }
}
