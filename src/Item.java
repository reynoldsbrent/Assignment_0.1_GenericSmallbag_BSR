/**
 * This class allows the user to create new items, set the names of the items, and retrieve the names of the items
 * @author brentreynolds
 * @version 9/2/22 Fall 2022
 * @param <T>
 */
public class Item <T>{
	// Instance variables
    private T e;
    
    // Constructors

    /**
     * No argument constructor for Item
     */
    public Item(){
    	this.e = null;
    } // end constructor
    
    /**
     * @param e the value of e based on the calling method
     */
    public Item(T e) {
    	this.e = e;
    } // end constructor
    
    // Accessors and mutators

    /**
     * @param e the value of e as sent into this method
     */
    public void setE (T e){ 
        this.e = e;
    } //end setE
    
    /**
     * @return the current value of e
     */
    public T getE(){ 
        return e;
    } // end getE
}
