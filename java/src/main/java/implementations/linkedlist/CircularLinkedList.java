package implementations.linkedlist;

public class CircularLinkedList extends LinkedList
{
    private CircularLinkedListNode head;

    /**
     * default constructor
     */
    public CircularLinkedList()
    {
        head = null;
    }

    /**
     * constructor with first value
     * @param value
     */
    public CircularLinkedList(int value)
    {
        // create first node
        head = new CircularLinkedListNode(head, value, null);
        head.setNext(head);
    }
}
