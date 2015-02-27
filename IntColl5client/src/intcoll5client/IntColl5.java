package intcoll5client;

import java.util.LinkedList;
import java.util.ListIterator;

public class IntColl5 {

    private LinkedList<Integer> c;

    public IntColl5() // Default constructor
    {
        c = new LinkedList<Integer>();
    }

    public IntColl5(int i) // Constructor with specified number of integers
    {
        c = new LinkedList<Integer>();
    }

    public void insert(int i) {
        if (!c.contains(i)) {
            c.addFirst(i);
        }
    }

    public void copy(IntColl5 obj) // Creates new batch of integers and copies the values
    {
        ListIterator<Integer> Obj = obj.c.listIterator();
        c = new LinkedList<Integer>();
        while (Obj.hasNext()) {
            Integer m = Obj.next();
            c.add(m);
        }
    }

    public boolean belongs(int i) // Tests to see if the int is in the collection. Returns the result
    {
        return c.contains(i);
    }

    public void omit(int i) // Checks the collection for a value. If the value is in the collection, omit it by making it false.
    {
        ListIterator<Integer> iter = c.listIterator();
        while (iter.hasNext()) {
            Integer m = iter.next();
            if (m == i) {
                iter.remove();
            }
        }
    }

    public int get_howmany() // Returns the number of values in the collection
    {
        return c.size();
    }

    public void print() // Prints the values left in the collection
    {
        ListIterator<Integer> number = c.listIterator();
        while (number.hasNext()) {
            Integer m = number.next();
            System.out.println(m);
        }

    }

    public boolean equals(IntColl5 obj) // Tests if 2 collections have the same value. Returns the result.
    {
        ListIterator<Integer> P = c.listIterator();
        ListIterator<Integer> N = obj.c.listIterator();

        boolean result = (c.size() == obj.c.size());

            while ((P.hasNext()) && (N.hasNext()) && (result)) {
                Integer pos = P.next();
                Integer neg = N.next();
                result = (obj.belongs(pos.intValue()) && this.belongs(neg.intValue()));
            }
            return result;
        }
    }