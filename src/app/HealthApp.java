package app;

import controllers.Controller;

public class HealthApp {

    private static void run() {
        final Controller controller = new Controller();
        controller.run();
    }
    public static void main(final String[] args) {
        HealthApp.run();
    }

}
