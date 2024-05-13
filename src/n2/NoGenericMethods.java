package n2;

final class NoGenericMethods<T> {

    private final T first;
    private final T second;
    private final T third;

    NoGenericMethods(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    T getFirst() {
        return first;
    }

    T getThird() {
        return third;
    }

    T getSecond() {
        return second;
    }

}
