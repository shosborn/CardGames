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
    private int testNumber;
    private int intNumber;
    static final String[] numbering=
            {"2", "3", "4", "5", "6", "7", "8", "9", "10", 
            "J", "Q", "K", "A"};
    private int rank;
    
    //the primary constructor
    public StandardCards(int index){
        super(index);
        number=numbering [getIndex()%13];
        //this.testNumber=index;
        intNumber=index%13;
        rank=intNumber;
        if (index<13) this.suite="Cl";
        else if (index>=13 && index<=25) this.suite="Di";
        else if (index>=26 && index<=38) this.suite="He";
        else if (index>=29 && index <=51) this.suite="Sp";
        this.name=number+"-"+suite;
    }
    
     //creates a blank card that is used to construct rest of deck
    public StandardCards(){}
    
    //gets the primary constructor
    public StandardCards getConstructor(int index){
        StandardCards thisCard=new StandardCards (index);
        return thisCard;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public void setRank(int rank){
        this.rank=rank;
    }
    
    public int getRank(){
        return rank;
    }
    
    @Override
    public String toString(){
        return name;
    }

    @Override
    public int compareTo(Object c) {
        StandardCards card=(StandardCards) c;
        if (this.getRank()<card.getRank()) return -1;
        if (this.getRank()>card.getRank()) return 1;
        else return 0;
    }
}
