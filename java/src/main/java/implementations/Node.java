package implementations;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Node
{
    private UUID ID;
    private int value;

    public Node(int value)
    {
        this.ID = UUID.randomUUID();
        this.value = value;
    }

    public int value()
    {
        return this.value;
    }
}
