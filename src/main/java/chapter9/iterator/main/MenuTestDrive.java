package chapter9.iterator.main;

import chapter9.iterator.classes.CafeMenu;
import chapter9.iterator.classes.DinerMenu;
import chapter9.iterator.classes.PancakeHouseMenu;
import chapter9.iterator.classes.Waitress;
import chapter9.iterator.interfaces.Menu;

public class MenuTestDrive {

  public static void main(String[] args) {

    Menu pancakeHouseMenu = new PancakeHouseMenu();
    Menu dinerMenu = new DinerMenu();
    Menu cafeMenu = new CafeMenu();

    Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
    waitress.printMenu();
  }

}
