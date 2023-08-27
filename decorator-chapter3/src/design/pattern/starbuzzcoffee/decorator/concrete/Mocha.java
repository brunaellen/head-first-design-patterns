package design.pattern.starbuzzcoffee.decorator.concrete;

import design.pattern.starbuzzcoffee.component.Beverage;
import design.pattern.starbuzzcoffee.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
  private static final double MOCHA_PRICE = 0.20;

  public Mocha(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public double cost() {
    return beverage.cost() + MOCHA_PRICE;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Mocha";
  }
}
