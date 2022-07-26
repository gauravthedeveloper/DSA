package Linked_List;

public class SLLTest {
    public static void main(String[] args) {
        SLL sll = new SLL();
        sll.insertFirst(5);

        sll.insertFirst(6);
        sll.insertFirst(7);
        sll.insertFirst(10);
        sll.insertFirst(96);
        sll.insertFirst(4);
        sll.insertEnd(5);
        sll.insertEnd(55);
        sll.insertEnd(9);
        sll.insertEnd(17);
        sll.insertEnd(34);
        sll.insertEnd(977);

        sll.display();
        sll.display();

        sll.reverseList();
        sll.display();

    }
}
