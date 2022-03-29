package daos;

import java.util.List;


public abstract class DAO {
    private String userName;

    private String passWord;

    private int id;

    private String FirstName;

    private String LastName;

    private int weight;

    private int height;

    private int calories;



    public String getUserName(){
        return this.userName;
    }

    public String getPassWord(){
        return this.passWord;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public void setPassWord(String passWord){
        this.passWord=passWord;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName(){
        return this.FirstName;
    }

    public void setFirstName(String firstName){
        this.FirstName = firstName;
    }

    public String getLastName(){
        return this.LastName;
    }

    public void setLastName(String lastName){
        this.LastName=lastName;
    }

    public int getWeight(){
        return this.weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public int getHeight(){
        return this.height;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public void setCalories(int calories){
        this.calories = calories;
    }

    public int getCalories(){
        return this.calories;
    }




}
