package chapter5.classes;

import lombok.Getter;

public class ChocolateBoiler {

  private volatile static ChocolateBoiler instance;

  @Getter
  private boolean empty;

  @Getter
  private boolean boiled;

  private ChocolateBoiler() {
    empty = true;
    boiled = false;
  }

  public static ChocolateBoiler getInstance() {

    if (instance == null) {
      synchronized (ChocolateBoiler.class) {
        if (instance == null) {
          instance = new ChocolateBoiler();
        }
      }
    }

    return instance;
  }

  public void fill() {
    if (isEmpty()) {
      empty = false;
      boiled = false;
      System.out.println("Fills the boiler with a mixture of milk and chocolate.");
    }
  }

  public void drain() {
    if (!isEmpty() && isBoiled()) {
      System.out.println("Drains boiled milk and chocolate.");
      empty = true;
    }
  }

  public void boil() {
    if (!isEmpty() && !isBoiled()) {
      System.out.println("Boil the contents.");
      boiled = true;
    }
  }

}
