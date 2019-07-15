package com.tws.refactoring.extract_method;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class OwingPrinter {
    private static final String BANNER = "*****************************\r\n****** Customer totals ******\r\n*****************************";

    void printOwing(String name, List<Order> orders) {
        Iterator<Order> elements = orders.iterator();
        double outstanding = 0.0;

        // calculate owing
        outstanding = getOutstanding(elements, outstanding);

        // print details
        System.out.println(BANNER+"\r\nname: " + name+"\r\namount: " + outstanding);
    }

    private double getOutstanding(Iterator<Order> elements, double outstanding) {
        while (elements.hasNext()) {
            Order each = elements.next();
            outstanding += each.getAmount();
        }
        return outstanding;
    }
}

class Order {
    private final double amount;

    public Order(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
