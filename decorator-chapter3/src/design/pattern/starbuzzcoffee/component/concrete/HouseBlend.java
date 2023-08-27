package design.pattern.starbuzzcoffee.component.concrete;

import design.pattern.starbuzzcoffee.component.Beverage;

public class HouseBlend extends Beverage {
  public HouseBlend() {
    description = "House Blend Coffee";
  }

  @Override
  public void setSize(Size size) {
    super.size = size;
  }

  @Override
  public double cost() {
    return 0.89;
  }
}