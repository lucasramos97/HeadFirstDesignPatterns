package chapter12.mvc.main;

import chapter12.mvc.classes.controllers.BeatController;
import chapter12.mvc.classes.models.BeatModel;

public class DJTestDrive {

  public static void main(String[] args) {

    new BeatController(new BeatModel());
  }

}
