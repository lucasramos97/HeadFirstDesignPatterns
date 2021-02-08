package chapter7.facade.classes;

public class TheaterLights {

  public void dim(int percentage) {
    System.out.println(String.format("Theater Ceiling Lights diming to %d%%", percentage));
  }

  public void on() {
    System.out.println("Theater Ceiling Lights on");
  }

}
