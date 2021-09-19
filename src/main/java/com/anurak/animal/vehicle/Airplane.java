/*
 * OOP : Object-Oriented Programming
 * Interface : Animals Project
 */
package com.anurak.animal.vehicle;

import com.anurak.animal.interfaces.Flyable;

/**
 *
 * @author Anurak Yutthanawa
 * 63160015 B.Sc. Computer Science
 * Burapha University
 *
 */
public class Airplane extends Vehicle implements Flyable{

    @Override
    public void fly() {
        System.out.printf("%S is flying", this.model);
    }
    
}
