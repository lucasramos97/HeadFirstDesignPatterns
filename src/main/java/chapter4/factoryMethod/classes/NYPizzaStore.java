package chapter4.factoryMethod.classes;

import chapter4.factoryMethod.enums.TypePizza;

public class NYPizzaStore extends PizzaStore {

  @Override
  public Pizza createPizza(TypePizza typePizza) {

    switch (typePizza) {

      case CHEESE:
        return new NYStyleCheesePizza();

      default:
        return null;

    }

  }

}
