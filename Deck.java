package cardgames;

/**
 *
 * @author Sims
 */

import java.util.Random;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Iterator;


public class Deck <C extends Cards> extends ArrayDeque{

    int quantity;
    Random rand=new Random();
    
    //constructs an empty deck of the requested size
    public Deck(int quantity){
        super(quantity);
        this.quantity=quantity;
    }
    
//constructs a deck using a single blank card of appropriate type
    public Deck (Cards thisCard){
        super(thisCard.getQuantity());
        quantity=thisCard.getQuantity();
        for (int i=0; i<quantity; i++){
            push(thisCard.getConstructor(i));
        }
    }  //end of public Deck (Cards thisCard)
    
     //constructs a deck of a given number of cards by pulling from an existing deck
    public Deck (Deck bigDeck, int howMany){
        super(howMany);
        for (int i=0; i<howMany; i++){
            push(bigDeck.pop());
       }
    }
    
    @Override
    public String toString(){
        String str="";
        Iterator itr=iterator();
        while(itr.hasNext()){
            str=str+itr.next().toString()+" ";
        }
        return str;
    }
    
    public void shuffle(){
        ArrayList<C> temp=new ArrayList<>(this);

        for (int i=0; i<quantity; i++){
            int newPosition=rand.nextInt(quantity);
            C temp1=(C) temp.get(i);
            C temp2=(C) temp.get(newPosition);
            temp.set(newPosition, temp1);
            temp.set(i, temp2);
        }
        this.clear();
        Iterator itr=temp.iterator();
        while (itr.hasNext()){
            push(itr.next());
        }
    }
    
}
