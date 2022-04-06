package view;

import model.Customer;
import model.HealthData;
import datastructures.ADTSingleLinkedList;
import datastructures.listNode;

public class healthDataView {

    public void displayHealthData(HealthData myDetails){
        System.out.println("My Details");
        System.out.println("-----------");
        System.out.println(String.format("Age: %5s",myDetails.getAge()));
        System.out.println(String.format("Height: %5s",myDetails.getHeight()));
        System.out.println(String.format("Weight: %5s",myDetails.getWeight()));
        System.out.println(String.format("BMI: %5s",myDetails.getBMI()));
    }
    public void displayHealthData(listNode<HealthData> healthData){
        System.out.println("My Details");
        System.out.println("----------------");
        System.out.println(String.format("Age: %5s",healthData.getNodeData().getAge()));
        System.out.println(String.format("Weight: %5s",healthData.getNodeData().getWeight()));
        System.out.println(String.format("Height: %5s",healthData.getNodeData().getHeight()));
        System.out.println(String.format("BMI: %5s",healthData.getNodeData().getBMI()));
    }


    public void displayHealthData(ADTSingleLinkedList<HealthData> theData){
        System.out.println("All Customer Details");
        System.out.println("--------------------");
        System.out.println(String.format("| %5s | %5s | %5s | %5s |", "Age", "Weight", "Height", "BMI"));
        System.out.println("----------------------------------------------------------------------------------");

        listNode<HealthData> tmp = theData.front();
        while (tmp != null) {
            System.out.println( String.format("| %5s | %5s | %5s | %f|", tmp.getNodeData().getAge(), tmp.getNodeData().getWeight(), tmp.getNodeData().getHeight(), tmp.getNodeData().getBMI()));
            tmp = tmp.getNextNode();
        }
        System.out.println("------------------------------------------------------------------------------------");
    }
}