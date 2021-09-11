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
       super(name, "Global", true, true, cols);
    }
    
    @Override
    public void speak(){
        super.speak();
        System.out.println("Duck Speak");
    }
    
    @Override
    public void walk(){
        super.walk();
        System.out.println("Duck Walk");
    }
    
    @Override
    public void fly(){
        super.fly();
        System.out.println("Duck Fly");
    }
    
    @Override
    public String toString(){
        return String.format("My name is %s, I'm a duck I'm %s, I have wings", name , colors);
    }
}
