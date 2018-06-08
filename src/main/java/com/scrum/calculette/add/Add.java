/*
 * Copyright (c) Ida Willy Theo 2018
 * All rights reserved
 */

package com.scrum.calculette.add;

import com.scrum.calculette.IOperation;

/**
 * Addition class.
 * @author Théodore Supiot
 */
public class Add implements IOperation {

    private static int numberOfValues;

    /**
     * Value 1 for add.
     */
    private final float value1;

    /**
     * Value 2 for add.
     */
    private final float value2;

    /**
     * Constructor.
     * @param value1 first value to add
     * @param value2 second value to add
     */
    public Add(final float value1, final float value2){
        this.numberOfValues = 2;
        this.value1 = value1;
        this.value2 = value2;
    }

    @Override
    public float execute() throws Exception {
        float result;
        result = this.value1 + this.value2;
        return result;
    }

    @Override
    public int numberOfValues() {
        return this.numberOfValues;
    }
}
