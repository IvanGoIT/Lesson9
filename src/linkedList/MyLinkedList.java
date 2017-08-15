package linkedList;

public class MyLinkedList<T> {
    Node<T> first;
    Node<T> last;

    public MyLinkedList(T[] items) {
        first = new Node<T>(items[0], null, null);
        last = first;

        for(int i = 1; i < items.length; i++){
            add(items[i]);
        }
    }

    public void add(T item) {
        Node<T> node = new Node<>(item, null, last);
        last.next = node;
        last = node;
    }

    public void show() {
        Node<T> iterator = first;
        if (iterator == null) return;

        do {
            System.out.print("" + iterator.item + " ");
            iterator = iterator.next;
        } while (iterator != null);
        System.out.println();
    }
}
