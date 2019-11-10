package all.alert;

import all.Action;
import all.OptionsBuilder;
import all.Printer;
import all.navigation.Navitable;

public class AlertView implements Navitable {
    @Override
    public void render() {
        Printer.println();
        Printer.println("Hello from alert view! What would you like to do?");

        OptionsBuilder<Action> optionsBuilder = new OptionsBuilder();

        AlertSingleton singleton = AlertSingleton.getInstance();

        optionsBuilder.addOption("Deposit Alerts on", (text) -> {
            // turn on deposit alerts
            singleton.toggleDepositAlerts();
        });
        optionsBuilder.addOption("Withdraw Alerts on", (text) -> {
            // turn on withdraw alerts
            singleton.toggleWithdrawAlerts();
        });
        optionsBuilder.addOption("Deposit Alerts off", (text) -> {
            // turn off withdraw alerts
            singleton.toggleDepositAlerts();
        });
        optionsBuilder.addOption("Withdraw Alerts off", (text) -> {
            // turn off deposit alerts
            singleton.toggleWithdrawAlerts();
        });

        optionsBuilder.build((action) -> {
            action.execute(null);
        });
    }
}
