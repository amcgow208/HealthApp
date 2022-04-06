package model;

public interface IHealthData {
    void setAge (int age);
    int getAge();
    void setHeight(double height);
    double getHeight();
    void setWeight(double weight);
    double getWeight();
    void setBMI(double weight, double height);
    double getBMI();
}