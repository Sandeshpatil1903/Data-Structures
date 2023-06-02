package LL_Assignments;

public class SortInsertion {
    NodeSL head;
    public void insert(int data){
        NodeSL node= new NodeSL(data);

        if(head==null){
            head=node;
            return;
        }
        NodeSL temp=head;
        while(temp!=null){
            if (temp.next != null) {


            if(node.data>temp.data && node.data<temp.next.data){
                node.next=temp.next;
                temp.next=node;
                return;
            }}
            else{
                if(node.data>temp.data){
                    node.next=temp.next;
                    temp.next=node;
                }
            }
            temp=temp.next;
        }

    }


    public void display(){
        NodeSL temp=head;
        System.out.print("HEAD--->");
        while(temp!=null){
            System.out.print(temp.data+"--->");
            temp=temp.next;
        }
        System.out.print("TAIL");
    }


    public static void main(String[] args) {
        SortInsertion s= new SortInsertion();
        s.insert(10);
        s.insert(50);
        s.insert(20);
        s.insert(30);
        s.insert(15);
        s.insert(80);
        s.display();


    }
}
