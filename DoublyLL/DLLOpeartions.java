package DoublyLL;

public class DLLOpeartions {

    Node head,tail;
    int size=0;

    public void insertFirst(int val){
        Node newnode= new Node(val);
        if(head==null){
            head=tail=newnode;
            size++;
            return;
        }
        else{
            Node temp=head;
            newnode.next=temp;
            newnode.prev=null;
            temp.prev=newnode;
            head=newnode;
            size++;
        }
    }

    public void insertLast(int val){
        Node newnode=new Node(val);
        if(head==null){
            head=tail=newnode;
        }
        else {
            tail.next = newnode;
            newnode.prev = tail;
            newnode.next = null;
            tail = newnode;
        }
        size++;
    }
  public void insertAt(int val, int pos){
        Node newnode=new Node(val);
        if(pos==1){
            insertFirst(val);
            return;
        }
        if(pos==size+1){
          insertLast(val);
          return;
        }
        if(head==null){
            System.out.println("Enter valid position");
            return;
        }
        else{

//            Node temp=tail;
//            int count=size;
//            while(count>pos){
//                System.out.println(count);
//                temp=temp.prev;
//                count--;
//            }
//            newnode.prev=temp.prev;
//            newnode.next=temp;
//            temp.prev.next=newnode;

            Node temp=head;
            int count=1;
            while(count<pos-1 && temp!=null){
                temp=temp.next;
                count++;
            }
            newnode.next=temp.next;
            newnode.prev=temp;
            temp.next.prev=newnode;
            temp.next=newnode;
        }
  }

            public void deleteFirst(){
                if(head==null)
                    return;
                Node temp=head;
                temp.next.prev=null;
                head=temp.next;
                temp.next=null;
                size--;
            }
            public void deleteLast(){
             if(head==null)
                 return;
             Node temp=tail;
             temp.prev.next=null;
             temp.prev=null;
             size--;
    }

            public void deleteAt(int pos){
            if(head==null)
                return;
            if(pos==1) {
                deleteFirst();
                return;
            }
            if(pos==size){
                deleteLast();
                return;
            }
            int count=1;
            Node temp=head;
            while(temp!=null && count<pos-1){
                count++;
                temp=temp.next;
            }
            temp.next.prev=null;
            temp.next.next.prev=temp;
            temp.next=temp.next.next;
            size--;
    }




    public void Forwarddisplay() {
        if (head == null)
            System.out.println("Linked List is empty");

        Node temp=head;
        System.out.println();
        while (temp != null) {
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("Tail");
        System.out.println("Size of LL:"+size);
    }
    public void Backwarddisplay() {
        if (head == null)
            System.out.println("Linked List is empty");

        Node temp=tail;
        System.out.println();
        while (temp != null) {
            System.out.print(temp.data+"-->");
            temp = temp.prev;
        }
        System.out.println("Tail");
        System.out.println("Size of LL:"+size);
    }
}
