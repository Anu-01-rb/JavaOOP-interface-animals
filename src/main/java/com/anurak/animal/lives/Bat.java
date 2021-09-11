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
public class Duck extends Birds{
    
    public Duck(String name, String cols){
       super(name, "Global", false, false, cols);
    }
    
    @Override
    public void speak(){
        super.speak();
        System.out.println("Bat Speak");
    }
    
    @Override
    public String toString(){
        return String.format("Bat: %S,\n\tColor: %s\n\tWarm Blood: %b\n\tHabitat: %s\n", name, colors, warmBlood, habitat);
    }
}
