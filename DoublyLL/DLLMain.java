package DoublyLL;

public class DLLMain {

    public static void main(String[] args) {
        DLLOpeartions d=new DLLOpeartions();
        d.insertFirst(5);
        d.insertFirst(15);
        d.insertFirst(25);
        d.insertLast(10);
        d.insertLast(20);
        d.Forwarddisplay();
        d.insertAt(35,2);
        d.Forwarddisplay();
        d.deleteLast();
        d.Forwarddisplay();
        d.deleteAt(3);
      //  d.Backwarddisplay();
        d.Forwarddisplay();
    }

}
