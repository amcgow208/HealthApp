package controllers;

import java.util.List;

import helpers.InputHelper;
import model.User;
import model.HealthData;
import model.BMI;
import repositories.Repository;

public class Controller {

    private final Repository repository;
    public Controller() {repository = new Repository();}


    public void run(){
        boolean finished = false;
        InputHelper inputHelper = new InputHelper();
        do {
            System.out.print("\nA. Display User Information");
            System.out.print("\tB. Update User Information");
            System.out.print("\tC. View BMI");
            System.out.print("\tQ. Quit\n");
            char choice = inputHelper.readCharacter("Enter choice", "ABCQ");
            switch (choice) {
                case 'A':
                    displayUser();
                    break;
                case 'Q':
                    finished = true;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }
        } while (!finished);
    }
    public void displayUser() {
        System.out.println("User Info");
        System.out.println("===========");
        List<User> userList = repository.getUserInformation();
        System.out.println(userList);
    }
}
