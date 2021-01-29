package chapter4.factoryMethod.main;

import chapter4.factoryMethod.classes.CaliforniaPizzaStore;
import chapter4.factoryMethod.classes.ChicagoPizzaStore;
import chapter4.factoryMethod.classes.NYPizzaStore;
import chapter4.factoryMethod.classes.PizzaStore;
import chapter4.factoryMethod.enums.TypePizza;

public class PizzaTestDrive {

  public static void main(String[] args) {

    PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
    chicagoPizzaStore.orderPizza(TypePizza.PEPPERONI);
    System.out.println("");

    PizzaStore nYPizzaStore = new NYPizzaStore();
    nYPizzaStore.orderPizza(TypePizza.CHEESE);
    System.out.println("");

    PizzaStore californiaPizzaStore = new CaliforniaPizzaStore();
    californiaPizzaStore.orderPizza(TypePizza.VEGGIE);

  }

}
