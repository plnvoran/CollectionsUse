package ru.plnvoran;

import java.util.*;

public class QueueTest {


    Deque<String> list ;

    public QueueTest() {

        this.list=    new ArrayDeque<>();
    }

    public void add(String elem) {
        list.add(elem);
    }
    public int search(String elem) {
        int i = 0;
        for(String t : list) {
            if (t.equals(elem)) {
                i++;
                System.out.println("The element - " + elem + " is found");
                return i;
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



