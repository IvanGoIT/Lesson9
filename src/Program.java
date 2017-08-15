import generic.GenericArray;
import generic.GenericChild;
import linkedList.MyLinkedList;

import java.util.*;

public class Program {

    // ресайз массива (+1 элемент)
    static int[] addElement(int[] array) {
        int[] arrayBigger = new int[array.length + 1];
        System.arraycopy(array, 0, arrayBigger, 0, array.length);
        return arrayBigger;
    }

    static void printCollection(Collection collection) {
        for(Object element : collection) {
            System.out.print("" + element + " ");
        }
        System.out.println();
    }

    // ArrayList example
    static void arrayListExample() {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            integerArrayList.add(i + 1);
        }
        printCollection(integerArrayList);

        ArrayList<String> stringArrayList = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            stringArrayList.add("s:" + i + 1);
        }
        printCollection(stringArrayList);
    }

    static void linkedListExample() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("str");

        MyLinkedList<String> myLinkedList = new MyLinkedList<>(new String[]{"s1", "s2", "s3"});
        myLinkedList.show();
    }

    static void stackAndQueueExample() {
        Stack<String> stringStack = new Stack<>();
        stringStack.push("1");
        stringStack.push("2");
        stringStack.push("3");
        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());

        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("1");
        queue.add("2");
        queue.add("3");
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }

    static void setExample() {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(0);
        set.add(2);
        set.add(0);
        printCollection(set);
    }

    static void mapExample() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Коля", 20);
        map.put("Вася", 25);
        map.put("Маша", 19);
        map.put("Коля", 30);    // перезапись
        map.put("Коля", 0);     // перезапись
        map.put("Коля", 1000);  // перезапись
        map.put("Коля", -500);  // перезапись

        for(String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }

    public static void main(String[] args) {
        // примеры дженериков
        GenericArray<String, String> genericArray = new GenericArray<>("strstrstr");
        GenericChild genericChild = new GenericChild(10);

        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<String> array2 = new ArrayList<>();


        // коллекции
        // arrayListExample();
        // linkedListExample();
        // stackAndQueueExample();
        // setExample();
        mapExample();
    }
}
