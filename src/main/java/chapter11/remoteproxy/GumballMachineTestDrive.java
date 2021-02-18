package chapter11.remoteproxy;

import java.rmi.Naming;

public class GumballMachineTestDrive {

  public static void main(String[] args) {

    GumballMachine chicagoGumballMachine;
    GumballMachine losAngelesGumballMachine;
    GumballMachine newYorkGumballMachine;
    GumballMachine sanDiegoGumballMachine;
    GumballMachine saoFranciscoGumballMachine;

    try {

      chicagoGumballMachine = new GumballMachine("Chicago", 50);
      losAngelesGumballMachine = new GumballMachine("Los Angeles", 0);
      newYorkGumballMachine = new GumballMachine("New York", 100);
      sanDiegoGumballMachine = new GumballMachine("San Diego", 101);
      saoFranciscoGumballMachine = new GumballMachine("São Francisco", 0);

      Naming.rebind("//localhost:6666/chicago", chicagoGumballMachine);
      Naming.rebind("//localhost:6666/losangeles", losAngelesGumballMachine);
      Naming.rebind("//localhost:6666/newyork", newYorkGumballMachine);
      Naming.rebind("//localhost:6666/sandiego", sanDiegoGumballMachine);
      Naming.rebind("//localhost:6666/saofrancisco", saoFranciscoGumballMachine);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
