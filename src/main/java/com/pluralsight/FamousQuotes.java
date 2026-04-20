package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] quotes = {"Be yourself; everyone else is already taken. - Oscar Wilde", "So many books, so little time. - Frank Zappa", "You only live once, but if you do it right, once is enough. - Mae West", "There is no greater agony than bearing an untold story inside you. - Maya Angelou", "When someone shows you who they are believe them the first time. - Maya Angelou", "But man is not made for defeat. A man can be destroyed but not defeated. - Ernest Hemingway", "Circumstance is not an excuse. - Yours Truly", "'No is a complete sentence. - Annie Lamott'", "The secret of getting ahead is getting started. - Mark Twain", "Believe you can and you are halfway there. - Theodore Roosevelt"};

        System.out.println("Choose a number for your quote 1-10: ");
        int input = scanner.nextInt();
        do {
            try {
                System.out.println(quotes[input]);

            } catch (Exception e) {
                System.out.println("Invalid Input, please try again");
                System.out.println("Choose a number for your quote 1-10: ");
                input = scanner.nextInt();
            }
        } while (!(input < 10) || !(input >= 0));
    }
}
