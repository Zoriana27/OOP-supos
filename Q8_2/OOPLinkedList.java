package Q8_2;

public class OOPLinkedList<T> implements OOPList<T> {
    //generic element class
    private static class Node<T> {
        private T data;
        private Node<T> next;
        public Node(T data) {this.data = data;}


    }
    private Node<T> head;
    private int size;
    @Override
    public void addItem(T item){
        if (head == null){
            head = new Node<>(item);
            size++;
            return;
        }
        Node<T> current = head;
        while (current.next != null){
            current = current.next;

        }
        current.next = new Node<>(item);
        size++;

    }
    @Override
    public T getItemAt(int index){
        Node<T> current = head;
        if (index > 0 || index < size){

            for (int i = 0; i < index; i++){
                current = current.next;
            }

        }
        return current.data;

    }
    @Override
    public T removeHead(){
        T data  = head.data;
        head = head.next;
        size--;
        return data;
    }
    @Override
    public int size(){
        return size;
    }
    @Override
    public boolean isEmpty(){
        return size == 0;
    }



}
