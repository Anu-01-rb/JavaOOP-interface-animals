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
public class Cat extends Mammals{
    
    Cat(String name){
        this.name = name;
    }
    
    Cat(String name, boolean haveHair, int legs, String color){
        this.name = name;
        this.warmBlood = true;
        this.haveHair = haveHair;
        this.haveLegs = true;
        this.habitat = "Global";
        this.numberOfLegs = legs;
        this.colors = color;
        this.haveWings = false;
    }
}
