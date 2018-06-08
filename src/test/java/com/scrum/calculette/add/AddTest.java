/*
 * Copyright (c) Ida Willy Theo 2018
 * All rights reserved
 */

package com.scrum.calculette.add;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddTest {
    @Before
    // S'exécute AVANT chaque test
    public void setup(){
        System.out.println("Starting AddTest");
    }

    @Test
    public void testAdd(){
        int value1 = 8;
        int value2 = 4;
        Add operation = new Add(value1, value2);
        int result = operation.execute();

        Assert.assertEquals("Add not good !", result, 12);
    }

    @After
    // S'exécute APRES chaque test
    public void teardown(){
        System.out.println("End  AddTest");
    }
}
