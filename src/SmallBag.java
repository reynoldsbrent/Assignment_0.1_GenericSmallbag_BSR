public class SmallBag <E>{
   public E x;
   
  public SmallBag(){
	   this.x = null;
   }

  public SmallBag(E x) {
	  this.x = x;
  }
    //setter for Smallbag takes in type E
    public void setX(E x){
        this.x = x;
    }

    //getter for Smallbag returns type E
    public E getX (){
        return x;
    }

	@Override
	public String toString() {
		return "SmallBag [x=" + x + "]";
	}
}