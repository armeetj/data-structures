/**
 * @author TrashToggled
 * Queue
 * Extends LinkedList, adds queue specific methods, deprecates linkedlist specific methods
 */
package implementations.queue;

import implementations.linkedlist.LinkedList;
import implementations.linkedlist.LinkedListNode;

public class Queue extends LinkedList
{
    public Queue()
    {
        super();
    }

    public Queue(int value)
    {
        super(value);
    }

    @Deprecated
    @Override
    public void add(int value)
    {
        return;
    }

    /**
     * enqueue
     * @param value
     */
    @Deprecated
    @Override
    public void push(int value)
    {
        enqueue(value);
    }

    /**
     * dequeue
     * @return
     */
    @Deprecated
    @Override
    public LinkedListNode pop()
    {

        return dequeue();
    }

    /**
     * enqueue (enter line)
     * @param value
     */
    public void enqueue(int value)
    {
        super.push(value);
    }

    /**
     * dequeue (leave line)
     * @return
     */
    public LinkedListNode dequeue()
    {
        LinkedListNode p1 = head();
        LinkedListNode p2 = head().next();

        if(p2 == null)
        {
            p2 = p1;
            super.setHead(null);
            return p2;
        }

        while (p2.next() != null)
        {
            p1 = p1.next();
            p2 = p2.next();
        }

        p1.setNext(null);
        return p2;
    }
}
