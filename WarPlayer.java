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
public class WarPlayer extends Player{
    
    private Deck myDeck;
    
    public WarPlayer(Deck mainDeck){
        myDeck=new Deck(mainDeck, 26);
    }
    
    public StandardCards playCard(){
        return (StandardCards) myDeck.pop();
    }
    
    public void takeCard(StandardCards c){
        myDeck.addLast(c);
    }
       
//    @Override
//    public Deck getDeck(){
//        return myDeck;
//    }
    
    @Override
    public int getDeckSize(){
        return myDeck.size();
    }

}
