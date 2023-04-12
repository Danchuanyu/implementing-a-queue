public class QueueTest {
    public static void main(String[] args) {
        SinglyLinkedListQueue<Integer> queue = new SinglyLinkedListQueue<>();

        // Enqueue tests
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assert queue.size() == 3 : "Enqueue failed";
        assert queue.dequeue() == 1 : "Enqueue failed";
        assert queue.size() == 2 : "Enqueue failed";

        // Dequeue tests
        assert queue.dequeue() == 2 : "Dequeue failed";
        assert queue.dequeue() == 3 : "Dequeue failed";
        assert queue.dequeue() == null : "Dequeue failed";
        assert queue.size() == 0 : "Dequeue failed";
        assert queue.isEmpty() : "isEmpty failed";
    }
}