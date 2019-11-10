package all.navigation;

import all.Printer;
import all.deposit.DepositView;
import all.OptionsBuilder;
import all.alert.AlertView;
import all.withdraw.WithdrawView;

public class NavigationView {
	public void render(){
		Printer.println("What would you like to do?");
		OptionsBuilder<Navitable> optionsBuilder = new OptionsBuilder<>();

		optionsBuilder.addOption("Withdraw", new WithdrawView());
		optionsBuilder.addOption("Deposit", new DepositView());
		optionsBuilder.addOption("View Text Alert Options", new AlertView());

		optionsBuilder.build((Navitable) -> {
			Navitable.render();
		});
	}
}
