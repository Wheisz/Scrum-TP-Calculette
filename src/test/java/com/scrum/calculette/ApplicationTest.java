/*
 * Copyright (c) Ida Willy Theo 2018
 * All rights reserved
 */

package com.scrum.calculette;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ApplicationTest {

    @Before
    // S'exécute AVANT chaque test
    public void setup(){
        System.out.println("Before test");
    }

    @Test
    public void mainTest(){
    	Assert.assertTrue(true);
    }
    
    @After
    // S'exécute APRES chaque test
    public void teardown(){
        System.out.println("After test");
    }
}
