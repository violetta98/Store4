package com.company.entity;

import java.util.Random;

public class RandomizedHuman {
    protected boolean died;
    protected final Random random=new Random();
    protected int randomAction() {
        return random.nextInt(15);
    }
}
