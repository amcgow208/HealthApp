package model;

public interface ICustomer {
    void setID(int theID);
    int getID();
    void setFirstName (String theFirstname);
    String getFirstName ();
    void setLastName (String theLastname);
    String getLastName ();
    void setHealthData(HealthData myDetails);
    HealthData getHealthData();
}
