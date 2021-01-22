package implementations.queue;

public class QueueExample
{
    public static void main(String[] args)
    {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println(queue.toString());

        System.out.println(queue.dequeue().value());
        System.out.println(queue.dequeue().value());
        System.out.println(queue.dequeue().value());
        System.out.println(queue.dequeue().value());

        System.out.println(queue.toString());
    }
}
