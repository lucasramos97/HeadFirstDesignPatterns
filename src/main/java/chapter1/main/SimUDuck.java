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
    displayDuck(redheadDuck);
    
    Duck mallardDuck = new MallardDuck();
    displayDuck(mallardDuck);
    mallardDuck.setFlyBehavior(new FlyRocketPowered());
    displayDuck(mallardDuck);
    
    Duck rubberDuck = new RubberDuck();
    displayDuck(rubberDuck);
    
    Duck decoyDuck = new DecoyDuck();
    displayDuck(decoyDuck);
    
    Duck dumbDuck = new DumbDuck();
    displayDuck(dumbDuck);
    
    DuckCall duckCall = new DuckCall();
    duckCall.display();
    duckCall.performQuack();
    System.out.println("");
    duckCall.setQuackBehavior(new Squeak());
    duckCall.display();
    duckCall.performQuack();
    
  }
  
  private static void displayDuck(Duck duck) {
    duck.display();
    duck.performFly();
    duck.performQuack();
    System.out.println("");
  }

}
