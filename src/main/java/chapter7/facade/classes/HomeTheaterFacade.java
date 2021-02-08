package chapter7.facade.classes;

public class HomeTheaterFacade {

  private PopcornPopper popcornPopper;
  private TheaterLights theaterLights;
  private Screen screen;
  private Projector projector;
  private Amplifier amplifier;
  private DvdPlayer dvdPlayer;

  public HomeTheaterFacade() {

    popcornPopper = new PopcornPopper();
    theaterLights = new TheaterLights();
    screen = new Screen();
    projector = new Projector();
    amplifier = new Amplifier();
    dvdPlayer = new DvdPlayer();
  }

  public void watchMovie(String movie) {

    System.out.println("Get ready to watch a movie...");
    popcornPopper.on();
    popcornPopper.pop();
    theaterLights.dim(10);
    screen.down();
    projector.on();
    projector.wideScreenMode();
    amplifier.on();
    amplifier.setDvd(dvdPlayer);
    amplifier.setSurroundSound();
    amplifier.setVolume(5);
    dvdPlayer.on();
    dvdPlayer.play(movie);
  }

  public void endMovie() {

    System.out.println("Shutting movie theater down...");
    popcornPopper.off();
    theaterLights.on();
    screen.up();
    projector.off();
    amplifier.off();
    dvdPlayer.stop();
    dvdPlayer.eject();
    dvdPlayer.off();
  }

}
