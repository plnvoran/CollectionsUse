package ru.plnvoran;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

    private Set<String> list;
    public SetTest() {

        this.list = new HashSet<>();
    }

    public void add(String elem) {
        list.add(elem);
    }

    public int search(String elem) {
        Iterator<String> iterator = list.iterator();
        String m;
        while (iterator.hasNext()) {
            m = iterator.next();
            if (m.equals(elem)) {
                System.out.println("The element - " + elem + " is found");
                return 1;
            }

        }
        System.out.println("The element " + elem +" is not found");
        return -1;
    }

    public void delete(String elem) {
        System.out.println("We are trying to delete the element - " + elem);
        if (search (elem)>0)
        {
            list.remove(elem);
            System.out.println("The element " + elem +" is removed");
        }

    }

    public void print () {
        System.out.println("The elements:");
        System.out.println(list);

    }


}



