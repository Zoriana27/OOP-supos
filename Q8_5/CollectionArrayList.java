package Q8_5;

import java.util.AbstractList;

public class CollectionArrayList<E> extends AbstractList<E> {
    private Object[] array; //using Object because of type erasure
    private int size;
    public CollectionArrayList() {
        array = new Object[10];
        size = 0;
    }
    @Override
    public int size() {
        return size;
    }
    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        else{
            return (E) array[index]; //casting the item of type Object back to type E
        }
    }
    @Override
    public E set(int index, E element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        else{
            E oldElement =  (E) array[index];
            array[index] = element;
            return oldElement;

        }
    }
    @Override
    public void add(int index, E element) {
        if(size < array.length){
            if (index < 0 || index > size) {
                throw new IndexOutOfBoundsException();
            }
            else{
                for (int i = size; i > index; i--) {
                    array[i] = array[i - 1];
                }
                array[index] = element;
                size++;
            }
        }

    }
}
