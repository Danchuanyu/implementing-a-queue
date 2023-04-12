public class SinglyLinkedListQueue<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    private static class Node<T> {
        private T data;
        private Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public SinglyLinkedListQueue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public T dequeue() {
        if (head == null) {
            return null;
        }
        T data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

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
