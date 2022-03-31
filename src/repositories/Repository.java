package repositories;

import daos.DAO;
import daos.SQLDAO;
import model.User;

public class Repository implements RepositoryInterface{

private final DAO dao;

public Repository(){
    dao = new SQLDAO();
}

    public String getUserName(){
        return dao.getUserName();
    }

    public String getPassWord(){
        return dao.getPassWord();
    }

    public void setUserName(String userName){
        dao.setUserName(userName);
    }

    public void setPassWord(String passWord){
        dao.setPassWord(passWord);
    }

    public int getId() {
        return dao.getId();
    }

    public void setId(int id) {
        dao.setId(id);
    }
    public String getFirstName(){
        return dao.getFirstName();
    }

    public void setFirstName(String firstName){
        dao.setFirstName(firstName);
    }

    public String getLastName(){
        return dao.getLastName();
    }

    public void setLastName(String lastName){
        dao.setLastName(lastName);
    }





}

