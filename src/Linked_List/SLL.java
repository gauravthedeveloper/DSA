package Linked_List;

public class SLL {
    Node head;
    Node tail;
    int size;

    SLL() {
        size = 0;

    }

    private static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

//        Node(int value, Node next) {
//            this.value = value;
//            this.next = next;
//        }

    }

    void insertFirst(int value) {
        Node temp = new Node(value);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++;

    }


  Node insertatindexREC(int index,int  value,Node next) {
        if (index==0){
            Node node = new Node(value);
            node.next=next;
            return node;
        }

        //next.next= insertatindexREC(index--,value,next.next);
        return next;
    }

    void insertEnd(int value) {
        if (size == 0) {
            insertFirst(value);
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    void display() {
        Node temp = head;
        while (true) {
            System.out.print(temp.value + " ->");
            if (temp.next == null) break;
            temp = temp.next;
        }
        System.out.println("End");

    }

    void reverseList() {
        Node previous, current, next;
        current = next = head;
        previous = null;
        tail = head;
        while (next != null) {

            next = next.next;
            current.next = previous;
            previous = current;
            current = next;
            if (next == null) break;

        }

        head = previous;


    }
}
