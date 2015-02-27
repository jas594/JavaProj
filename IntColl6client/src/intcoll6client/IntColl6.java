package intcoll6client; 
public class IntColl6 {

    private int howmany;
    private btNode c;
            
    public IntColl6() { // Default constructor that starts counter at 0 and list is null
        howmany = 0;
        c = null;
    }

    public IntColl6(int i) { // Constructor used when i is specified
        howmany = 0;
        c = null;
    }
            private static class btNode {
                
            int info; btNode left; btNode right;              
             
                    private btNode(int n, btNode lt, btNode rt) 
                    {
                        info = n;
                        left = lt;
                        right = rt;              
                    }
            
                    private btNode()
                    {
                        info = 0;
                        left = null;
                        right = null;
                    }     
        }
            
    public void insert (int i) { //inserts a value at the beginning of the collection
        btNode p=c, pred = null; 
        while ((p!=null) && (p.info!=i)) 
        {
               pred=p;
               if (p.info>i) {
                  p=p.left;
               } else 
                  p=p.right;
        }
        
      if (p==null)
      {
         howmany++; 
         p=new btNode(i, null, null);
         if (pred!=null)
         {
			 if (pred.info>i) pred.left=p;
			 else pred.right=p;
		 }
		 else c=p;
      }
   }
   
    public void omit(int i) { //checks the collection for an int. if the int is there, it is removed.
        btNode p=c, pred=null; 
        while ((p!=null) && (p.info!=i))
        {
            pred = p;
            
            if (p.info>i) {
                p=p.left;
            } else         
                p=p.right;
        
        }
        if (p != null) {
            howmany--;           
                if ((p.left == null) && (p.right == null)) {
                if (pred != null) {
                    if (i <= pred.info) {
                        pred.left = null;
                    } else {
                        pred.right = null;
                    }
                } else {
                    c = null;
                }
            } else if ((p.left == null) && (p.right != null)) {
                if (pred != null) {
                    if (i <= pred.info) {
                        pred.left = p.right;
                    } else {
                        pred.right = p.right;
                    }
                } else {
                    c = p.right;
                }
            } else if ((p.left != null) && (p.right == null)) {
                if (pred != null) {
                    if (i <= pred.info) {
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
                if (mpred != p){ 
                    p.info = m.info; //changes number (info) in p to the new value
                    mpred.right = m.left;                      
                } else { // occurs when right subtree of left subtree = null (mpred=p)
                    p.info = m.info;
                    p.left = m.left;
                }          
                
            }
        }
    }
    public boolean belongs(int i) { //tests an integer to see if it's in the collection, returns the result
        btNode p = c;
        while ((p != null) && (p.info != i)) {
            if (p.info > i) {
                p = p.left;
            } else {
                p = p.right;
            }
        }
        return (p != null);
    }


    private static btNode copyTree(btNode t) {
        btNode root=null;
        if (t!=null) { 
            root = new btNode();
            root.info = t.info;
            root.left = copyTree(t.left);
            root.right = copyTree(t.right);
        }
        return root;
    }
    
    public void copy(IntColl6 obj) {
        if (this != obj) {
            howmany = obj.howmany;
            c = copyTree(obj.c);
        }
    }

    private static void printTree(btNode t) {
        if (t != null) {
            printTree(t.left);
            System.out.println("L: " + ( (t.left == null)?  -1:t.left.info) + " Info: " + t.info +
                    " R: " + ( (t.right == null)?  -1:t.right.info) );
            printTree(t.right);
        }
    }
      
    public void print() {
        printTree(c);
    }

    public int get_howmany() {
        return howmany;
    }

    public boolean equals(IntColl6 obj) {
        boolean result = (howmany == obj.howmany);
        if (!result) {
            int[] a = new int[howmany];
            toArray(c, a, 0);
            int[] b = new int[obj.howmany];
            toArray(obj.c, b, 0);
            int x = 0;
            while ((x < a.length) && (x < b.length) && (result == true)) {
                result = (a[x] == b[x]);
                x++;
            }
        }
        return result;
     }
    
    private static int toArray(btNode t, int[] a, int i) {
        int num_nodes = 0;
        if (t != null) {
            num_nodes = toArray(t.left, a, i);
            a[num_nodes + i] = t.info;
            num_nodes = num_nodes + 1 + toArray(t.right, a, num_nodes + i + 1);
        }
        return num_nodes;
    }
   
}     
            
    
    

//level order traversing 