package LL_Assignments;


public class CircularityLL {
        NodeSCL head,tail,mid;

        int size=0;

    public void insertFirst(int val){
        NodeSCL newnode= new NodeSCL(val);
        if(head==null){
            head=tail=newnode;
            tail.next=newnode;
            size++;
        }
        else{
            newnode.next=head;
            tail.next=newnode;
            head=newnode;
            size++;
        }
    }


//    public void insertLast(int val){
//        NodeSCL newnode=new NodeSCL(val);
//        if(head==null){
//            insertFirst(val);
//        }
//        else{
//            tail.next=newnode;
//            newnode.next=head;
//            tail=newnode;
//            size++;
//        }
//    }

    public void insertLast(int data){

        NodeSCL newnode= new NodeSCL(data);
        if(head==null){
            head=newnode;
           return;
        }
        if(size==5){
            tail.next=newnode;
            newnode.next=head;
            mid=tail;
            tail=newnode;
            size++;
        }
        if(size==8){
            tail.next=newnode;
            newnode.next=mid;
            tail=newnode;
            size++;
        }
        else{
            tail.next=newnode;
            newnode.next=head;
            tail=newnode;
            size++;
        }

    }

    public void display (){
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        }
        int count=1;
        NodeSCL temp=head;
        System.out.println(mid.data);
        System.out.print("\nHead-->");
        while(temp.next!=null && count<=size+10 ){
            System.out.print(temp.data+"-->");
            temp=temp.next;
            count++;
        }
        System.out.print(temp.data+"-->");
        System.out.print("Tail");
    }


    public void checkcircularity(){
        NodeSCL temp=head;
        System.out.println(size);
        while(temp!=null) {
            int count=1;
            NodeSCL temp2 = head;
            while (temp2 != null) {
                if (temp2.next == temp.next) {
                    System.out.println("\nLinked list is circular");
                    return;
                }
                temp2 = temp2.next;
            }
            temp=temp.next;
        }


        System.out.println("Linked list is not circular");


    }


    public static void main(String[] args) {
        CircularityLL c= new CircularityLL();


        c.insertFirst(10);
        c.insertFirst(20);
        c.insertFirst(770);
        c.insertFirst(80);
        c.insertLast(560);
        c.insertLast(220);
        c.insertLast(2300);
        c.insertLast(5550);
        //c.insertLast(78945);



       c.display();
       c.checkcircularity();


    }
}
