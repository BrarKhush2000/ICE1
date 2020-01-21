/*
Name  -Khushpreet Singh Brar
Student Number - 991559087
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
//
//import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Scanner;


/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author khush
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        
 
      
        for (int i = 0; i < magicHand.length; i++)
         
        {
        
        
            Card c = new Card();
        double one= (Math.random() *((14-3) +1))+1;
        int digit = (int) one;
        double two = (Math.random() *((14-3) +1))+1;
        int suit = (int) two;
          
           c.setValue(digit);
           c.setSuit(Card.SUITS[suit]);
           
        }
        
        
        
       Scanner userInput = new Scanner(System.in);
        System.out.println("Enter any card"  + userInput);
        // and search magicHand here
        //Then report the result here
    }

}
