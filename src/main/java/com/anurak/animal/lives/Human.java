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
public class Human extends Land{
    
    public Human(String name, String cols){
        super(name, true, true, "Global", 2, cols);
    }
    @Override
    public void speak(){
        super.speak();
        System.out.println("Human Speak");
    }
    
    @Override
    public String toString(){
        return String.format("Human: %S,\n\tColor: %s\n\tWarm Blood: %b\n\tHabitat: %s\n\tLeg: %d\n", name, colors, warmBlood, habitat, numberOfLegs);
    }
}
