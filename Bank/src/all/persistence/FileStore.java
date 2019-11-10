package all.persistence;
import all.persistence.value.User;
import all.persistence.value.Account;

import java.util.List;

public class FileStore implements DataStore{
    private List<Account> accounts; //Override, mine

    //Override, mine
    public User getUser(){

        User user = new User("void", "void", accounts);
        return user;
    }

    //Override
    public void addUser(User user){

    }

    //Override
    public void updateAccount(Account account){

    }

    //Override
    public void addAccount(Account account){

    }
}
