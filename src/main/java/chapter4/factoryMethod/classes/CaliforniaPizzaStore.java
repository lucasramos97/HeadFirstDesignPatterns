package chapter4.factoryMethod.classes;

import chapter4.factoryMethod.enums.TypePizza;

public class CaliforniaPizzaStore extends PizzaStore {

  @Override
  public Pizza createPizza(TypePizza typePizza) {

    switch (typePizza) {

      case VEGGIE:
        return new CaliforniaStyleVeggiePizza();

      default:
        return null;

    }

  }

}
