package chapter7.facade.main;

import chapter7.facade.classes.HomeTheaterFacade;

public class HomeTheaterTestDrive {

  public static void main(String[] args) {

    HomeTheaterFacade homeTheater = new HomeTheaterFacade();

    homeTheater.watchMovie("Whiplash");
    homeTheater.endMovie();
  }

}
