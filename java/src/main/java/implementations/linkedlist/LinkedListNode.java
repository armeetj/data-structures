package implementations.linkedlist;

import implementations.Node;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class LinkedListNode extends Node
{
    private UUID next;

    public LinkedListNode(int value, UUID next)
    {
        super(value);
        this.next = next;
    }
}
