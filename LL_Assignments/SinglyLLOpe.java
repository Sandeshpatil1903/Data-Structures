package LL_Assignments;

public class SinglyLLOpe {
    NodeSL head;
    int size=0;

    public void insertFirst(int data){
        NodeSL newnode= new NodeSL(data);
        if(head==null){
            head=newnode;
            size++;
            return;
        }
        newnode.next=head;
        head=newnode;
        size++;
    }

    public void insertLast(int data){
        NodeSL newnode=new NodeSL(data);

        if(head==null){
            insertFirst(data);
            size++;
            return;

        }
        NodeSL temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        size++;
    }

    public void insertAt(int data, int pos){
        System.out.println(size);
        NodeSL newnode=new NodeSL(data);
        if(pos<=0){
            System.out.println("Invalid position");
            return;
        }
        if(pos>size+1){
            System.out.println("Enter a valid position");
            return;
        }
        if(pos==1){
            insertFirst(data);
            return;
        }
        if(pos==size+1){
            insertLast(data);
            return;
        }
        NodeSL temp=head;
        int count=1;
        while(count<pos-1){
          temp=temp.next;
            count++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
        size++;
    }

    public void deleteFirst(){
        NodeSL temp=head;
        head=head.next;
        temp.next=null;
        size--;
    }
    public void deleteLast(){
        NodeSL temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        NodeSL temp1=temp.next;
        temp.next=null;
        temp1.next=null;
        size--;

    }

    public void deleteAt(int pos){
        if(pos<=0 && pos>size+1){
            System.out.println("Invalid position");
            return;
        }
        if(pos==1){
            deleteFirst();
            return;
        }
        if (pos==size){
            deleteLast();
            return;
        }

        NodeSL temp=head;
        int count=1;
        while(count<pos){
            temp=temp.next;
        }
        NodeSL temp1=temp;
        temp.next=temp.next.next;
        temp1.next=null;
        size--;

    }

    public void display (){
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        }
        NodeSL temp=head;
        System.out.print("\nHead-->");
        while(temp.next!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print(temp.data+"-->");
        System.out.print("Tail");
    }
    public int size(){
        if(head==null)
            return 0;
        return size;
    }

    public void checkdupli(){
        NodeSL temp=head;
        while(temp!=null){
            NodeSL temp1= temp;
            NodeSL temp3= temp.next;
            NodeSL prev=temp;
            while(temp3!=null){
                if(temp1.data==temp3.data){
                    prev.next=temp3.next;
                    if(temp1.data==temp3.next.data){
                      temp3=prev;
                    }
                }
                    prev=temp3;
                    temp3=temp3.next;
            }
            temp=temp.next;
        }
    }


    public void middleele()
    {
        NodeSL temp=head;
        System.out.println("\nMiddle elements: ");
        if(size%2==0) {
            for (int i = 1; i < (size / 2); i++) {
                temp=temp.next;
                    }
            System.out.println(temp.data);
            System.out.println(temp.next.data);
            }

            else{
                for(int i=1; i<=(size)/2;i++)
                {
                    temp=temp.next;
                }
            System.out.println(temp.data);

            }


        }
    }

