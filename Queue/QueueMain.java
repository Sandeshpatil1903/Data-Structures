package Queue;

public class QueueMain {
    public static void main(String[] args) {
        CicularQueueArr a= new CicularQueueArr(5);

        a.enque(11);
        a.enque(21);
        a.enque(31);
        a.enque(41);
        a.enque(51);
        a.display();

        a.deque();
        a.deque();
        a.deque();
        a.deque();
        a.deque();
        a.deque();
        a.display();


//        CircularQueUsingLL l= new CircularQueUsingLL();
//        l.enque("Gaurav");
//        l.enque("Deepak");
//        l.enque("Irshad");
//        l.enque("Shashikant");
//        l.enque("Shubham");
//        l.display();



    }
}
