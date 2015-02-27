package intcoll3client;

public class IntColl3 {

    private boolean[] c;
    private int howmany;

    public IntColl3() { //Default constructor: Establishes a boolean array of 500 and makes everything false
        c = new boolean[501]; 
        howmany = 0;
        for (int j=0; j<c.length;j++) {
            c[j] = false;
        }
    }

    public IntColl3(int i) { //Constructor used when amount of booleans is specified
        c = new boolean[i + 1]; // 
        howmany = 0;
        for (i=0; i<c.length;i++) { //Run through each spot in the array and make it false
        c[i] = false;
    }
}   
    public void copy(IntColl3 obj) // Creates new batch of booleans and copies the values from the old one 
    {
        if (this != obj) 
        {
            c = new boolean[obj.c.length]; // Create new array with the same length as the obj
            int j = 0;
            this.howmany = obj.howmany; // Make the 2 array collections equal
            while (j <= c.length - 1) 
            {
                c[j] = obj.c[j]; // Store each value into the new array (copying)
                j++;
            }

        }
        
    }

    public boolean belongs(int i) // Tests a boolean to see if it's in the collection. Returns the result
    {
        return (i<c.length) && (i>0) && (c[i]); 
    }
          
    public void insert(int i) // inserts a value at the end of a collection if there is room. If not, the size of the collection "c" is doubled, 
                              //placed into "d", values are added, and then placed back into "c"
    {
        if (i > 0) {
            int j = howmany;
            if (i > c.length - 1) 
            {
                boolean[] d = new boolean[2 * (i) + 1]; // Creates new array 2 times the length of c to accomodate 
                int y = 0;
                
                while (y < c.length) {
                    d[y] = c[y]; // Copy the values
                    y++;
                }
                c = d; // Put the values back into c
                c[i] = true;
                howmany++;
            } else if (i<=c.length) { // If the array is not being extended, make every value in the collection true                           
                    c[i] = true;
                    howmany++;                               
            }
                                
                    }
     }
    

    public void omit(int i) // Checks the collection for a value. If the value is in the collection, omit it by making it false.
    {
        if ((i < c.length-1)&&(i>0)) 
        {
            c[i] = false;
            howmany--; 

        }
       // howmany--; 
    }
    

    public int get_howmany() // Returns the number of values in the collection
    {
        return howmany;
    }

    public void print() // Prints the values left in the collection
    {
        int j = 0;
        System.out.println();
        while (j < c.length) {
            if (c[j] == true) {
              System.out.println(j);           
            }
              j++;
        }
    }
    public boolean equals(IntColl3 obj) // Tests if 2 collections have the same value. Returns the result.
    {
        boolean result = true;
        if (this.howmany == obj.howmany) {
            for (int j = 0; j < this.c.length && result && j<obj.c.length == true; j++)
            {
                result = (c[j] == obj.c[j]);
            }
            return result; 
        } else {
            return false;
        }
    }
}
    
       
        
        
      
