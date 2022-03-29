package repositories;

import model.User;

public interface RepositoryInterface {
    int getId();
    void setId(int id);
    String getFirstName();
    void setFirstName(String firstName);
    String getLastName();
    void setLastName(String lastName);
    String getUserName();
    void setUserName(String userName);
    String getPassWord();
    void setPassWord(String passWord);



}
