class Parent {
   public void show() {
      System.out.println("Parent's show()");
   }
}

class Child extends Parent {
   public void show() {
      System.out.println("Child's show()");
   }
}

public class hello {
   public static void main(String[] args) {
      Parent p = new Child();
      p.show();
   }
}
