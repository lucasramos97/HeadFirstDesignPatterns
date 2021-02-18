package chapter11.remoteproxy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.rmi.Naming;

public class GumballMonitorTestDive {

  public static void main(String[] args) {

    GumballMachineRemote gumballMachineRemote;
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Gumball Machines Monitor\n");
    System.out.println("1 - Chicago");
    System.out.println("2 - Los Angeles");
    System.out.println("3 - New York");
    System.out.println("4 - San Diego");
    System.out.println("5 - São Francisco");

    try {

      while (true) {

        System.out.print("> ");

        switch (in.readLine()) {
          case "1":
            gumballMachineRemote =
                (GumballMachineRemote) Naming.lookup("rmi://localhost:6666/chicago");
            new GumballMonitor(gumballMachineRemote).report();
            break;
          case "2":
            gumballMachineRemote =
                (GumballMachineRemote) Naming.lookup("rmi://localhost:6666/losangeles");
            new GumballMonitor(gumballMachineRemote).report();
            break;
          case "3":
            gumballMachineRemote =
                (GumballMachineRemote) Naming.lookup("rmi://localhost:6666/newyork");
            new GumballMonitor(gumballMachineRemote).report();
            break;
          case "4":
            gumballMachineRemote =
                (GumballMachineRemote) Naming.lookup("rmi://localhost:6666/sandiego");
            new GumballMonitor(gumballMachineRemote).report();
            break;
          case "5":
            gumballMachineRemote =
                (GumballMachineRemote) Naming.lookup("rmi://localhost:6666/saofrancisco");
            new GumballMonitor(gumballMachineRemote).report();
            break;
          default:
            System.out.println("Option not found!");
            break;
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}
