package model;

public class User {
    private String userName;

    private String passWord;

    private int id;

    private String FirstName;

    private String LastName;


    public User(int id, String firstName, String lastName){
        this.id = id;
        this.FirstName = firstName;
        this.LastName = lastName;


    }
    public User(String firstName, String lastName) {
        this.id = 0;
        this.FirstName = firstName;
        this.LastName = lastName;


    }

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

}
