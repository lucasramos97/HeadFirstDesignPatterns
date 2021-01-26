package chapter1.main;

import chapter1.classes.DuckCall;
import chapter1.classes.behaviors.FlyRocketPowered;
import chapter1.classes.behaviors.Squeak;
import chapter1.classes.ducks.DecoyDuck;
import chapter1.classes.ducks.Duck;
import chapter1.classes.ducks.DumbDuck;
import chapter1.classes.ducks.MallardDuck;
import chapter1.classes.ducks.RedheadDuck;
import chapter1.classes.ducks.RubberDuck;

public class SimUDuck {

  public static void main(String[] args) {
    
    Duck redheadDuck = new RedheadDuck();
    duckDisplay(redheadDuck);
    
    Duck mallardDuck = new MallardDuck();
    duckDisplay(mallardDuck);
    mallardDuck.setFlyBehavior(new FlyRocketPowered());
    duckDisplay(mallardDuck);
    
    Duck rubberDuck = new RubberDuck();
    duckDisplay(rubberDuck);
    
    Duck decoyDuck = new DecoyDuck();
    duckDisplay(decoyDuck);
    
    Duck dumbDuck = new DumbDuck();
    duckDisplay(dumbDuck);
    
    DuckCall duckCall = new DuckCall();
    duckCall.display();
    duckCall.performQuack();
    System.out.println("");
    duckCall.setQuackBehavior(new Squeak());
    duckCall.display();
    duckCall.performQuack();
    
  }
  
  private static void duckDisplay(Duck duck) {
    duck.display();
    duck.performFly();
    duck.performQuack();
    System.out.println("");
  }

}
