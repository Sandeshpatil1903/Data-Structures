package Queue;

public class CicularQueueArr {
    int data[];
    int front, rear;
    int size;

    public CicularQueueArr(int size) {
        data = new int[size];
        front=rear=-1;
        this.size=size;
    }

    public void enque(int val){
        if(isFull()){
            System.out.println("Queue is full");
        }
        if(rear==-1)
            front=0;
        data[++rear%size]=val;

    }
    public int deque(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        if(front==rear+1)
            rear=front=-1;
        return data[front++%size];
    }

    public void peek(){
     if(isEmpty()){
         System.out.println("Queue is empty");
         return ;
     }
        System.out.println("Top element is: "+data[front++]);
    }



    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("\nQueue elements are: ");
        for(int i=front; i<=rear; i++){
            System.out.print(data[i]+"-->");
        }
    }

    public boolean isEmpty(){
        if(rear==-1 )
            return true;
        return false;
    }

    public boolean isFull(){
        if(rear==size-1 && front==0 || front==rear+1){
            return true;
        }
        return false;
    }
}
