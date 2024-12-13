/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flightbooking;

/**
 *
 * @author bmami
 */
public class Ticket {
    // creating instance variables 
    
    private Passenger passenger;
    private Flight flight;
    private double price;
    private int ticketNumber;
    private static int number = 1;
    
    //Constructor to set the instance variables for each instance
    
    public Ticket(Passenger p, Flight flight, double price){
    
    // setting the instance variables for each instance
    
        passenger = p;
        this.flight = flight;
        this.price = price;
        this.ticketNumber = number;
        
        number++;
        //increment the number variable so that each ticket can have a unique ticket number
    
    
    }
    
    // Setters for instance variables
    
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }
    
    
    // Getters for instance variables
    public Passenger getPassenger() {
        return this.passenger;
    }

    public Flight getFlight() {
        return this.flight;
    }

    public double getPrice() {
        return this.price;
    }

    public int getTicketNumber() {
        return this.ticketNumber;
    }

    public static int getNumber() {
        return number;
    }
    
    // overriding the toString method to print out all our variables
 @Override
    public String toString(){
        return (passenger.name + ", Flight " + flight.getFlightNumber() + ", " + flight.getOrigin() + " to " + flight.getDestination() + ", " + flight.getDepartureTime() + ", original price: " + flight.getOriginalPrice() + "$, ticket price: $" + price);
    }
   }

