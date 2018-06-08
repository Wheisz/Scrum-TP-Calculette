/*
 * Copyright (c) Ida Willy Theo 2018
 * All rights reserved
 */

package com.scrum.calculette.sub;

import com.scrum.calculette.add.Add;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SubTest {
    @Before
    // S'exécute AVANT chaque test
    public void setup(){
        System.out.println("Starting SubTest");
    }

    @Test
    public void testSub(){
        float value1 = 8;
        float value2 = 4;
   //     Sub operation = new Sub(value1, value2);
 //       float result = operation.execute();

     //   Assert.assertEquals("Add not good !", result, 4);
    }

    @After
    // S'exécute APRES chaque test
    public void teardown(){
        System.out.println("End  SubTest");
    }
}
