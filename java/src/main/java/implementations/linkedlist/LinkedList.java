// @author ArmeetJatyani
// Linked List implementation

package implementations.linkedlist;

public class LinkedList
{
    private LinkedListNode head;

    /**
     * default constructor
     */
    public LinkedList()
    {
        head = null;
    }

    /**
     * constructor with first value
     * @param value
     */
    public LinkedList(int value)
    {
        // create first node
        head = new LinkedListNode(value, null);
    }

    /**
     * get head of Linked List
     * @return
     */
    public LinkedListNode head()
    {
        return this.head;
    }

    /**
     * traverse and get tail of linked list
     * @return
     */
    public LinkedListNode tail()
    {
        LinkedListNode current = head;
        if(current == null) return null;

        while (current.getNext() != null)
        {
            current = current.getNext();
        }

        return current;
    }

    /**
     * add new element (node) to linked list
     * @param value
     */
    public void add(int value)
    {
        LinkedListNode tail = tail();
        if (tail == null)
        {
            head = new LinkedListNode(value, null);
            return;
        }

        tail.setNext(new LinkedListNode(value, null));
    }

    /**
     * push (add to head of linkedlist)
     * @return
     */
    public void push(int value)
    {
        LinkedListNode newHead = new LinkedListNode(value, head);
        head = newHead;
    }

    /**
     * pop (remove head of linkedlist)
     * @return
     */
    public int pop()
    {
        LinkedListNode popped = head;
        head = head.getNext();
        return popped.getValue();
    }

    /**
     * to String
     * @return
     */
    @Override
    public String toString()
    {
        String list = "[";
        LinkedListNode current = head;
        if(current == null) return null;

        do
        {
            list += Integer.toString(current.getValue()) + ", ";
            current = current.getNext();
        }
        while (current != null);

        list = list.substring(0, list.length() - 2);
        return list + "]";
    }

}
