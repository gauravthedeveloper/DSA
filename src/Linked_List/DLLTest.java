package Linked_List;

public class DLLTest {
    public static void main(String[] args) {
        DLL dl = new DLL();
        dl.insertFirst(3);
        dl.insertFirst(45);
        dl.insertFirst(9);
        dl.insertFirst(7);
        dl.insertFirst(9);
        dl.insertFirst(0);
        dl.insertFirst(4);
        dl.insertFirst(12);
        dl.insertFirst(13);
        dl.insetEnd(44);
        dl.insetEnd(49);
        dl.insetEnd(412);

        dl.display();
        dl.displayReverse();
    }
}
