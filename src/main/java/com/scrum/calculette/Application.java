/*
 * Copyright (c) Ida Willy Theo 2018
 * All rights reserved
 */

package com.scrum.calculette;

import org.joda.time.DateTime;

/**
 * My main Application.
 * @author Théodore Supiot
 * @version 1.0
 */
public final class Application {

    /** State of application. (true if running). */
    private static boolean isRunning;

    /**
     * Constructor.
     */
    private Application() {
        super();
    }

    /**
     * Entry point of the application.
     * @param args Argument for CLI.
     */
    public static void main(final String[] args) {
        isRunning = true;

        System.out.println("Hello World !!");
        final DateTime date = DateTime.now();
        System.out.println("Application started at : " + date);
    }
}
