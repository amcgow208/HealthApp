package daos;

import app.HealthApp;
import datastructures.listNode;
import model.ADTDate;
import model.Customer;
import model.HealthData;
import datastructures.ADTSingleLinkedList;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class healthDataDAOImpl<E> extends healthDataDAO<E> {
    private HealthData theHealthData;
    public static final char DELIMITER = ',';
    public static final char EOLN='\n';
    public static final String QUOTE="\"";
    public static final String USERDIRECTORY = System.getProperty("user.dir");

    private String stripQuotes(String str) {
        return str.substring(1, str.length()-1);
    }

    public healthDataDAOImpl(){this.theHealthData = new HealthData();}

    @Override
    public void setAge(int myAge){this.theHealthData.setAge(myAge);}

    @Override
    public int getAge() {return this.theHealthData.getAge();}

    @Override
    public void setHeight(double myHeight){this.theHealthData.setHeight(myHeight);}

    @Override
    public double getHeight(){return this.theHealthData.getHeight();}

    @Override
    public void setWeight(double myWeight){this.theHealthData.setWeight(myWeight);}

    @Override
    public double getWeight(){return this.theHealthData.getWeight();}

    @Override
    public void setBMI(double height, double weight){this.theHealthData.setBMI(height, weight);}

    @Override
    public double getBMI(){return this.theHealthData.getBMI();}

    @Override
    public ADTSingleLinkedList<E> readDataFromFile() {
        ADTSingleLinkedList<E> dataList = new ADTSingleLinkedList<>();
        String transactionFile = USERDIRECTORY +"\\HealthData.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(transactionFile))) {
            int Age;
            double Height;
            double Weight;
            double BMI;

            String[] temp;
            String line = br.readLine();
            while(line!=null){
                temp=line.split(Character.toString(DELIMITER));
                Age = Integer.parseInt(temp[0]);
                Weight =Double.parseDouble(temp[1]);
                Height =Double.parseDouble(temp[2]);

                HealthData theHealthData = new HealthData();
                theHealthData.setAge(Age);
                theHealthData.setWeight(Weight);
                theHealthData.setBMI(Weight,Height);
                String delims = "/"; // Use this delimitor to split the string.
                dataList.insert((E)theHealthData);
                line = br.readLine();
            }
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(HealthApp.class.getName()).log(Level.INFO, null, ex);
        }
        return dataList;
    }
    @Override
    public void writeDataToFile(ADTSingleLinkedList<HealthData> myData) {
        try {
            File myFile = new File(USERDIRECTORY +"\\HealthData.txt");

            if(myFile.exists()){
                myFile.delete();
                System.out.println("File updated: " + myFile.getName());
            }
            else if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            File myFile = new File(USERDIRECTORY +"\\HealthData.txt");
            FileWriter myWriter = new FileWriter(myFile.getName());
            listNode<HealthData> tmp = myData.front();
            while (tmp != null) {
                if(tmp.getNextNode() == null){
                    myWriter.write(tmp.getNodeData().CSVFormat());
                }
                else {
                    myWriter.write(tmp.getNodeData().CSVFormat() + "\n");
                }
                tmp = tmp.getNextNode();
            }
            myWriter.close();
            System.out.println("Successfully updated file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
