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
        int value1 = 8;
        int value2 = 4;
        int result = Add.execute(value1, value2);

        Assert.assertEquals("Sub not good !", result, 4);
    }

    @After
    // S'exécute APRES chaque test
    public void teardown(){
        System.out.println("End  SubTest");
    }
}
