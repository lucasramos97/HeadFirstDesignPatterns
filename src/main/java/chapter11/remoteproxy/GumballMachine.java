package chapter11.remoteproxy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {

  private static final long serialVersionUID = 7799069371857599153L;

  private int count;
  private String location;
  private State state;

  public GumballMachine(String location, int count) throws RemoteException {
    this.count = count;
    this.location = location;
    if (this.count > 0) {
      state = new NoQuarterState();
    } else {
      state = new SoldOutState();
    }
  }

  @Override
  public int getCount() throws RemoteException {
    return count;
  }

  @Override
  public String getLocation() throws RemoteException {
    return location;
  }

  @Override
  public State getState() throws RemoteException {
    return state;
  }

}
