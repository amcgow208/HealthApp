package controllers;



import helpers.InputHelper;
import helpers.TextColours;
import model.Customer;
import model.HealthData;
import view.healthDataView;
import datastructures.ADTSingleLinkedList;
import datastructures.IADTLinkedList;
import datastructures.listNode;
import daos.healthDataDAO;
import daos.healthDataDAOImpl;

public class controller {

    private final InputHelper inputHelper;
    private final HealthData healthData;
    private final healthDataView healthDataView;
    private final healthDataDAOImpl<HealthData> theHealthData;
    private ADTSingleLinkedList<HealthData> dataLL;



    public controller() {

        this.inputHelper = new InputHelper();
        this.healthData = new HealthData();
        this.healthDataView = new healthDataView();
        this.theHealthData = new healthDataDAOImpl<>();
        this.dataLL = new ADTSingleLinkedList<HealthData>();

    }


    public void run() {
        boolean finished = false;

        int iChoice = 0;

        do {
            theMenu();
            iChoice = inputHelper.readInt("Enter choice", 7,1);
            switch (iChoice) {
                case 1:
                    getDetails();
                    System.out.println();
                    break;
                case 2:
                    displayDetails();
                    System.out.println();
                    break;
                case 3:
                    getDetailsFromFile();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("All done! Bye ...");
                    finished = true;
                    break;
                default: // invalid option
                    System.out.println("Oops! Something has went wrong!");
                    break;
            }
        }while(!finished);
    }
    private void theMenu() {
        // Print menu to console
        System.out.println("My Health App");
        System.out.println("-----------------------");
        System.out.println("1: Update User Details");
        System.out.println("2: Display User Details");
        System.out.println("3: Read User Data from file");
        System.out.println("4: Exit");
        System.out.println();
    }


    private void getDetails() {
        System.out.println("Enter Health Data");
        System.out.println("------------------------------");
        this.healthData.setAge(this.inputHelper.readInt("Please enter your age"));
        this.healthData.setHeight(this.inputHelper.readDouble("Please enter your height in meters"));
        this.healthData.setWeight(this.inputHelper.readDouble("Please enter your weight in kilograms"));
        this.healthData.setBMI(healthData.getWeight(), healthData.getHeight());
        System.out.println("\nYour Body Mass Index (BMI) is " + healthData.getBMI() + " kg/m2");
        if(this.healthData.getBMI() > 18.5 && this.healthData.getBMI() < 25){
            System.out.println(TextColours.TEXT_GREEN + "You are a healthy weight, aim to maintain this" + TextColours.TEXT_RESET);
        }
        else if (this.healthData.getBMI() < 18.5){
            System.out.println(TextColours.TEXT_RED + "You are underweight aim to gain 3-5Kg" + TextColours.TEXT_RESET);
        }
        else if (this.healthData.getBMI() > 25 && this.healthData.getBMI() < 30){
            System.out.println(TextColours.TEXT_RED + "You are overweight aim to lose 3-5Kg" + TextColours.TEXT_RESET);
        }
        else if (this.healthData.getBMI() > 30){
            System.out.println(TextColours.TEXT_RED + "You are obese, aim to lose 5-7Kg" + TextColours.TEXT_RESET);
        }

        theHealthData.writeDataToFile(this.dataLL);

    }
    private void displayDetails(){
        this.healthDataView.displayHealthData(this.healthData);
    }
    private void getDetailsFromFile() {
        System.out.println("Loading Details from File");
        System.out.println("------------------------------------------");
        this.dataLL = this.theHealthData.readDataFromFile();
        this.healthDataView.displayHealthData(this.dataLL);

    }
}

