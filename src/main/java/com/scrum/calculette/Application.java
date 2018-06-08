/*
 * Copyright (c) Ida Willy Theo 2018
 * All rights reserved
 */

package com.scrum.calculette;

import java.util.Scanner;

import org.joda.time.DateTime;

/**
 * My main Application.
 * @author ThÃ©odore Supiot
 * @version 1.0
 */
public final class Application {

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

    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Entrez une valeur");
    	int number1 = scanner.nextInt();
    	
    	System.out.println("Entrez une seconde valeur");
    	int number2 = scanner.nextInt();
    	
    	System.out.println("Veuillez choisir une opération : ");
    	
    	System.out.println("1 - Additionner");
    	System.out.println("2 - Soustraire");
    	
    	int userOperation = scanner.nextInt();
    	
    	
    	System.out.println("Le résultat est :" + makeOperation(number1,number2,userOperation));
    	
    	
    }
    
    private static float makeOperation(float number1, float number2, int operationId){

    	IOperation operation = null;
    	float result = 0;
    	
    	switch (operationId) {
    	case 1:
    		operation = new Addition();
    		result = operation.execute();
    	case 2:
    		operation = new Substract();
    		result = operation.execute();
    	}
    	
    }
}
