import java.util.ArrayList;
import java.util.List;

class Tuple<T> {
    private final List<T> elements;

    public Tuple() {
        this.elements = new ArrayList<>();
    }

    public void add(T element) {
        elements.add(element);
    }

    public boolean remove(T element) {
        return elements.remove(element);
    }

    public boolean contains(T element) {
        return elements.contains(element);
    }

    public T get(int index) {
        if (index < 0 || index >= elements.size()) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        return elements.get(index);
    }

    public int size() {
        return elements.size();
    }

    @Override
    public String toString() {
        return elements.toString();
    }
}

