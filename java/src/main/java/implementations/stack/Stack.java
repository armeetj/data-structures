// @author ArmeetJatyani
// Stack
// Stacks extend LinkedLists, which already have a dedicated push and pop method
package implementations.stack;

import implementations.linkedlist.LinkedList;
import implementations.linkedlist.LinkedListNode;

public class Stack extends LinkedList
{
    public Stack()
    {
        super();
    }

    public Stack(int value)
    {
        super(value);
    }

    // mark linked list specific methods as deprecated
    @Deprecated
    @Override
    public LinkedListNode head()
    {
        return null;
    }

    @Deprecated
    @Override
    public LinkedListNode tail()
    {
        return null;
    }

    @Deprecated
    @Override
    public void add(int value)
    {
        return;
    }
}
