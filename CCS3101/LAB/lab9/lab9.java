public class lab9 {

    // generic class Pair<T>，used to hold a pair of values of type T
    public static class Pair<T> {
        private T first;
        private T second;

        public Pair(T first, T second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return first;
        }

        public T getSecond() {
            return second;
        }
    }

    // generic method getSmaller(Pair<T> pair)，
    // returns the smaller of the two values in the pair
    public static <T extends Comparable<T>> T getSmaller(Pair<T> pair) {
        if (pair.getFirst().compareTo(pair.getSecond()) <= 0) {
            return pair.getFirst();
        } else {
            return pair.getSecond();
        }
    }

    // main method to test the Pair class and getSmaller method
    // creates instances of Pair with Integer and Double types
        public static void main(String[] args) {
    // test the integer
        Pair<Integer> intPair = new Pair<>(10, 5);
        System.out.println("Smaller Integer: " + getSmaller(intPair));
    // test the double
        Pair<Double> doublePair = new Pair<>(3.14, 6.28);
        System.out.println("Smaller Double: " + getSmaller(doublePair));
    }
}