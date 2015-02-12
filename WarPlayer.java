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
public class WarPlayer {
    
    private Deck hand;
    
    public WarPlayer(Deck mainDeck){
        hand=new Deck(mainDeck, 26);
    }
    
    public WarCards removeCard(){
        return (WarCards) hand.removeFirst();
    }
    
    public void addCard(WarCards c){
        hand.addLast(c);
    }
    
    public Deck getHand(){
        return hand;
    }
    
    public int getHandSize(){
        return hand.size();
    }

}
