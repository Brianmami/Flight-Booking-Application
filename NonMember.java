/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flightbooking;

/**
 *
 * @author bmami
 */
public class NonMember extends Passenger {
    
    
    @Override
    public double applyDiscount(double discount){
        
        //if Nonmember is +65 years, 10% discount
        if (age > 65){
            
            return discount * 0.9;
        }
           
        return discount; //else, no discount applied
    }
}
