package design.pattern.starbuzzcoffee.decorator.concrete;

import design.pattern.starbuzzcoffee.component.Beverage;
import design.pattern.starbuzzcoffee.decorator.CondimentDecorator;

public class Milk extends CondimentDecorator {
  private static final double MILK_PRICE = .10;

  public Milk(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public double cost() {
    return beverage.cost() + MILK_PRICE;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Steamed Milk";
  }
}
