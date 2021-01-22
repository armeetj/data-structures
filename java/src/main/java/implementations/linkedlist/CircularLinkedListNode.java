// @author ArmeetJatyani
// Circular linked list node
package implementations.linkedlist;

public class CircularLinkedListNode extends LinkedListNode
{
    private LinkedListNode head;

    public CircularLinkedListNode(LinkedListNode head, int value, LinkedListNode next)
    {
        super(value, next);
        this.head = head;
    }

    @Override
    public LinkedListNode getNext()
    {
        if(super.getNext() == null) return head;
        return super.getNext();
    }
}
