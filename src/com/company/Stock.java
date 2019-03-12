package com.company;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Stock implements Iterable {
    ArrayList<String> warehouse;
    LinkedList<String> warehouse2;

    Stock(ArrayList<String> stock) {
        this.warehouse = stock;
    }

    Stock(LinkedList<String> stock) {
        this.warehouse2 = stock;
    }



    public static void main(String[] args) {
        ArrayList<String> ArrayList = new ArrayList<>();
        ArrayList.add("Green");
        ArrayList.add("Red");
        ArrayList.add("Black");
        for (String stock : ArrayList) {
            System.out.println(stock + "->ArrayList");
        }

        LinkedList<String> LinkedList = new LinkedList<>();
        LinkedList.add("Green2");
        LinkedList.add("Red2");
        LinkedList.add("Black2");
        for (String stock : LinkedList) {
            System.out.println(stock + "->LinkedList");
        }

    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
//