package stringcol;
import java.util.Scanner;

public class StringCol {

    private int howmany;
    private btNode c;
    
    public StringCol() { // Default constructor that starts counter at 0 and list is null
        howmany = 0;
        c = null;
    }

    public StringCol(String i) { // Constructor used when i is specified
        howmany = 0;
        c = null;
    }

    private static class btNode {

        String info;
        btNode left;
        btNode right;

        private btNode(String n, btNode lt, btNode rt) {
            info = n;
            left = lt;
            right = rt;
        }

        private btNode() {
            info = "EMPTY";
            left = null;
            right = null;
        }
    }

    public void insert(String i) { //inserts a value at the beginning of the collection
        btNode p = c, pred = null;
        while ((p != null) && (!p.info.equalsIgnoreCase(i))) //p.info.contentEquals?
        {
            pred = p;
            if (p.info.compareToIgnoreCase(i) > 0) {
                p = p.left;
            } else {
                p = p.right;
            }
        }

        if (p == null) {
            howmany++;
            p = new btNode(i, null, null);
            if (pred != null) {
                if (pred.info.compareToIgnoreCase(i) > 0) {
                    pred.left = p;
                } else {
                    pred.right = p;
                }
            } else {
                c = p;
            }
        }
    }

    public void omit(String i) { //checks the collection for an int. if the int is there, it is removed.
        btNode p = c, pred = null;
        while ((p != null) && (!p.info.equalsIgnoreCase(i))) {
            pred = p;
            if (p.info.compareToIgnoreCase(i) > 0) {
                p = p.left;
            } else {
                p = p.right;
            }

        }
        if (p != null) {
            howmany--;
            if ((p.left == null) && (p.right == null)) { 
                if (pred != null) {
                    if (pred.info.compareToIgnoreCase(i) > 0) {
                        pred.left = null;
                    } else {
                        pred.right = null;
                    }
                } else {
                    c = null;
                }
            } else if ((p.left == null) && (p.right != null)) { 
                if (pred != null) {
                    if (pred.info.compareToIgnoreCase(i) > 0) {
                        pred.left = p.right;
                    } else {
                        pred.right = p.right;
                    }
                } else {
                    c = p.right;
                }
            } else if ((p.left != null) && (p.right == null)) { 
                if (pred != null) {
                    if (pred.info.compareToIgnoreCase(i) > 0) {
                        pred.left = p.left;
                    } else {
                        pred.right = p.left;
                    }
                } else {
                    c = p.left;
                }
            } else { // When p.left and p.right != null 
                btNode m = p.left, mpred = p;
                while (m.right != null) { //if m.right = null then mpred = p
                    mpred = m;
                    m = m.right;
                }
                if (mpred != p) {
                    p.info = m.info; //changes number (info) in p to the new value
                    mpred.right = m.left;
                } else { // occurs when right subtree of left subtree = null (mpred=p)
                    p.info = m.info;
                    p.left = m.left;
                }

            }
        }
    }

    public boolean belongs(String i) { //tests an integer to see if it's in the collection, returns the result
        btNode p = c;
        while ((p != null) &&  (!p.info.equalsIgnoreCase(i))) {
            if (p.info.compareToIgnoreCase(i) > 0) {
                p = p.left;
            } else {
                p = p.right;
            }
        }
        return (p != null);
    }

    private static btNode copyTree(btNode t) {
        btNode root = null;
        if (t != null) {
            root = new btNode();
            root.info = t.info;
            root.left = copyTree(t.left);
            root.right = copyTree(t.right);
        }
        return root;
    }

    public void copy(StringCol obj) {
        if (this != obj) {
            howmany = obj.howmany;
            c = copyTree(obj.c);
        }
    }

    private static void printTree(btNode t) {
        if (t != null) {
            printTree(t.left);
            System.out.println("L: " + ((t.left == null) ? -1 : t.left.info) + " Info: " + t.info
                    + " R: " + ((t.right == null) ? -1 : t.right.info));
            printTree(t.right);
        }
    }

    public void print() {
        printTree(c);
    }

    public int get_howmany() {
        return howmany;
    }

    public boolean equals(StringCol obj) {
        boolean result = (howmany == obj.howmany);
        if (!result) {
            String[] a = new String[howmany];
            toArray(c, a, 0);
            String[] b = new String[obj.howmany];
            toArray(obj.c, b, 0);
            int x = 0;
            while ((x < a.length) && (x < b.length) && (result == true)) {
                result = (a[x].equals(b[x]));
                x++;
            }
        }
        return result;
    }

    private static int toArray(btNode t, String[] a, int i) {
        int num_nodes = 0;
        if (t != null) {
            num_nodes = toArray(t.left, a, i);
            a[num_nodes + i] = t.info;
            num_nodes = num_nodes + 1 + toArray(t.right, a, num_nodes + i + 1);
        }
        return num_nodes;
    }



public static void main(String[] args) {

      String value; Scanner keyboard=new Scanner(System.in);

      StringCol P=new StringCol(), N=new StringCol(), L= new StringCol();

      System.out.println("Enter an string to be inserted or 'exit' to quit:");
      value=keyboard.nextLine();

      while(!value.equalsIgnoreCase("exit"))
      {
         if (value.charAt(0) != ('-')) {P.insert(value); L.insert(value);}
         else {N.insert(value.substring(1)); L.omit(value.substring(1));}
         System.out.println("Enter next string to be inserted or 'exit' to quit:");
         value=keyboard.nextLine();
      }

      System.out.println("\nThe values in collection P are:");
      P.print();
      System.out.println("\nThe values in collection N are:");
      N.print();
      System.out.println("\nThe values in collection L are:");
      L.print();
      if (P.equals(N)) System.out.println("\nP and N are equal.");
      else System.out.println("\nP and N are NOT equal.");
      StringCol A=new StringCol(); A.copy(L);
      System.out.println("\nThe values in the copy of L are:\n");
      A.print();

    }


}
