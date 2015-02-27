package intcoll2client;
import java.util.*;
public class IntColl2 {
    
   private int[] c; 
   private int howmany; 
   
   public IntColl2() // Default constructor: Establishes an int array of 500 
   {
      	c = new int[500]; // Modifies the array "c" to contain spots from 0 to 500
        howmany = 0;
   }

   public IntColl2(int i) //Constructor used when amount of int's is specified
   {
      	c = new int[i]; // Passes "i" through the method to create array "c" with amount of spots based on "i"
        howmany=0;
   }

   public void copy(IntColl2 obj) // Copies the values of 1 collection into a new one
   {
      	if (this != obj) // if the objects dont match, run through the loop
      	{
		c = new int[obj.c.length]; // Makes the array contain the amount of spots equal to the length of the obj
		int j = 0;
		while (j != obj.howmany) 
		{
			c[j] = obj.c[j]; j++;
                }
                this.howmany=obj.howmany;               
	}
   }

   public boolean belongs(int i) // Tests an int to see if it's in the collection. Returns the result
   {
      	int j = 0;
      	while ((j <= howmany)&&(c[j] != i)) j++; 
      	return ((i>0)&&(c[j] == i)); 
   }

   public void insert(int i)   //Inserts a value at the end of a collection if there is room. If not, the size of the collection "c" is doubled, 
                              //placed into "d", values are added, and then placed back into "c"
   {
      	if (i > 0)
	{
	 	int j = howmany;
	     	
			if (j == c.length - 1) 
		   	{
                        int[] d = new int[2*(c.length-1)+1]; // Creates new array 2 times the length of c to accomodate 
                        int y=0;
                        while (y<c.length) 
                        {                       
                        d[y] = c[y]; // Makes the arrays equal to eachother 
                        y++;
                        }
		   	d[j] = i;
                        c = d; // Puts the values back into c       
		   	}
		   	c[j] = i;
                        howmany++;		
	}
   }

   public void omit(int i) // Checks the collection for a value. If the value is in the collection, omit it by removing it.
   {
	if (i>0)
	{
      		int j = 0;
      		while ((j <= howmany)&&(c[j] != i)) j++; 
      		if (c[j] == i) // If statement: If index (j) in array (c) equals "i", go into loop
      		{
         		int k = j+1;
         		while (c[k] != 0) k++;
         		c[j] = c[k-1]; c[k-1]=0;
                        howmany--;
      		}
	}
   }

   public int get_howmany() // Returns the number of values in the collection
   { 
      	return howmany;
   }

   public void print() // Prints the values in the collection
   {
      	int j = 0;
      	System.out.println();
      	while (j != howmany) 
      	{
         	System.out.println(c[j]); j++;
      	}
   }

   public boolean equals(IntColl2 obj) // Tests if 2 collections have the same value. Returns the result.
   {
        
      	int j = 0; boolean result = true;
        if (obj.howmany == this.howmany)
        {
      	while ((j < howmany)&& result)
      	{
            
         	result = obj.belongs(c[j]); j++;
      	}
      	j = 0;
      	while ((j < howmany)&&result)
      	{
         	result = belongs(obj.c[j]); j++;
      	}
      	return result;
        }
        else
        {
            return false;
        }
   }
}


