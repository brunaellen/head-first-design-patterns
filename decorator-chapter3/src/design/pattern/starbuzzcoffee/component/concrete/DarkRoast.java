package design.pattern.starbuzzcoffee.component.concrete;

import design.pattern.starbuzzcoffee.component.Beverage;

public class DarkRoast extends Beverage {
  public DarkRoast() {
    description = "Dark Roast Coffee";
  }

  @Override
  public double cost() {
    return 0.99;
  }
}
