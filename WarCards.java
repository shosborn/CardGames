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
public class WarCards extends StandardCards implements Comparable {
    
    private int rank;
        //used to compare cards
        //2s rank 0, 3s rank 1, Kings rank 12, Aces rank 13
    
    public WarCards(){
        super();
    }
    
    public WarCards(int index){
        super(index);
        rank=index%13;
    }
    
    public int getRank(){
        return rank;
    }

    @Override
    public int compareTo(Object w) {
        WarCards war=(WarCards) w;
//        final int lessThan=-1;
//        final int equal=0;
//        final int greaterThan=1;
        //if (this.rank==war.getRank()) return equal;
        if (this.rank<war.getRank()) return -1;
        if (this.rank<war.getRank()) return 1;
        else return 0;
    }
}
