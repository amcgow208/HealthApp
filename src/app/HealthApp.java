package app;

import controllers.controller;

public class HealthApp {

    private static void run() {
        final controller controller = new controller();
        controller.run();
    }

    /**
     * Starts the application by invoking the class method run
     */
    public static void main(final String[] args) {
        HealthApp.run();
    }
}
