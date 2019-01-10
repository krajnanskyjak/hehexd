package singleton;

import java.util.LinkedList;

public class SingletonLinkedList {
    private static LinkedList<Integer> list = new LinkedList<Integer>();
    private SingletonLinkedList() {

    }

    public static LinkedList<Integer> getList() {
        return list;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = SingletonLinkedList.getList();
        list.add(5);
        list.add(6);
        list.add(7);
        list.addFirst(4);

        System.out.println(SingletonLinkedList.getList());
    }
}
