
import java.util.Iterator;
import java.util.NoSuchElementException;
public class CircularArray<T> implements Iterable<T> {
    private T[]arr;
    private int start;
    private int size;

    @SuppressWarnings("unchecked")
    public CircularArray(int size) {
        arr = (T[])new Object[size];
        start = 0;
        this.size = 0;
    }
    private int convert(int index) {
        if(index <0 || index>=size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        return (start + index) % arr.length;
    }

    public void add(T element) {
        if(size == arr.length) {
            throw new IllegalStateException("Array is full");
        }
        arr[convert(size)] = element;
        size++;
    }

    public T get(int index) {
        return arr[convert(index)];
    }

    public void set(int index, T element) {
        arr[convert(index)] = element;
    }

    public void rotate(int steps) {
        start = (start + steps) % arr.length;
        if(start <0) {
            start +=arr.length;
        }
    }

    public int size() {
        return size;
    }

    
    @Override
    public Iterator<T> iterator() {
        return new CircularArrayIterator();
    }
    private class CircularArrayIterator implements  Iterator<T> {
        private int current = 0;

        @Override
        public boolean hasNext() {
            return current < size;
        }

        @Override
        public T next() {
            if(!hasNext()) {
                throw new NoSuchElementException();
            }
            T item = get(current);
            current++;
            return item;
        }
    }
}
