package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter number of ticket : ");
        int numOfTicket = sc.nextInt();
        System.out.print("Please enter number of round-ticket : ");
        int numOfRoundTicket = sc.nextInt();

        Ticket tk = new Ticket(numOfTicket,numOfRoundTicket);
        tk.print();
    }
}
