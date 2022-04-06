package model;

public class Customer implements Comparable<Customer>, ICustomer{
    private int CustID;
    private String CustomerFirstname;
    private String CustomerLastname;
    private HealthData CustomerDetails;

    public Customer(){
        this.CustID = 1234;
        this.CustomerFirstname = "Firstname";
        this.CustomerLastname = "Lastname";
        this.CustomerDetails = new HealthData();
    }


    @Override
    public void setID(int theID) {
        this.CustID = theID;
    }

    @Override
    public int getID() {
        return this.CustID;
    }

    @Override
    public void setFirstName(String theFirstname) {
        this.CustomerFirstname = theFirstname;
    }

    @Override
    public String getFirstName() {
        return this.CustomerFirstname;
    }

    @Override
    public void setLastName(String theLastname) {
        this.CustomerLastname = theLastname;
    }

    @Override
    public String getLastName() {
        return this.CustomerLastname;
    }

    @Override
    public void setHealthData(HealthData myDetails) {
        this.CustomerDetails = myDetails;
    }

    @Override
    public HealthData getHealthData() {
        return this.CustomerDetails;
    }

    @Override
    public String toString(){
        String msg = "";
        msg = String.format("%d,%s,%s,%s",this.getID(),this.getFirstName(), this.getLastName(), this.getHealthData().toString());
        return msg;
    }

    /**
     * This method overrides compareTo for checking Customer ID's
     *
     * @param aCustomer requires an object of aCustomer
     * @return an integer value 0 - equal, 1 - greater than, -1 - less than
     */
    @Override
    public int compareTo(Customer aCustomer){
        if(this.CustID == aCustomer.CustID)
            return 0;
        else if(this.CustID > aCustomer.CustID)
            return 1;
        else
            return -1;
    }

}