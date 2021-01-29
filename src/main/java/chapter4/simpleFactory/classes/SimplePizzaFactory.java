package chapter4.simpleFactory.classes;

import chapter4.simpleFactory.enums.TypePizza;

public class SimplePizzaFactory {

  public static Pizza createPizza(TypePizza typePizza) {

    switch (typePizza) {

      case CHEESE:
        return new CheesePizza();

      case VEGGIE:
        return new VeggiePizza();

      case CLAM:
        return new ClamPizza();

      case PEPPERONI:
        return new PepperoniPizza();

      default:
        return null;

    }

  }

}
