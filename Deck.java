package cardgames;

/**
 *
 * @author Sims
 */

import java.util.Random;
import java.util.ArrayList;


public class Deck <C extends Cards> extends ArrayList{

    int quantity;
    Random rand=new Random();
    
    //constructs an empty deck of the requested size
    public Deck(int quantity){
        this.quantity=quantity;
    }
    
//constructs a deck using a single blank card of appropriate type
    public Deck (Cards thisCard){
        quantity=thisCard.getQuantity();
        for (int i=0; i<quantity; i++){
            add(i, thisCard.getConstructor(i));
        }
    }  //end of public Deck (Cards thisCard)
    
     //constructs a deck of a given number of cards by pulling from an existing deck
    public Deck (Deck bigDeck, int howMany){
        for (int i=0; i<howMany; i++){
            this.add(bigDeck.remove(i));
        }
    }
    
    @Override
    public String toString(){
        String str="";
        for (int i=0; i<quantity; i++){
            //str=str+theCards[i].toString()+" ";
            str=str+get(i).toString()+" ";
        }
        return str;
    }
    
    public void shuffle(){
        for (int i=0; i<quantity; i++){
            int newPosition=rand.nextInt(quantity);
            swap(i, newPosition);
        }
    }
    
     //returns cards in deck to original order
    public void reset(){
        Deck tempDeck=(Deck) this.clone();
        //clear();
        for (int i=0; i<quantity; i++){
            C tempCard=(C) tempDeck.get(i);
            set(tempCard.getIndex(), tempCard);
        }
    }

    //utility method to exchange position of two cards in array
    private void swap(int i, int j){
        C temp1=(C) get(i);
        C temp2=(C) get(j);
        set(j, temp1);
        set(i, temp2);
    }  
}
