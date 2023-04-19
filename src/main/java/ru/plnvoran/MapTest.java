package ru.plnvoran;

import java.util.HashMap;

public class MapTest {
    private HashMap<Integer, String> list;
    private int index = 0;
    public MapTest() {
        this.index = 0;
        this.list=  new HashMap<>();
    }

    public void add(String elem) {
        list.put(index, elem);
        index++;
    }

    public int search(String elem) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(elem)) {
                System.out.println("The element - " + elem + " is  found");
                return i;
            }
        }
        System.out.println("The element " + elem +" is not found");
        return -1;
    }

    public void delete(String elem) {
        int index;
        System.out.println("We are trying to delete the element - " + elem);
        index = search (elem);
        if (index !=-1)
        {
            list.remove(index);
            System.out.println("The element " + elem +" is removed");
        }

    }
    public void print () {
        System.out.println("The elements:");
        System.out.println(list);

    }

}



