package SinglyCircular;

public class SinglyCircular {
    Node tail;
    int size=0;


    public void insertFirst(int val){
        Node newnode= new Node(val);
        if(tail==null){
            tail=newnode;
            tail.next=newnode;
            size++;
        }
        else{
            newnode.next=tail.next;
            tail.next=newnode;
            size++;
        }
    }


    public void insertLast(int val){
        Node newnode=new Node(val);
        if(tail==null){
            insertFirst(val);
        }
        else{
            newnode.next=tail.next;
            tail.next=newnode;
            tail=newnode;
            size++;
        }
    }

    public void inserAt(int val, int pos){
        Node newnode=new Node(val);
        if(tail==null){
            System.out.println("Enter valid position");
            return;
        }
        else if(pos==size){
            insertLast(val);
        }
        else if(pos==1){
            insertFirst(val);
        }
        else{
            System.out.println(tail.data);
            int count=0;
            Node temp=tail;
            while(temp.next!=tail && count<pos-1){
                temp=temp.next;
                count++;
            }
            newnode.next=temp.next;
            temp.next=newnode;
            size++;

        }
    }

    public void deleteFirst(){
        tail.next=tail.next.next;
       // tail.next.next=null;
        System.out.println("delete"+tail.data+tail.next.data);
        size--;
    }

    public void deleteLast(){
        Node temp=tail;
        while(temp.next!=tail){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        tail.next = null;
        tail=temp;
        size--;
    }

    public void deleteAt(int pos){
        if(pos<=0){
            System.out.println("Enter valid position");
        }
          else if(pos==1)
        {
            deleteFirst();
        }
        else if(pos==size){
            deleteLast();
        }
         else{
             int count=1;
             Node temp=tail;
             while(temp.next!=tail && count<pos){
                 temp=temp.next;
                 count++;
             }
             temp.next=temp.next.next;
             size--;
        }

    }


    public void display(){

        Node temp=tail;
        int i=0;
        System.out.println();
        System.out.print("Head--->");
       do {
            System.out.print(temp.next.data+"--->");
            temp=temp.next;
            i++;
        }while(temp.next!=tail.next);
         System.out.println("Tail");
        System.out.println("Size="+size);
    }
}
