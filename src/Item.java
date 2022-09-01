public class Item <T>{
    private T e;

    public Item(){
    	this.e = null;
    }
    
    public Item(T e) {
    	this.e = e;
    }

    public void setE (T e){ // takes in type T
        this.e = e;
    }
    public T getE(){ //returns type T
        return e;
    }

	@Override
	public String toString() {
		return "Item [e=" + e + "]";
	}
}
