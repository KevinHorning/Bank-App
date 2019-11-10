package all.persistence;
import all.persistence.value.Account;
import all.persistence.value.User;

public interface DataStore {
    User getUser();
    void addUser(User user);
    void updateAccount(Account account);
    void addAccount(Account account);
}
