package daos;

import model.HealthData;
import datastructures.ADTSingleLinkedList;


public abstract class healthDataDAO<E> {
    public abstract void setAge (int age);
    public abstract int getAge();
    public abstract void setHeight (double height);
    public abstract double getHeight();
    public abstract void setWeight(double weight);
    public abstract double getWeight();
    public abstract void setBMI(double weight, double height);
    public abstract double getBMI();
    public abstract void writeDataToFile(ADTSingleLinkedList<HealthData> myData);
    public abstract ADTSingleLinkedList<E> readDataFromFile();
}
