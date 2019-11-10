package all.alert;

public class AlertSingleton {

    private boolean withdrawAlerts = false;
    private boolean depositAlerts = false;
    private static AlertSingleton instance;

    public static AlertSingleton getInstance() {
        if (instance == null) {
            instance = new AlertSingleton();
        }

        return instance;
    }

    public boolean isWithdrawAlertsOn() {
        return withdrawAlerts;
    }

    public boolean isDepositAlertsOn() {
        return depositAlerts;
    }
    public void toggleWithdrawAlerts() {
        withdrawAlerts = !withdrawAlerts;
    }
    public void toggleDepositAlerts() {
        depositAlerts = !depositAlerts;
    }
}