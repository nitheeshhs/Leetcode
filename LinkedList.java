public class LinkedList {
    protected int val;
    protected LinkedList next;
    protected static LinkedList head;

    LinkedList() {}

    LinkedList(int val) {
        this.val = val;
    }

    LinkedList(int val, LinkedList next) {
        this.val = val;
        this.next = next;
    }

    public static void add(int value) {
        LinkedList node = new LinkedList(value);
        if (head == null) {
            head = node;
        } else {
            LinkedList ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = node;
        }
    }

    public static void print() {
        if (head == null) {
            System.out.println("Linked list is empty");
        } else {
            LinkedList ptr = head;
            while (ptr != null) {
                System.out.println(ptr.val);
                ptr = ptr.next;
            }
        }
    }

}
