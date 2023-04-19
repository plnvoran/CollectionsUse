package ru.plnvoran;

import java.util.ArrayList;

public class ListTest {
    ArrayList<String> list = new ArrayList<>();

    public void add(String elem) {
        list.add(elem);
    }

    public void delete(String elem) {
        int index;
        System.out.println("We are trying to delete the element - " + elem);
        index = search (elem);
        if (index!=-1)
        {
            list.remove(index);
            System.out.println("The element " + elem +" is removed");
        }

    }

    public int search(String elem) {
        int i=0;
        do {
            if (list.get(i).equals(elem)) {
                System.out.println("The element " + elem +" is found");
                return i;
            }
            i++;
             } while (i < list.size());

        System.out.println("The element " + elem +" is not found");
        return -1;}

    public void print () {
        System.out.println("The elements:");
        System.out.println(list);

    }
}



