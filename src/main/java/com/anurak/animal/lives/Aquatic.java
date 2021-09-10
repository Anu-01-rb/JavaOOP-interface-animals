/*
 * OOP : Object-Oriented Programming
 * Abstract : Animals Project
 */
package com.anurak.animal.lives;

/**
 *
 * @author Anurak Yutthanawa
 * 63160015 B.Sc. Computer Science
 * Burapha University
 *
 */
abstract public class Aquatic extends Animals{
    
    Aquatic(String name, String hbt, boolean coldBlood, String cols){
        super(name, false, false, false, false, hbt, cols);
    }
    
    @Override
    abstract public void speak();
    
    @Override
    public void move(){
    	System.out.printf("%s is swimming.\n",this.name);
    }
    
    @Override
    abstract public String toString();
}
