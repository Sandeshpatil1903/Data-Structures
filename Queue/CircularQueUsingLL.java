package Queue;

public class CircularQueUsingLL {


    NodeLL front,rear;

    public CircularQueUsingLL() {
        this.front =null;
        this.rear = null;
    }

    public void enque(String data){
       NodeLL node= new NodeLL(data);
       if(rear==null){
           front=rear=node;
           rear.next=front;
       }
       else{
           rear.next=node;
           node.next=front;
           rear=node;
       }
    }

    public NodeLL deque(){
        if(isEmpty()){
            System.out.println("Queue is empty: ");
            return null;
        }

        NodeLL temp=front;
        front=front.next;
        rear.next=front;
        return temp;
    }
    public boolean isEmpty(){
        if(rear==null)
            return true;
        return false;
    }

    public void display() {
        NodeLL temp = front;
        System.out.println("Queue elements are: ");
        do {
            System.out.print(temp.data+"--->");
            temp=temp.next;
        }while(temp!=front);

        System.out.println("END");
    }
}
