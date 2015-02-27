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
public class War {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StandardCards c1;
        StandardCards c2;
        
        //Deck mainDeck=new Deck(new WarCards());
        Deck mainDeck=new Deck(new StandardCards());
        System.out.println(mainDeck);
        mainDeck.shuffle();
        WarPlayer p1=new WarPlayer(mainDeck);
        WarPlayer p2=new WarPlayer(mainDeck);
        System.out.println(p1.getHand());
        System.out.println(p2.getHand());
        while (!p1.getHand().isEmpty() && !p2.getHand().isEmpty()){
            //p1.removeFirst();
            c1=p1.removeFirst();
            c2=p1.removeFirst();
//            c1=(WarCards) p1.hand.getFirst();
            System.out.print("Player 1 plays "+c1.getName()+":rank "+c1.getRank());
            System.out.println(", Player 2 plays "+c2.getName()+":rank "+c1.getRank()+".");
            
            //Deck activeDeck=new Deck();
            switch (c1.compareTo(c2)){
                case 1:
                    //winner=p1;
                    p1.addCard(c1);
                    p1.addCard(c2);
                    System.out.println("Player 1 wins.");
                    break;
                case -1:
                    //winner=p2;
                    p1.addCard(c1);
                    p1.addCard(c2);
                    System.out.println("Player 2 wins.");
                    break;
                case 0:     //war!
                    System.out.println("War!");
                    System.out.println("The opposing cards annihilate each other.");
                    break;
            }   //end switch
            System.out.println("Player 1 "+ p1.getHandSize()+", Player 2 "+p2.getHandSize());
            System.out.println();
        }   //end while neither player down to zero.
        if (p1.getHandSize()>0){
            System.out.println("Player 1 wins the game!");
        }
        else if (p2.getHandSize()>0){
            System.out.println("Player 2 wins the game!");
        }
        else{
            System.out.println("Everyone dies.  The end.");
        }
    }   //end of main
    
}
