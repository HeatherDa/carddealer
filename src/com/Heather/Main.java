package com.Heather;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // hashmap holding numbers 1-52 as keys and string name of card as value.
        // generate a random number in range, and remove that entry from the hashmap,
        // place in a "discard pile" hashmap and sout the value of the card.
        HashMap<Integer, String>carddeck=generatedeck();
        Random num = new Random();
        int card = num.nextInt((carddeck.size()) + 1);
        System.out.println("You have been dealt a(n)" + carddeck.get(card));
    }
    private static HashMap<Integer, String> generatedeck(){
        HashMap<Integer, String> carddeck=new HashMap();
        String[] suits={"Hearts","Spades","Diamonds","Clubs"};
        int count=0;
        for (String a:suits){

            carddeck.put(count,("Ace of "+a));
            count++;
            carddeck.put(count,("2 of "+a));
            count++;
            carddeck.put(count,("3 of "+a));
            count++;
            carddeck.put(count,("4 of "+a));
            count++;
            carddeck.put(count,("5 of "+a));
            count++;
            carddeck.put(count,("6 of "+a));
            count++;
            carddeck.put(count,("7 of "+a));
            count++;
            carddeck.put(count,("8 of "+a));
            count++;
            carddeck.put(count,("9 of "+a));
            count++;
            carddeck.put(count,("10 of "+a));
            count++;
            carddeck.put(count,("Jack of "+a));
            count++;
            carddeck.put(count,("Queen of "+a));
            count++;
            carddeck.put(count,("King of "+a));
            count++;

        }
    return carddeck;
    }
}
