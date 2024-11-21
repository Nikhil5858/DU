class Producer{

}

class Consumer{

}

class Product{

    int item;
    void prod_put(int item){
        this.item = item;
        System.out.println("Product"+item);
    }
    int pro_get(){
        return item;
    }
}

public class Third {
    public static void main(String[] args) {
    try{

    }   
    catch(InterruptedException e){
        System.err.println(e.toString());
    }     
    }
}
