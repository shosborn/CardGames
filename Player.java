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
public abstract class Player {
    private Deck myDeck;
    private Hand myHand;
    private int score;
    private boolean myTurn;
    
    public void setDeck (Deck d){
        myDeck=d;
    }
    
    public Deck getDeck(){
        return myDeck;
    }
    
    public int getDeckSize(){
        return myDeck.size();
    }
    
    public void setHand (Hand h){
        myHand=h;
    }
    
    public Hand getHand(){
        return myHand;
    }
    
    public void setScore(int score){
        this.score=score;
    }
    
    public int getScore(){
        return score;
    }
    
    public void setTurn(boolean turn){
        myTurn=turn;
    }
    
    public boolean getTurn(){
        return myTurn;
    }
}
