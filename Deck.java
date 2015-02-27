package cardgames;

/**
 *
 * @author Sims
 */

import java.util.Random;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Deck <C extends Cards> implements Deque{

    int quantity;
    private Cards[] theCards; //= (Cards []) new Object [quantity];
    Random rand =new Random();
    
    //copied from CSC330 HW2
    private static final int DEFAULT_CAPACITY=52;
    //private E[] items;
    private int currentSize;
    private int capacity;
    private int front, back;
    
    //constructs an empty deck
    public Deck(){
        capacity=DEFAULT_CAPACITY;
        currentSize=front=back=0;
    }
    
    //constructs a deck using a single blank card of appropriate type
    public Deck (Cards thisCard){
        quantity=thisCard.getQuantity();
        theCards=(Cards []) new Cards [quantity];
        for (int i=0; i<quantity; i++){
            theCards[i]=thisCard.getConstructor(i);
        front=0;
        back=quantity-1;
        currentSize=quantity;
        capacity=quantity;
        }
    }
    
    //constructs a deck of a given number of cards by pulling from an existing deck
    public Deck (Deck bigDeck, int howMany){
        front=0;
        capacity=quantity=howMany;
        back=quantity-1;
        theCards=(Cards []) new Cards [howMany];
        for (int i=0; i<howMany; i++){
            this.addFirst(bigDeck.removeFirst());
            //this.addFirst(thisCard.getConstructor(bigDeck.().getIndex()));
            //theCards[i]=(Cards) bigDeck.removeFirst();
        }
    }
    
    public String toString(){
        String str="";
        for (int i=0; i<quantity; i++){
            str=str+theCards[i].toString()+" ";
        }
        return str;
    }
    
    public void shuffle(){
        for (int i=0; i<quantity; i++){
            int newPosition=rand.nextInt(quantity);
            swap(i, newPosition);
        }
    }
    
    //returns cards in deck to original order
    public void reset(){
        Cards[] temp=(Cards []) new Cards [quantity];
        for (int i=0; i<quantity; i++){
            int index=theCards[i].getIndex();
            temp[index]=theCards[i];
        }
        theCards=temp;
    }
            
    //utility card to exchange position of two cards in array
    private void swap(int i, int j){
        Cards temp=theCards[i];
        theCards[i]=theCards[j];
        theCards[j]=temp;
    }

//    private Cards getCard(int i){
//        return theCards[i];
//    }

    @Override
        //returns the current size of the deque
        public int size() {
            return currentSize;
        }
        
        @Override
        //returns true iff deque is empty
        public boolean isEmpty() {
            return currentSize==0;
        }
        
        @Override
        //returns first/front item of deque
        public Cards getFirst(){
            if (isEmpty()){throw new NoSuchElementException("Nothing to get");}
            return theCards[front];
        }
        
        @Override
        //adds a new item to the front of the deque
        public void addFirst(Object c) {
            doubleDeque();
            front=decrement(front);
            theCards[front]=(Cards) c;
            currentSize=currentSize+1;
        }
        
        @Override
        //removes and returns first/front item of deque
        public Object removeFirst() {
            if (isEmpty()){throw new NoSuchElementException("Nothing to remove");}
            else{
                Cards first=theCards[front];
                front=increment(front);
                currentSize=currentSize-1;
                return first;
            }
        }
        
        @Override
        //returns last element of the deque
        public Cards getLast(){
            if (isEmpty()){throw new NoSuchElementException("Nothing to get");}
            return theCards[back];
        }
        
        @Override
        //adds a new item to the back of the deque
        public void addLast(Object c) {
            doubleDeque();
            back=increment(back);
            theCards[back]=(Cards) c;
            currentSize=currentSize+1;
        }

        @Override
        //removes the last/back item of the deque
        public Object removeLast() {
            if (isEmpty()){throw new NoSuchElementException("Nothing to remove");}
            else{
                Cards last=theCards[back];
                back=decrement(back);
                currentSize=currentSize-1;
                return last;
            }
        }
        
        public Cards get(int idx){
            // return the element with an offset of idx relative to front
            // Note: idx=0 will return the front item
            if (theCards[(front+idx)%capacity]==null){throw new NoSuchElementException("Nothing to get");}
            return theCards[(front+idx)%capacity];
        }
        
        private int increment(int x){
            //advances the deque position by one
           //x=(x+1)%capacity;
            x=x+1;
            if (x==capacity) x=0;
            return x;
        }
        
        private int decrement(int x){
            //decreases the deque position by one
            //x=(x-1)%capacity;
            x=x-1;
            if (x<0) x=capacity-1;
            return x;
        }
        
        //doubles size of underlying array as necessary to prevent overflow
        private void doubleDeque(){
            if (currentSize==capacity){
                Cards[] temp = (Cards[]) new Cards[capacity*2];
                for (int i=0; i<currentSize; i++){
                    temp[i]=theCards[i];
                    theCards=temp;
                    capacity=capacity*2;
                }
            }
        }   //end of doubleDeque

        @Override
        public void clear() {
            front=back=currentSize=0;
        }
        
        
        @Override
        public Object pollFirst() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Object pollLast() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Object peekFirst() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Object peekLast() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean removeFirstOccurrence(Object o) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean removeLastOccurrence(Object o) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean add(Object e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean offer(Object e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Object remove() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Object poll() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Object element() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Object peek() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void push(Object e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Object pop() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean remove(Object o) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean contains(Object o) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Iterator iterator() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Iterator descendingIterator() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        @Override
        public Object[] toArray() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Object[] toArray(Object[] a) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean containsAll(Collection c) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean addAll(Collection c) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean removeAll(Collection c) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean retainAll(Collection c) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        @Override
        public boolean offerFirst(Object e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean offerLast(Object e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    
}
