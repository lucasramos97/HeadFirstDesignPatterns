package chapter4.factoryMethod.classes;

public class ChicagoStylePepperoniPizza extends Pizza {

  @Override
  public void prepare() {
    System.out.println("Preparing Chicago style pepperoni pizza...");
  }

  @Override
  public void bake() {
    System.out.println("Baking Chicago style pepperoni pizza...");
  }

  @Override
  public void cut() {
    System.out.println("Cutting Chicago style pepperoni pizza...");
  }

  @Override
  public void box() {
    System.out.println("Boxing Chicago style pepperoni pizza!");
  }

}
