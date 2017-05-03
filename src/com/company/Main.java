package com.company;

import factory.mauser.MauserFactory;

public class Main {

    public static void main(String[] args) {

        MauserFactory factory = new MauserFactory();
        factory.createBFG();
        factory.createGun();
        factory.createRevolver();
        factory.createRifle();
    }
}
