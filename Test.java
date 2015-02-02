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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a new deck
        DigitsDeck myCards=new DigitsDeck ();
        //Deck myCards=new Deck();
        System.out.println(myCards);
        System.out.println("Testing Shuffle Method");
        for (int i=0; i<5; i++){
            myCards.Shuffle();
            System.out.println(myCards);
        }
    }
    
}
