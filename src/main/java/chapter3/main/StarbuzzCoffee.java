package chapter3.main;

import java.text.DecimalFormat;
import chapter3.classes.Beverage;
import chapter3.classes.DarkRoast;
import chapter3.classes.Espresso;
import chapter3.classes.HouseBlend;
import chapter3.classes.Mocha;
import chapter3.classes.Soy;
import chapter3.classes.Whip;
import chapter3.enums.CoffeeSize;

public class StarbuzzCoffee {

  public static void main(String[] args) {

    Beverage beverage = new Espresso();
    displayBeverage(beverage);

    Beverage beverage2 = new DarkRoast();
    beverage2 = new Mocha(beverage2);
    beverage2 = new Mocha(beverage2);
    beverage2 = new Whip(beverage2);
    displayBeverage(beverage2);

    Beverage beverage3 = new HouseBlend();
    beverage3 = new Soy(beverage3);
    beverage3 = new Mocha(beverage3);
    beverage3 = new Whip(beverage3);
    displayBeverage(beverage3);

    Beverage beverage4 = new DarkRoast();
    beverage4.setSize(CoffeeSize.GRANDE);
    beverage4 = new Mocha(beverage4);
    beverage4 = new Mocha(beverage4);
    beverage4 = new Whip(beverage4);
    displayBeverage(beverage4);

    Beverage beverage5 = new HouseBlend();
    beverage5.setSize(CoffeeSize.VENTI);
    beverage5 = new Soy(beverage5);
    beverage5 = new Mocha(beverage5);
    beverage5 = new Whip(beverage5);
    displayBeverage(beverage5);

  }

  private static void displayBeverage(Beverage beverage) {
    StringBuilder display = new StringBuilder();
    display.append(beverage.getDescription());
    display.append(" $");
    display.append(new DecimalFormat("##.##").format(beverage.cost()));
    System.out.println(display.toString());
  }

}
