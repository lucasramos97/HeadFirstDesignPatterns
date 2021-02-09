package chapter8.main;

import chapter8.classes.CoffeeWithHook;
import chapter8.classes.TeaWithHook;

public class BeverageTestDrive {

  public static void main(String[] args) {

    CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
    TeaWithHook teaWithHook = new TeaWithHook();

    System.out.println("Making tea...");
    teaWithHook.prepareRecipe();

    System.out.println("\nMaking coffee...");
    coffeeWithHook.prepareRecipe();

  }

}
