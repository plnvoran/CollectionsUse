package ru.plnvoran;

public class Main {
    public static void main(String[] args) {
        System.out.println("The List test - The Do-While loop test ");
        ListTest cats = new ListTest();

        cats.add("Siamese");
        cats.add("Chesher");
        cats.add("Siberian");
        cats.add("British");
        cats.add("Scottish");
        cats.print();

        cats.search("British");

        cats.delete("British");
        cats.print();

        System.out.println("The Map test - The For loop test ");
        MapTest dogs = new MapTest();

        dogs.add("boxer");
        dogs.add("spaniel");
        dogs.add("shepherd");
        dogs.add("dachshund");
        dogs.print();

        dogs.search("spaniel");

        dogs.delete("spaniel");
        dogs.print();

        System.out.println("The Set test - The While loop test ");
        SetTest months = new SetTest();

        months.add("Jan");
        months.add("Feb");
        months.add("March");
        months.add("April");
        months.print();

        months.search("Feb");

        months.delete("Feb");
        months.print();


        System.out.println("The Queue test - The For-Each loop test");

        QueueTest names = new QueueTest();

        names.add("Andrew");
        names.add("Feb");
        names.add("John");
        names.add("Rob");
       names.print();

       names.search("Feb");

        names.delete("Feb");
        names.print();

    }
}