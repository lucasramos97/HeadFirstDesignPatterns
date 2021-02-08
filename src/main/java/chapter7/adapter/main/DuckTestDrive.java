package chapter7.adapter.main;

import chapter7.adapter.classes.DuckAdapter;
import chapter7.adapter.classes.MallardDuck;
import chapter7.adapter.classes.TurkeyAdapter;
import chapter7.adapter.classes.WildTurkey;
import chapter7.adapter.interfaces.Duck;
import chapter7.adapter.interfaces.Turkey;

public class DuckTestDrive {

  public static void main(String[] args) {

    Duck mallardDuck = new MallardDuck();
    Turkey wildTurkey = new WildTurkey();
    Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
    Turkey duckAdapter = new DuckAdapter(mallardDuck);

    System.out.println("The Turkey says...");
    testTurkey(wildTurkey);

    System.out.println("\nThe Duck says...");
    testDuck(mallardDuck);

    System.out.println("\nThe TurkeyAdapter says...");
    testDuck(turkeyAdapter);

    System.out.println("\nThe DuckAdapter says...");
    testTurkey(duckAdapter);

  }

  public static void testDuck(Duck duck) {
    duck.quack();
    duck.fly();
  }

  public static void testTurkey(Turkey turkey) {
    turkey.gobble();
    turkey.fly();
  }

}
