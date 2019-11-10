package all.withdraw;

import all.Printer;
import all.alert.AlertSingleton;
import all.navigation.Navitable;

public class WithdrawView implements Navitable {

   @Override
   public void render() {
      Printer.println("Hello from withdraw view!");
      AlertSingleton singleton = AlertSingleton.getInstance();
      if(singleton.isWithdrawAlertsOn()) {
         // send a text message
      }
   }
}