package cardgames;

/**
 *
 * @author Sims
 */

import java.util.Random;

public class Deck <C extends Cards>{

    int quantity;
    Cards[] theCards; //= (Cards []) new Object [quantity];
    Random rand =new Random();


    //constructs a deck using a single blank card of appropriate type
    public Deck (Cards thisCard){
        quantity=thisCard.getQuantity();
        theCards=(Cards []) new Cards [quantity];
        for (int i=0; i<quantity; i++){
            theCards[i]=thisCard.getConstructor(i);
        }
    }
    
    public String toString(){
        String str="";
        for (int i=0; i<quantity; i++){
            str=str+theCards[i].toString()+" ";
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
        Cards[] temp=(Cards []) new Cards [quantity];
        for (int i=0; i<quantity; i++){
            int index=theCards[i].getIndex();
            temp[index]=theCards[i];
        }
        theCards=temp;
    }
            
    //utility card to exchange position of two cards in array
    private void swap(int i, int j){
        Cards temp=theCards[i];
        theCards[i]=theCards[j];
        theCards[j]=temp;
    }

}
