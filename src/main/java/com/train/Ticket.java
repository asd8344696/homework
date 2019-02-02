package com.train;

public class Ticket {
    int numOfTicket;
    int numOfRoundTicket;
    int totalPrice;
    int numOfNonRoundTicket;
    Ticket(int numT,int numRoundT){
        numOfTicket = numT;
        numOfRoundTicket = numRoundT;
        numOfNonRoundTicket = numOfTicket - numOfRoundTicket;
    }
    public void print(){
        double sum = numOfNonRoundTicket * 1000 + (numOfRoundTicket * 2000 * 0.9);
        System.out.println("Your total price is $" + (int)sum + " By JAVA");
    }
}
