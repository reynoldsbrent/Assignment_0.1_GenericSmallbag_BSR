public class Item <T>{
    private T e;

    Item(){

    }

    public void setE (T e){ // takes in type T
        this.e = e;
    }
    public T getE(){ //returns type T
        return e;
    }

}
