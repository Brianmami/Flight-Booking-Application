/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flightbooking;

/**
 *
 * @author bmami
 */
public class Flight {
   
    
    // creating instance variables 
    
    private double originalPrice;
    private String origin, destination, departureTime;
    private int flightNumber, capacity, numberOfSeatsLeft;
    
    //Constructor to set the instance variables for each instance
    
    public Flight(int flightNumber, int capacity, int numberOfSeatsLeft, 
                  String origin, String destination, String departureTime, double originalPrice){
        
        //illegal argument exception to throw an error if the origin and destination are the same 
        if (origin.equals(destination)){
            
            throw new IllegalArgumentException("origin cannot be the same as the destination");
        }
        
        // setting the instance variables for each instance
        
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.capacity = capacity;
        this.originalPrice = originalPrice;
        this.numberOfSeatsLeft = capacity;
        
    }
    
    // setters for instance variables to set each instance to them
    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setNumberOfSeatsLeft(int numberOfSeatsLeft) {
        this.numberOfSeatsLeft = numberOfSeatsLeft;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }
    
    
    // getters for instance variables to return that instance of it 
    public int getFlightNumber() {
        return this.flightNumber;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getNumberOfSeatsLeft() {
        return this.numberOfSeatsLeft;
    }

    public String getOrigin() {
        return this.origin;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }

    public double getOriginalPrice() {
        return this.originalPrice;
    }
    
    
    
    /* method for booking seats. checks if there are still seats left, if there is
    decrement the number of seats variable and return true, else return false*/
    public boolean bookASeat(){
        if (this.numberOfSeatsLeft > 0){
            numberOfSeatsLeft--;
            return true;
        }
        return false;
    }
    
    // overriding the toString method to print out all our variables
    @Override
    public String toString() {
        return "Flight " + getFlightNumber() + ", " + getOrigin() + " to " + 
                getDestination() + ", " + getDepartureTime() + ", original price: " +
                getOriginalPrice() + "$";
    }
}

