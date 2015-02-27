package intcoll4;
public class IntColl4 {

    private int howmany;
    private ListNode c;

        private class ListNode { // Inner class ListNode

        private int info;
        private ListNode link;

        public ListNode() { // Default constructor for new ListNodes
            info = 0;
            link = null;
            }
        }

    public IntColl4() { // Default constructor that starts counter at 0 and list is null
        howmany = 0;
        c = null;
    }

    public IntColl4(int i) { // Constructor used when i is specified
        howmany = 0;
        c = null;
    }

    public void insert(int i) { // Inserts a value in beginning of collection if it is not currently there
        if (i > 0) {
            ListNode p = c;
            while ((p != null) && (p.info != i)) {
                p = p.link;
            }

            if (p == null) {
                howmany++;
                p = new ListNode();
                p.info = i;
                p.link = c;
                c = p;
            }

        }
    }

    public void print() { // Prints the values in the collection
        ListNode p = c;
        while (p != null) {
            System.out.println(p.info);
            p = p.link;
        }
    }

    public void copy(IntColl4 obj) { // Copies the values of 1 collection into a new one
            howmany = obj.howmany;
            ListNode q = obj.c;
            ListNode p = new ListNode();
                                  
            if (obj.c == null) { //replace obj.c with q? same thing
                c = null;
            }
            else if (q.link == null)
            {
                p.info = q.info;
                c=p;      
            } else {
                c=p;
               while (q.link!=null){                   
                        p.info = q.info;
                        q = q.link;
                        p.link = new ListNode();
                        p = p.link;
                        p.info = q.info;                                                                       
                        }             
                    }       
                }
       
    
    public void omit(int i) { // Checks the collection for a value. If the value is in the collection, omit it by removing it.
        if (i > 0) {
            ListNode p = c;
            ListNode pred = null;
            while ((p != null) && (p.info != i)) {
                pred = p;
                p = p.link;
            }
            if (p != null) { // if p!= null then p.info = i
                howmany--;
                if (pred != null) {
                    pred.link = p.link;
                } else {
                    c = p.link;
                }
            }
        }
    }
 
    public boolean belongs(int i) { // Tests to to see if i is in the collection. Returns the result
        boolean result = true;
        if (i > 0) {
            ListNode p = c;

            while ((p != null) && (p.info != i)) {
                p = p.link;
                result = (p != null);
            }
                        
        }
        return (result);
    }

    public boolean equals(IntColl4 obj) { // Tests if 2 collections have the same value. Returns the result
        boolean result = (howmany == obj.howmany);
        ListNode p=c;
        
        while ((p != null) && (result)) {
            result = obj.belongs(p.info);
            p = p.link;
        }
        
        return result;
    }

}
