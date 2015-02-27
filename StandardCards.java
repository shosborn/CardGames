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
public class StandardCards extends Cards implements Comparable{
    static final int quantity=52;
    private String number;
    private String suite;
    private String name;
    private int rank;
    
    static final String[] numbering=
            {"2", "3", "4", "5", "6", "7", "8", "9", "10", 
            "J", "Q", "K", "A"};
            //this array uses a unique card index to determine card number
    
    //creates a blank card
    public StandardCards(){
        super();
    }    
 
    public StandardCards(int index){
        super (index);
        number=numbering [this.index%13];
        rank=this.index%13;
        if (index<13) this.suite="Cl";
        else if (index>=13 && index<=25) this.suite="Di";
        else if (index>=26 && index<=38) this.suite="He";
        else if (index>=29 && index <=51) this.suite="Sp";
        //Throw some kind of exception here for out of bounds index?
        this.name=number+"-"+suite+": rank"+rank;
        //rank=this.index%13;
    }//End of Constructor
    
    @Override
    public Cards getConstructor(int i) {
        StandardCards thisCard=new StandardCards (i);
        return thisCard;
    }

    public String getName(){
        return name;
    }
    
    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }
    
    public void setRank(int rank){
        this.rank=rank;
    }
    
    public int getRank(){
        return rank;
    }

    @Override
    public int compareTo(Object c) {
        StandardCards card=(StandardCards) c;
        if (this.rank<card.getRank()) return -1;
        if (this.rank<card.getRank()) return 1;
        else return 0;
    }
}
