/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flightbooking;

/**
 *
 * @author bmami
 */
//creating abstract class with all the parameters to be used by child classes (which extend this class)

public abstract class Passenger {
    
    protected String name;
    protected int age;
    
    public Passenger(){
       this.name = getName();
       this.age = getAge();
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    //abstract method allowing child classes to have this method but override it to that classes specific needs
    public abstract double applyDiscount(double p);
}
