package chapter4.factoryMethod.classes;

public class NYStyleCheesePizza extends Pizza {

  @Override
  public void prepare() {
    System.out.println("Preparing NY style cheese pizza...");
  }

  @Override
  public void bake() {
    System.out.println("Baking NY style cheese pizza...");
  }

  @Override
  public void cut() {
    System.out.println("Cutting NY style cheese pizza...");
  }

  @Override
  public void box() {
    System.out.println("Boxing NY style cheese pizza!");
  }

}
