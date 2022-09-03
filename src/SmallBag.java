/**
 * This class allows the user to put items into the smallbag
 * @author brentreynolds
 * @version 9/2/22 Fall 2022
 * @param <E>
 */
public class SmallBag <E>{
	// Instance variables
   public E x;
   
   // Constructors
   
  /**
 * No argument constructor for SmallBag
 */
public SmallBag(){
	   this.x = null;
   } // end constructor

  /**
 * @param x the value of x based on the calling method
 */
public SmallBag(E x) {
	  this.x = x;
  }// end constructor

// Accessors and Mutators

    /**
     * @param x the value of x as sent into this method
     */
    public void setX(E x){
        this.x = x;
    } // end setX

    /**
     * @return the current value of x
     */
    public E getX (){
        return x;
    } // end getX
}