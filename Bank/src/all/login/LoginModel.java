package all.login;

import all.persistence.DataStore;
import all.persistence.DataStoreInstance;
import all.persistence.value.User;


public class LoginModel {
    private DataStore dataStore = DataStoreInstance.getInstance();

    public User getUser(){
        return dataStore.getUser();
    }
}
