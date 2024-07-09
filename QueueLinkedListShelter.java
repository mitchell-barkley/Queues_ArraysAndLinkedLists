// An animal shelter, which holds only dogs and cats, operates on a strictly
// "first in, first out" basis. People must adopt either the "oldest" (based on arrival time) of
// all animals at the shelter, or they can select whether they would
// prefer a dog or a cat (and will receive the oldest animal of that type).
// They cannot select which specific animal they would like.
// Create the data structures to maintain this system and implement
// operations such as enqueue, dequeueAny, dequeueDog, and dequeueCat.

public class QueueLinkedListShelter {
    private class Node {
        private String type;
        private String name;
        private Node next;

        public Node(String type, String name) {
            this.type = type;
            this.name = name;
            this.next = null;
        }
    }
    private Node front;
    private Node back;
    private int nItems;
    private int nDogs;
    private int nCats;
    private int nAnimals;
    private String type;

    public QueueLinkedListShelter() {
        this.front = null;
        this.back = null;
        this.nItems = 0;
        this.nDogs = 0;
        this.nCats = 0;
        this.nAnimals = 0;
        this.type = "";
    }

    public boolean isEmpty() {
        if (nItems == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (nItems >= 15) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(String type, String name) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            Node newNode = new Node(type, name);
            if (isEmpty()) {
                front = newNode;
            } else {
                back.next = newNode;
            }
            back = newNode;
            nItems++;
            if (type.equals("dog")) {
                nDogs++;
            } else {
                nCats++;
            }
            nAnimals++;
            System.out.println("Enqueued: " + name);
        }
    }

    public void dequeueAny() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            String name = front.name;
            type = front.type;
            front = front.next;
            nItems--;
            if (type.equals("dog")) {
                nDogs--;
            } else {
                nCats--;
            }
            nAnimals--;
            System.out.println("Dequeued: " + name);
        }
    }

    public void dequeueDog() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            Node current = front;
            Node previous = front;
            while (current != null) {
                if (current.type.equals("dog")) {
                    break;
                }
                previous = current;
                current = current.next;
            }
            if (current == null) {
                System.out.println("No dogs in the shelter");
            } else {
                String name = current.name;
                type = current.type;
                if (current == front) {
                    front = front.next;
                } else {
                    previous.next = current.next;
                }
                nItems--;
                nDogs--;
                nAnimals--;
                System.out.println("Dequeued: " + name);
            }
        }
    }

    public void dequeueCat() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            Node current = front;
            Node previous = front;
            while (current != null) {
                if (current.type.equals("cat")) {
                    break;
                }
                previous = current;
                current = current.next;
            }
            if (current == null) {
                System.out.println("No cats in the shelter");
            } else {
                String name = current.name;
                type = current.type;
                if (current == front) {
                    front = front.next;
                } else {
                    previous.next = current.next;
                }
                nItems--;
                nCats--;
                nAnimals--;
                System.out.println("Dequeued: " + name);
            }
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            Node current = front;
            while (current != null) {
                String space = " ";
                for (int i = 0; i < 15 - current.name.length(); i++) {
                    space += " ";
                }
                System.out.println("Name: " + current.name + space + " Type: " + current.type);
                current = current.next;
            }
        }
    }
}
