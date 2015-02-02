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
    private int importance;
    //int quantity;
    
    public Cards(int index){
        this.index=index;
        importance=0;
    }
    
    public abstract String toString();
    
//    public int getQuantity(){
//    return quantity;
//    }
    
    public int getIndex(){
        return index;
    }
    
    public void setImportance(int importance){
        this.importance=importance;
    }
    
    public int getImportance(){
        return importance;
    }
}
