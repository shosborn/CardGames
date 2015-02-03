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
public abstract class Cards {
    private int index;
    private int importance;     //to be dynamically determined in-game
    
    //creates a blank card for use in deck construction
    public Cards(){}
    
    //card super constructor
    public Cards(int i){
        this.index=i;
        importance=0;
    }
    
    //Called by a blank card to construct remainder of deck
    public abstract Cards getConstructor(int i);
    
    public abstract String toString();
    
    public int getIndex(){
        return index;
    }
    
    public void setImportance(int importance){
        this.importance=importance;
    }
    
    public int getImportance(){
        return importance;
    }
    
    public abstract int getQuantity();
}
