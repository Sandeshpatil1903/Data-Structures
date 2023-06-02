package SinglyCircular;

public class SinglyCircularMain {

    public static void main(String[] args) {
        SinglyCircular s= new SinglyCircular();
        s.insertFirst(10);
        s.insertFirst(20);
        s.insertFirst(30);
       // s.display();
        s.insertLast(50);
        s.insertLast(60);
       // s.display();
        s.inserAt(80,4);
        s.display();
        s.deleteFirst();
        s.display();
        s.deleteLast();
        s.display();
      s.deleteAt(1);
        s.display();
    }
}
