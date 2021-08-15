/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anurak.animal.lives;

/**
 *
 * @author anurak
 */
abstract class Cat extends Mammals{
    
    Cat(String name, boolean hh, String cols){
        super(name, hh, true, "Global", 4, cols);
    }
    @Override
    public void speak(){
        System.out.println("Cat Speak");
    }
    
    @Override
    public void walk(){
        System.out.println("Birds Walk");
    }
}
