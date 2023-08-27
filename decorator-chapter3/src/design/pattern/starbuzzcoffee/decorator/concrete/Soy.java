package design.pattern.starbuzzcoffee.decorator.concrete;

import design.pattern.starbuzzcoffee.component.Beverage;
import design.pattern.starbuzzcoffee.decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {
  private static final double SOY_PRICE_TALL = 0.10;
  private static final double SOY_PRICE_GRANDE = 0.15;
  private static final double SOY_PRICE_VENTI = 0.20;


  public Soy(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public double cost() {
    double cost = beverage.cost();

    switch (beverage.getSize()) {
      case TALL:
        cost += SOY_PRICE_TALL;
        break;
      case GRANDE:
        cost += SOY_PRICE_GRANDE;
        break;
      case VENTI:
        cost += SOY_PRICE_VENTI;
        break;
    }

    return cost;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Soy";
  }
}
