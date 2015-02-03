
package cardgames;

/**
 *
 * @author Sims
 */
//for testing various aspects of the project
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a new deck of cards and print
        Deck myDeck=new Deck(new Digits());
        System.out.println(myDeck);
        //Shuffle deck 5 times and print results each time
        System.out.println("Testing Shuffle Method");
        for (int i=0; i<5; i++){
            myDeck.shuffle();
            System.out.println(myDeck);
        }
        //Return cards to original order and print
        System.out.println("Testing Reset");
        myDeck.reset();
        System.out.println(myDeck);
    }   
}
