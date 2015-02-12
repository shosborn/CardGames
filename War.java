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
        WarCards c1;
        WarCards c2;
        //WarPlayer winner;
        
        Deck mainDeck=new Deck(new WarCards());
        WarPlayer p1=new WarPlayer(mainDeck);
        WarPlayer p2=new WarPlayer(mainDeck);
        System.out.println(p1.getHand());
        System.out.println(p2.getHand());
        while (!p1.getHand().isEmpty() && !p2.getHand().isEmpty()){
            c1=p1.removeCard();
            c2=p1.removeCard();
            System.out.print("Player 1 plays "+c1.getName());
            System.out.println(", Player 2 plays "+c2.getName()+".");
            
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