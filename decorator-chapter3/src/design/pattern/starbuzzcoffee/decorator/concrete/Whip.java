package design.pattern.starbuzzcoffee.decorator.concrete;

import design.pattern.starbuzzcoffee.component.Beverage;
import design.pattern.starbuzzcoffee.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {
  public static final double WHIP_PRICE = 0.10;

  public Whip(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public double cost() {
    return beverage.cost() + WHIP_PRICE;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Whip";
  }
}
