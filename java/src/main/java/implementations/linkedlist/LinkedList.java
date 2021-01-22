// @author ArmeetJatyani
// Linked List implementation

package implementations.linkedlist;

public class LinkedList
{
    private LinkedListNode firstNode;

    /**
     * default constructor
     */
    public LinkedList()
    {
        firstNode = null;
    }

    /**
     * constructor with first value
     * @param value
     */
    public LinkedList(int value)
    {
        // create first node
        firstNode = new LinkedListNode(value, null);
    }



}
