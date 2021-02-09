package chapter8.classes;

public abstract class CoffeineBeverage {

  public final void prepareRecipe() {
    boilWater();
    brew();
    pourInCup();
    if (customerWantsCondiments()) {
      addCondiments();
    }
  }

  public void boilWater() {
    System.out.println("Boiling water");
  }

  public void pourInCup() {
    System.out.println("Pouring into cup");
  }

  public boolean customerWantsCondiments() {
    return false;
  }

  public abstract void brew();

  public abstract void addCondiments();

}
