package design.pattern.starbuzzcoffee;

import design.pattern.starbuzzcoffee.component.Beverage;
import design.pattern.starbuzzcoffee.component.concrete.DarkRoast;
import design.pattern.starbuzzcoffee.component.concrete.Espresso;
import design.pattern.starbuzzcoffee.component.concrete.HouseBlend;
import design.pattern.starbuzzcoffee.decorator.concrete.Mocha;
import design.pattern.starbuzzcoffee.decorator.concrete.Soy;
import design.pattern.starbuzzcoffee.decorator.concrete.Whip;

public class StarbuzzCoffee {
  /*
   * Decorator - attach additional responsibilities to an object dynamically.
   * Decorators provide a flexible alternative to subclassing
   * for extending functionality
   */

  public static void main(String[] args) {
    espresso();
    darkRoastWithWhipAndDoubleMocha();
    houseBlendWithSoyAndMochaAndWhip();

  }

  private static void houseBlendWithSoyAndMochaAndWhip() {
    Beverage houseBlend = new HouseBlend();
    houseBlend = new Soy(houseBlend);
    houseBlend = new Mocha(houseBlend);
    houseBlend = new Whip(houseBlend);
    houseBlend.setSize(Beverage.Size.VENTI);
    System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());
  }

  private static void espresso() {
    final Beverage espresso = new Espresso();

    System.out.println(espresso.getDescription() + " $" + espresso.cost());
  }

  private static void darkRoastWithWhipAndDoubleMocha() {
    Beverage darkRoast = new DarkRoast();

    darkRoast = new Mocha(darkRoast);
    darkRoast = new Mocha(darkRoast);
    darkRoast = new Whip(darkRoast);

    System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost()
        + " " + darkRoast.getSize());
  }
}
