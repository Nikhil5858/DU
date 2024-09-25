public class staticlass {

    //non static class
    public class add{
        void addition(){
            System.out.println("Addition : " + (10+20));
        }
    }

    //static class
    static class sub{
        static void substraction(){
            System.out.println("Substraction : "+ (50-20));
        }
    }
    
    //non static method
    void multi(){
        System.out.println("Multiplication : "+ (5*6));
    }

    //static method
    static void div(){
        System.out.println("Divison : "+ (10/2));
    }

public static void main(String[] args) {
    staticlass s = new staticlass();
    s.multi();
    staticlass.div();
    staticlass.add ad = s.new add();
    ad.addition();
    staticlass.sub.substraction();
}    
}