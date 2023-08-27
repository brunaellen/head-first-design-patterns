package design.pattern.starbuzzcoffee.decorator;

import design.pattern.starbuzzcoffee.component.Beverage;

public abstract class CondimentDecorator extends Beverage {
  public Beverage beverage;

  public abstract String getDescription();

  public Size getSize() {
    return beverage.getSize();
  }
}
