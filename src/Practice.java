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
        
        System.out.println("Original list");
        printList(coolNode);
        System.out.println("\nList with 't' removed");
        ListNode listWithAnotherNodeRemoved = removeAt(coolNode, 2);
        printList(listWithAnotherNodeRemoved);
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

    public static ListNode removeAt(ListNode head, int removeIndex) {
        int ind = 0;
        ListNode current = head;
        ListNode previous = null;

        while (current != null) {
            if (ind == removeIndex) {
                if (previous == null) { //Removing the first element? Just return the second element as the new head
                    return head.next;
                }
                previous.next = current.next; //Point the previous element to the next element, skipping this one
                return head; //Head was not modified
            }
            previous = current;
            current = current.next;
            ind++;
        }
        return head; //Head was not modified
    }
}
