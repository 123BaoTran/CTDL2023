package Lab06.task2;

public class Task2 {
    public class Node<E> {
        // Generic 
        private E data;
        private Node<E> next;

        public Node(E data) { 
            this.data = data;
}
public Node(E data, Node<E> next) { 
    this.data = data;
    this.next = next; 
}
//...
}
}
