public class QueueLinkedListShelterMain {
    public static void main(String[] args) {
        QueueLinkedListShelter shelter = new QueueLinkedListShelter();
        shelter.enqueue("dog", "Buddy");
        shelter.enqueue("cat", "Whiskers");
        shelter.enqueue("dog", "Rex");
        shelter.enqueue("cat", "Fluffy");
        shelter.enqueue("dog", "Max");
        shelter.enqueue("cat", "Mittens");
        shelter.enqueue("dog", "Jake");
        shelter.enqueue("cat", "Socks");
        shelter.enqueue("dog", "Bear");
        shelter.enqueue("cat", "Tiger");
        System.out.println();
        System.out.println("Animals in the shelter: ");
        System.out.println();
        shelter.display();
        System.out.println();
        shelter.dequeueAny();
        shelter.dequeueAny();
        shelter.dequeueCat();
        shelter.dequeueCat();
        shelter.dequeueCat();
        System.out.println();
        System.out.println("Animals in the shelter: ");
        shelter.display();
    }
}
