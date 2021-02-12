package chapter9.iterator.classes;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import chapter9.iterator.interfaces.Menu;

public class CafeMenu implements Menu {

  Map<String, MenuItem> menuItems;

  public CafeMenu() {
    menuItems = new Hashtable<>();
    addItem("Veggie Burger and Air Fries",
        "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99);
    addItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69);
    addItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", true, 4.29);
  }

  public void addItem(String name, String description, boolean vegetarian, double price) {
    MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
    menuItems.put(name, menuItem);
  }

  @Override
  public Iterator<MenuItem> getIterator() {
    return menuItems.values().iterator();
  }

  @Override
  public String getName() {
    return "DINNER";
  }

}
