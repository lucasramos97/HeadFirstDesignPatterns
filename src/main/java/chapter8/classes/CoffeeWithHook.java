package chapter8.classes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CoffeineBeverage {

  @Override
  public void brew() {
    System.out.println("Dripping Coffee through filter");
  }

  @Override
  public void addCondiments() {
    System.out.println("Adding Sugar and Milk");
  }

  @Override
  public boolean customerWantsCondiments() {

    try {

      System.out.print("Wold you like milk and sugar with your coffee (y/n)? ");
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

      return in.readLine().toLowerCase().startsWith("y");

    } catch (Exception e) {
      return false;
    }
  }

}
