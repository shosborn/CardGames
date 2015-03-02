package cardgames;

/**
 *
 * @author Sims
 */
//a set of 10 cards with each of the 10 decimal digits
//primarily for testing purposes
public class Digits extends Cards{
    private int cardNumber;
    static final int quantity=10;
    
    
    //the primary constructor
    public Digits(int index){
        super (index);
        this.cardNumber=index;
    }
    
    //creates a blank card that is used to construct rest of deck
    public Digits(){}
    
    //gets the primary constructor
    public Digits getConstructor(int index){
        Digits thisCard=new Digits (index);
        return thisCard;
    }
        
    public int getQuantity(){
        return quantity;
    }
    
//    public int getRank(Digits c){
//        return c.rank;I''
//    }
    
    @Override
    public String toString(){
        String str=String.valueOf(cardNumber);
        return str;
    }
}
