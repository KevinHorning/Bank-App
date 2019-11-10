package all;

import all.login.LoginView;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import all.persistence.DataStoreInstance;

public class Main {

	public static void main(String[] args) {
		// sends message through twilio
		Twilio.init("", "");

		String ACCOUNT_SID = "AC00718e2bd27aa00e4967a34fe02c30ab";
		String AUTH_TOKEN = "df5cec6549bd6f2cb45634a3864e666c";

		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

		Message message = Message
				.creator(
						new PhoneNumber("+17703306959"),  // to
						new PhoneNumber("+16463928526"),  // from
						"Hi. I am Nigerian prince. Plaesae sned mde your cerdit card no. and ssn.")
				.create();
		

    /*
        log in with cardnumber & pin
        choose account to make transactions with
        withdraw money from selected account
        deposit money from select account
        receive text alerts when withdraw or deposit money
        be able to save information when exited
     */
		DataStoreInstance.setStoreType(DataStoreInstance.StoreType.FILE);
		new LoginView().render();
	}
}