import java.util.*;

public class IntColl2 
{
   private int[] c; // creates new empty array of type integer into "c"
   private int[] d;
   private int howmany; // New counter that contains the amount of integers in the collection
   
   public IntColl2()
   {
      	c = new int[500]; // Modifies the array "c" to contain spots from 0 to 500
        howmany = 0;
   }

   public IntColl2(int i)
   {
      	c = new int[i]; // Passes "i" through the method to create array "c" with amount of spots based on "i"
        howmany=0;
   }

   public void copy(IntColl2 obj) // Create method "copy" that passes the obj of IntColl1 
   {
      	if (this != obj) // if the objects dont match, run through the loop
      	{
		c = new int[obj.c.length]; // Makes the array contain the amount of spots equal to the length of the obj
		int j = 0;
		while (obj.c[j] != 0) // While the 1st spot in "obj" array is not 0, run through loop
		{
			c[j] = obj.c[j]; j++; // Makes this spot (j) in array (c) add 1 to obj
		}
		c[j] = 0;
	}
   }

   public boolean belongs(int i) // Create new boolean method "belongs" and pass "i" through
   {
      	int j = 0;
      	while ((j <= howmany)&&(c[j] != i)) j++; // While spot # (j) in array (c) is not 0 AND spot # (j) is not equal to value of i, add 1 to j
      	return ((i>0)&&(c[j] == i)); 
   }

   public void insert(int i) // Create new method that does not return a value (void) and pass "i" through
   {
      	if (i > 0)
	{
	 	int j = 0;
	     	while ((j <= howmany) && (c[j] != i)) j++; // While spot # (j) in array (c) is not 0 AND spot # (j) is not equal to value of i, add 1 to j
		if (c[j] == 0) // If statement: If spot # (j) in array (c) equals 0, go into next if
	     	{
			if (j == c.length - 1) // If statement: If j equals the length of array (c), go into loop
		   	{
                        d = new int[c.length*2];
                        int y=0;
                        while (y<c.length) 
                        {                       
                        d[y] = c[y];
                        }
		   	d[j] = i;
                        d = c;        
		   	}
		   	c[j] = i; c[j + 1] = 0;
                        howmany++;
		}
	}
   }

   public void omit(int i) // Create new method that does not return a value (void) and pass "i" through
   {
	if (i>0)
	{
      		int j = 0;
      		while ((j <= howmany)&&(c[j] != i)) j++; // While spot # (j) in array (c) is not 0 AND spot # (j) is not equal to value of i, add 1 to j
      		if (c[j] == i) // If statement: If spot # (j) in array (c) equals "i", go into loop
      		{
         		int k = j+1;
         		while (c[k] != 0) k++;
         		c[j] = c[k-1]; c[k-1]=0;
                        howmany--;
      		}
	}
   }

   public int get_howmany() //  Getter method of type int
   { 
      	return howmany;
   }

   public void print() // New method "print" that does not return anything (void)
   {
      	int j = 0;
      	System.out.println();
      	while (c[j] != 0)
      	{
         	System.out.println(c[j]); j++;
      	}
   }

   public boolean equals(IntColl2 obj) // 
   {
        
      	int j = 0; boolean result = true;
        if (obj.howmany == this.howmany)
        {
      	while ((j <= howmany)&& result)
      	{
            
         	result = obj.belongs(c[j]); j++;
      	}
      	j = 0;
      	while ((j <= howmany)&&result)
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