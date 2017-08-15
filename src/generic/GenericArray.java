package generic;

public class GenericArray<T, K> {
    K t;
    T[] array;

    public GenericArray(K t) {
        this.t = t;
    }

    public K getT() {
        return t;
    }

    public T[] getArray() {
        return array;
    }
}
