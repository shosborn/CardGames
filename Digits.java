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
    
    public Digits(int cardNumber){
        super (cardNumber);
        this.cardNumber=cardNumber;
    }
    
    //creates a blank card that is used to construct rest of deck
    public Digits(){}
    
    //the primary constructor
    public Digits getConstructor(int cardNumber){
        Digits thisCard=new Digits (cardNumber);
        return thisCard;
    }
        
    public int getQuantity(){
        return quantity;
    }
    
    @Override
    public String toString(){
        String str=String.valueOf(cardNumber);
        return str;
    }
}
