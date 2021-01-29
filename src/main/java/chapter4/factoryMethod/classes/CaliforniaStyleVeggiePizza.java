package chapter4.factoryMethod.classes;

public class CaliforniaStyleVeggiePizza extends Pizza {

  @Override
  public void prepare() {
    System.out.println("Preparing Califórnia style veggie pizza...");
  }

  @Override
  public void bake() {
    System.out.println("Baking Califórnia style veggie pizza...");
  }

  @Override
  public void cut() {
    System.out.println("Cutting Califórnia style veggie pizza...");
  }

  @Override
  public void box() {
    System.out.println("Boxing Califórnia style veggie pizza!");
  }

}
