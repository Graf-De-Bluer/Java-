public class Main {
    public static void main(String[] args) {
        Tuple<String> tuple = new Tuple<>();
        tuple.add("apple");
        tuple.add("banana");
        tuple.add("cherry");

        System.out.println("Tuple: " + tuple);

        tuple.remove("banana");
        System.out.println("After removal: " + tuple);

        System.out.println("Contains 'apple': " + tuple.contains("apple"));
        System.out.println("Element at index 1: " + tuple.get(1));
        System.out.println("Tuple size: " + tuple.size());
        boolean removed = tuple.remove("banana");
        System.out.println("Banana removed: " + removed);

    }
}
