/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgames;

/**
 *
 * @author Sims
 */
//a set of 10 cards with each of the 10 decimal digits
//primarily for testing purposes
public class Digits extends Cards{
    private int cardNumber;
    //int quantity=10;
    static int quantity=10;
    
    public Digits(int cardNumber){
        super (cardNumber);
        this.cardNumber=cardNumber;
    }
    
    @Override
    public String toString(){
        String str=String.valueOf(cardNumber);
        return str;
    }
}
