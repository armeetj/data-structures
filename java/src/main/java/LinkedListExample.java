/**
 * @author ArmeetJatyani
 * Testing linked list implementation
 * ./implementations/linkedlist/LinkedList
 */

import implementations.linkedlist.CircularLinkedList;
import implementations.linkedlist.LinkedList;

public class LinkedListExample
{
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.push(1);
        list.push(2);
        list.push(3);
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.toString());

        CircularLinkedList clist = new CircularLinkedList();
        clist.add(1);
        clist.add(2);
        clist.add(3);
        System.out.println(clist.head().next().next().next().value());
    }
}
