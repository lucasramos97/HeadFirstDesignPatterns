package chapter5.main;

import chapter5.classes.ChocolateBoiler;

public class ChocOHolic {

  public static void main(String[] args) {

    ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
    chocolateBoiler.fill();
    chocolateBoiler.boil();
    chocolateBoiler.drain();

  }

}
