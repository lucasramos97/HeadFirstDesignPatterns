package chapter4.factoryMethod.classes;

import chapter4.factoryMethod.enums.TypePizza;

public class ChicagoPizzaStore extends PizzaStore {

  @Override
  public Pizza createPizza(TypePizza typePizza) {

    switch (typePizza) {

      case PEPPERONI:
        return new ChicagoStylePepperoniPizza();

      default:
        return null;

    }

  }

}
