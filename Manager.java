/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flightbooking;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author bmami
 */
public class Manager {
    
    //creating array lists for the flight and ticket lists so that items in each list can be easily added
    //or removed with ease 
    
    ArrayList<Flight> flightList = new ArrayList<Flight>();
    
    ArrayList<Ticket> ticketList = new ArrayList<Ticket>();
    
    public Manager(){
     
    }
    
    //this method creates a flight by creating a new instance of a flight object and adding it to the flightlist array
    // the information for this flight is added from the flight class
    
    public void createFlights(Flight flight){
        flightList.add(flight);
    }
    
    //displaying flights 
    public void displayAvailableFlights(String origin, String destination){
        System.out.println("Available flights from " + origin + " to " + destination + ":");  
        
        
        /*the for loop will run until it is equal or greater than the flightlist array list
          and for each spot in the list, a check for if the number of seats is > 1, 
          origin is equal to origin and destination is equal to destination. if this is true,
          the overridden toString method will print 
        
           
        */
        for(int i = 0; i < flightList.size(); i++){
            Flight f = getFlight(i);
            if(f.getNumberOfSeatsLeft() > 1 
               && origin.equals(f.getOrigin())
               && destination.equals(f.getDestination())){  
                System.out.println(f.toString());
            }            
        }
        
        System.out.println("");
    }
    
    //getter for the flight list number 
    
    public Flight getFlight(int flightNumber){     
        return flightList.get(flightNumber);
    }
    
    //bookSeat method sets the book variable to get each flight 
    
    public void bookSeat(int flightNumber, Passenger p){
        Flight book = getFlight(flightNumber - 1);
        boolean valid;
        double price;
        
        System.out.println(p.name + " is booking flight number " + flightNumber + ":");
        
        valid = book.bookASeat();
        if(valid == false){
            System.out.println("The flight is full");
            System.out.println();
        }
        else if(valid == true){
            
            //if the person is a member, the correct discount checking method will run for the proper discount
            
            if(p instanceof Member == true){
              
                price = p.applyDiscount(book.getOriginalPrice());
            }
            else{ //if the person is not a member, the correct discount checking method will run for the proper discount
                
                price = p.applyDiscount(book.getOriginalPrice());
            } 
            
            Ticket ticket = new Ticket(p, book, price);
            
            ticketList.add(ticket);
            
            System.out.println("Flight has been booked");
            System.out.println("Ticket & booking details:");
            System.out.println(ticket.toString());
            System.out.println();

        }
    }
    
    public static void main(String[] args){
        
        Manager man = new Manager();
        
        Flight f1 = new Flight(1, 100, 10, 
        "Los Angeles", "New York", "01/09/2024 6:30 pm", 1000);
        
        Flight f2 = new Flight(2, 140, 0, 
        "Toronto", "New York", "01/30/2024 6:24 pm", 1000);
        
        Flight f3 = new Flight(3, 160, 40, 
        "Toronto", "New York", "03/11/2024 1:20 pm", 1000);
        
        Flight f4 = new Flight(4, 200, 20, 
        "Toronto", "Paris", "02/29/2024 9:00 am", 1000);
        
        Flight f5 = new Flight(5, 160, 5, 
        "Toronto", "Paris", "04/22/2024 12:55 am", 1000);
        
        Flight f6 = new Flight(6, 0, 5, 
        "Toronto", "Paris", "04/22/2024 12:50 am", 1000);
        
        //creates the flights with the information given above
        man.createFlights(f1);
        man.createFlights(f2);
        man.createFlights(f3);
        man.createFlights(f4);
        man.createFlights(f5);
        man.createFlights(f6);
        
        //displays the flights with these specific origin & destination combinations
        man.displayAvailableFlights("Toronto", "New York");
        man.displayAvailableFlights("Toronto", "Paris");
        man.displayAvailableFlights("Los Angeles", "New York");
        
        Passenger pass1 = new Member(6); //member with 5+ years (50%dis)
        pass1.setName("Brian Mami");
        pass1.setAge(50);
        
        Passenger pass2 = new Member(2); //member between 1 and 5 years (10%dis)
        pass2.setName("Dominique Armani Jones");
        pass2.setAge(20);
        
        Passenger pass3 = new NonMember(); //nonmember greater than 65(10%dis)
        pass3.setName("Sergio Giovanni Kitchens");
        pass3.setAge(70);
        
        Passenger pass4 = new NonMember(); //non member less than 65 (0%dis)
        pass4.setName("Monkey D. Luffy");
        pass4.setAge(12);
        
        Passenger pass5 = new Member(0); //member with less than 1 year (0%dis)
        pass5.setName("Bianca Varano");
        pass5.setAge(35);
        
        Passenger pass6 = new Member(0); //full flight
        pass6.setName("Gojo Satoru");
        pass6.setAge(35);
        
        //1st flight
        man.bookSeat(1, pass1);
        
        //2nd flight
        man.bookSeat(2, pass2);
        
        //3rd flight
        man.bookSeat(3, pass3);
        
        //4th flight
        man.bookSeat(4, pass4);
        
        //5th flight
        man.bookSeat(5, pass5);
        
        //6th flight
         man.bookSeat(6, pass6);
    }
} 

