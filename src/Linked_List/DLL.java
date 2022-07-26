package Linked_List;

public class DLL {

    Node head;
    Node tail;
    int size;

    DLL() {
        size = 0;
    }

    private static class Node {
        int value;
        Node previous;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    void insertFirst(int value) {
        Node temp = new Node(value);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head.previous = temp;
            head = temp;
        }
        size++;

    }

    void insetEnd(int value) {
        if (size == 0) {
            insertFirst(value);
        }
        Node node = new Node(value);
        tail.next = node;
        node.previous = tail;
        tail = node;
        size++;
    }

    void displayreverse() {
        Node temp = tail;
        while (true) {
            System.out.print(temp.value + " ->");
            if (temp.previous == null) {

                break;
            }
            temp = temp.previous;
        }
        System.out.println("Start");

    }

    void display() {
        Node temp = head;
        while (true) {
            System.out.print(temp.value + " ->");
            if (temp.next == null) {

                break;
            }
            temp = temp.next;
        }
        System.out.println("End");

    }
}
