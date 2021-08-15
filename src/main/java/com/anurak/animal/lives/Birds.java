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
abstract class Birds extends Animals{
    protected boolean lowFly;
    protected boolean floatOnWater;
    
    Birds(String name, String hbt, boolean lf, boolean fow, String cols){
        super(name, true, true, true, true, hbt, cols);
        this.lowFly = lf;
        this.floatOnWater = fow;
    }
    
    @Override
    public void speak(){
        System.out.println("Birds Speak");
    }
    
    @Override
    public void walk(){
        System.out.println("Birds Walk");
    }
}
