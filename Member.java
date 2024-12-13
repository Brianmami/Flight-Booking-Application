/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flightbooking;

/**
 *
 * @author bmami
 */
public class Member extends Passenger {
    
    // creating instance variable for how long a membership has existed 
    
    private int yearsOfMembership;
    
    public Member(int yearsOfMembership){  //constructor for instance variable
        
                                   
        this.yearsOfMembership = yearsOfMembership;     
        
    }
    
    @Override
    public double applyDiscount(double discount){
        
        //if membership is +5 years, 50% discount
        if (yearsOfMembership > 5){
            
            return discount * 0.5;
        }
        
        //if membership is +1 years and <5years, 10% discount
        else if (1 < yearsOfMembership && yearsOfMembership <= 5){
            
            return discount * 0.9;
        }
        else { //if memebership is none of those, return the original price
            return discount;
        }
    }
}
