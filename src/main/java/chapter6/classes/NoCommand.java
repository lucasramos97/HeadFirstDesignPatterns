package chapter6.classes;

import chapter6.interfaces.Command;

public class NoCommand implements Command {

  @Override
  public void execute() {}

  @Override
  public void undo() {}

}
