package chapter4.simpleFactory.main;

import chapter4.simpleFactory.classes.PizzaStore;
import chapter4.simpleFactory.enums.TypePizza;

public class PizzaTestDrive {

  public static void main(String[] args) {

    PizzaStore pizzaStore = new PizzaStore();

    pizzaStore.orderPizza(TypePizza.PEPPERONI);
    System.out.println("");
    pizzaStore.orderPizza(TypePizza.CHEESE);
    System.out.println("");
    pizzaStore.orderPizza(TypePizza.VEGGIE);

  }

}
