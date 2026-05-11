public class Practice {
    public static void main(String[] args) {
        ListNode myNode = new ListNode();
        myNode.data = 'x';
        
        ListNode anotherNode = new ListNode();
        anotherNode.data = 't';

        myNode.next = anotherNode;

        ListNode moreNode = new ListNode();
        moreNode.data = 'r';

        anotherNode.next = moreNode;

        ListNode coolNode = new ListNode();
        coolNode.data = 'w';
        coolNode.next = myNode;

        ListNode extra = moreNode;
        moreNode.data = 'e';

        ListNode hello = new ListNode();
        hello.data = 'x';
        extra.next = hello;
        
        printList(coolNode);
        System.out.println(countX(coolNode));
    }

    public static void printList(ListNode head) {
        ListNode current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    // Count how many nodes hold an x
    public static int countX(ListNode head) {
        ListNode current = head;
        int xCount = 0;

        while (current != null) { 
            if (current.data == 'x') {
                xCount++;
            }
            current = current.next;
        }

        return xCount;
    }
}
