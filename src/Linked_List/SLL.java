package Linked_List;

public class SLL {
    Node head;
    Node tail;
    int size;
    SLL(){
        size=0;

    }
static class  Node {
int value;
Node next;
Node(int value){
    this.value=value;
}
    Node(int value,Node next){
        this.value=value;
        this.next= next;
    }

}
void insertFirst(int value){
        Node temp= new Node(value);
        if(head==null){
    head=temp;
    tail=temp;
        }
        else{
            temp.next=head;
            head=temp;
        }

}

void display(){
        Node temp= head;
        while(temp!=null){
            System.out.println(temp.value);
            temp= temp.next;
        }
}
}
