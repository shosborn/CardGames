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

import java.util.Random;

public class Deck <C>{

    int quantity;
    Cards[] theCards; //= (Cards []) new Object [quantity];
    Random rand =new Random();
       
    public Deck(int quantity){
        this.quantity=quantity;
        theCards=(Cards []) new Cards [quantity];
    }
    
    public String toString(){
        String str="";
        for (int i=0; i<quantity; i++){
            str=str+theCards[i].toString()+" ";
        }
        return str;
    }
    
    public void Shuffle(){
        for (int i=0; i<quantity; i++){
            int newPosition=rand.nextInt(quantity);
            Swap(i, newPosition);
        }
    }
    private void Swap(int i, int j){
        Cards temp=theCards[i];
        theCards[i]=theCards[j];
        theCards[j]=temp;
    }

}
