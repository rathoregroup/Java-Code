package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(1);
        list.insertFirst(9);
        list.insertFirst(5);
        list.insertFirst(3);
        list.display();
        list.insertRec(88, 2);
        list.display();


//        DLL list = new DLL();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.insertLast(99);
//        list.insert(8, 65);
//        list.display();


//        CLL list = new CLL();
//        list.insert(23);
//        list.insert(3);
//        list.insert(19);
//        list.insert(75);
//        list.display();

    }
}
