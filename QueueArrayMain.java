public class QueueArrayMain {
    public static void main(String[] args) {
        QueueArray queue = new QueueArray(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        System.out.println();
        queue.display();
        System.out.println();
        queue.dequeue(10);
        queue.dequeue(20);
        queue.dequeue(30);
        queue.dequeue(40);
        queue.dequeue(50);
        queue.dequeue(60);
        queue.display();
        System.out.println();
    }
}
