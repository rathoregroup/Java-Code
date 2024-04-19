package LinkedList;

public class Problems {
    static ListNode head;
    static ListNode tail;

    public void insertFirst(int val){
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;

        if (tail == null){
            tail = head;
        }
    }

    public void display(){
        ListNode temp = head;
        while (temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public ListNode swapPairs(ListNode head) {
        // base case
        if (head == null || head.next == null){
            return head;
        }
        // smaller problem
        ListNode ans = swapPairs(head.next);
        // small calculation
        ListNode x = head.next;
        x.next = head;
        head.next = null;

        return ans;
    }
    static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Problems node = new Problems();
        node.insertFirst(7);
        node.insertFirst(6);
        node.insertFirst(5);
        node.insertFirst(4);
        node.insertFirst(3);
        node.insertFirst(2);
        node.insertFirst(1);

//        node.swapPairs(head);
        node.display();
    }
}
