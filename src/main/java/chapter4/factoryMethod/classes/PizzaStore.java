package chapter4.factoryMethod.classes;

import chapter4.factoryMethod.enums.TypePizza;

public abstract class PizzaStore {

  public final void orderPizza(TypePizza typePizza) {

    Pizza pizza = createPizza(typePizza);

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

  }

  public abstract Pizza createPizza(TypePizza typePizza);

}
