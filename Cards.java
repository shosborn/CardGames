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
public abstract class Cards extends Object {
    private int index;
    private int rank;
    private int priority;     //to be dynamically determined in-game
    private int quantity;
    
    //creates a blank card for use in deck construction
    public Cards(){}
    
    //card super constructor
    public Cards(int i){
        this.index=i;
        priority=rank=0;
        
    }
    
    //Called by a blank card to construct remainder of deck
    public abstract Cards getConstructor(int i);
    
    public abstract String toString();
    
    public int setIndex(int index){
        this.index=index;
        return index;
    }
    
    public int getIndex(){
        return index;
    }
    
    public void setImportance(int priority){
        this.priority=priority;
    }
    
    public int getImportance(){
        return priority;
    }
    
    public void setRank(int rank){
        this.rank=rank;
    }
    
    public int getRank(){
        return rank;
    }
    
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    
    public int getQuantity(){
        return quantity;
    }
}
