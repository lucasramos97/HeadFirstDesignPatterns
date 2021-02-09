package chapter8.classes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TeaWithHook extends CoffeineBeverage {

  @Override
  public void brew() {
    System.out.println("Steeping the tea");
  }

  @Override
  public void addCondiments() {
    System.out.println("Adding Lemon");
  }

  @Override
  public boolean customerWantsCondiments() {

    try {

      System.out.print("Wold you like lemon with your tea (y/n)? ");
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

      return in.readLine().toLowerCase().startsWith("y");

    } catch (Exception e) {
      return false;
    }
  }

}
