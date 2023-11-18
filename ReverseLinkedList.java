public class ReverseLinkedList {

    public static void reverseList(LinkedList head) {
        LinkedList prev = null;
        LinkedList current = head;
        while(current != null){
            LinkedList temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        while (prev != null){
            System.out.println(prev.val);
            prev = prev.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList.add(4);
        LinkedList.add(5);
        LinkedList.add(1);
        LinkedList.add(3);

        System.out.println("Original list:");
        LinkedList.print();

        System.out.println("Reversed list:");
        reverseList(LinkedList.head);
    }


}
