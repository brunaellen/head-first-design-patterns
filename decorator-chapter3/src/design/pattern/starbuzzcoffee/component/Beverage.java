package design.pattern.starbuzzcoffee.component;

public abstract class Beverage {
  public enum Size {TALL, GRANDE, VENTI}

  ;
  public Size size = Size.TALL;
  public String description = "Unknown Beverage";

  public void setSize(Size size) {
    this.size = size;
  }

  public Size getSize() {
    return this.size;
  }

  public String getDescription() {
    return description;
  }

  public abstract double cost();
}
