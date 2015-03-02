///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
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
        Deck mainDeck=new Deck(new StandardCards());
        
        
        System.out.println("MainDeck size: "+mainDeck.size());
        mainDeck.shuffle();
        WarPlayer p1=new WarPlayer(mainDeck);
        WarPlayer p2=new WarPlayer(mainDeck);
        while (!p1.getDeck().isEmpty() && !p2.getDeck().isEmpty()){    
            c1=p1.playCard();
            c2=p2.playCard();
            System.out.print("Player 1 plays " +c1+", ");
            System.out.println("Player 2 plays "+ c2);
            switch (c1.compareTo(c2)){
                case 1:
                    p1.takeCard(c1);
                    p1.takeCard(c2);
                    System.out.println("Player 1 wins.");
                    break;
                case -1:
                    p2.takeCard(c1);
                    p2.takeCard(c2);
                    System.out.println("Player 2 wins.");
                    break;
                case 0:     //war!
                    System.out.println("War!");
                    System.out.println("The opposing cards annihilate each other.");
                    break;
            }   //end switch
            System.out.println("Player 1 "+ p1.getDeckSize()+", Player 2 "+p2.getDeckSize());
            System.out.println();
        }   //end when either player down to zero.
        if (p1.getDeckSize()>0){
            System.out.println("Player 1 wins the game!");
        }
        else if (p2.getDeckSize()>0){
            System.out.println("Player 2 wins the game!");
        }
        else{
            System.out.println("Everyone dies.  The end.");
        }
    }   //end of main


}
