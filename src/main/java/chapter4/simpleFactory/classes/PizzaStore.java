package chapter4.simpleFactory.classes;

import chapter4.simpleFactory.enums.TypePizza;

public class PizzaStore {

  public void orderPizza(TypePizza typePizza) {

    Pizza pizza = SimplePizzaFactory.createPizza(typePizza);

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

  }

}
