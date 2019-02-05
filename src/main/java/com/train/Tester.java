package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numOfTicket = 0, numOfRoundTicket = 0;

        System.out.println("If you want to terminate this system , please enter -1.");

        while(true) {
                System.out.print("Please enter number of ticket : ");
                numOfTicket = sc.nextInt();
                if (numOfTicket == -1) break;
                System.out.print("Please enter number of round-ticket : ");
                numOfRoundTicket = sc.nextInt();
                if(numOfRoundTicket == -1) break;
                Ticket tk = new Ticket(numOfTicket,numOfRoundTicket);
                tk.print();
        }


    }
}
