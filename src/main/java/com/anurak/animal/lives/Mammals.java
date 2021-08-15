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
abstract class Mammals extends Animals{
    
    
    protected int numberOfLegs;
    
    
    Mammals(String name, boolean hh, boolean hl, String hbt,int legs, String cols){
        super(name, true, hh, false, hl, hbt, cols);
        this.numberOfLegs = legs;
    }
    
    @Override
    public void speak(){
        System.out.println("Mammals Speak");
    }
    
}
