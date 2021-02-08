package chapter7.facade.classes;

public class DvdPlayer {

  private String movie;

  public void on() {
    System.out.println("Top-O-Line DVD Player on");
  }

  public void play(String movie) {
    this.movie = movie;
    System.out.println(String.format("Top-O-Line DVD Player playing \"%s\"", this.movie));
  }

  public void stop() {
    System.out.println(String.format("Top-O-Line DVD Player stopped \"%s\"", this.movie));
  }

  public void eject() {
    System.out.println("Top-O-Line DVD Player eject");
  }

  public void off() {
    System.out.println("Top-O-Line DVD Player off");
  }

}
