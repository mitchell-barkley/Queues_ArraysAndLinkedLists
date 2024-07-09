public class QueueArray {
    private int [] array;
    private int front;
    private int back;
    private int nItems;

    public QueueArray(int size) {
        this.array = new int[size];
        this.front = -1;
        this.back = -1;
        this.nItems = 0;
        System.out.println("Queue created with size: " + size);
    }

    public boolean isFull() {
        if (back == array.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (nItems == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return -1;
        } else {
            if (back == array.length - 1) {
                back = 0;
            } else {
                back++;
            }
            array[back] = value;
            nItems++;
            System.out.println("Enqueued: " + value);
            return value;
        }
    }

    public void dequeue (int value) {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            if (front == array.length - 1) {
                front = 0;
            } else {
                front++;
            }
            nItems--;
            System.out.println("Dequeued: " + value);
        }
    }

    public void peekFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front: " + array[front]);
        }
    }

    public void peekBack() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Back: " + array[back]);
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            for (int i = 0; i < array.length; i++) {
                System.out.println("Queue[" + i + "]: " + array[i]);
            }
        }
    }
}