package Q8_2;

public interface OOPList<T> {
    void addItem(T item);
    T removeHead();
    T getItemAt(int index);

    int size();
    boolean isEmpty();


}
