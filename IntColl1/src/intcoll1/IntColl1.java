//*********************************************************************
// FILE NAME    : Intcoll1.java
// DESCRIPTION  : This file contains the class Intcoll1.
//*********************************************************************

import java.util.*;

public class IntColl1 
{
   private int[] c; 
   
   public IntColl1() // Default constructor: Establishes an int array of 500 
   {
      	c = new int[501]; // Modifies the array "c" to contain spots from 0 to 500
      	c[0] = 0; // Stores the value of 0 into the first spot in the array
   }

   public IntColl1(int i) //Constructor used when amount of int's is specified
   {
      	c = new int[i+1]; // Passes "i" through the method to create array "c" with amount of spots based on "i"
    	c[0] = 0; // Stores the value of 0 into the first spot in the array
   }

   public void copy(IntColl1 obj) // Copies the values of 1 collection into a new one 
   {
      	if (this != obj) // if the objects dont match, run through the loop
      	{
		c = new int[obj.c.length]; // Makes the array contain the amount of spots equal to the length of the obj
		int j = 0;
		while (obj.c[j] != 0) 
		{
			c[j] = obj.c[j]; j++; 
		}
		c[j] = 0;
	}
   }

   public boolean belongs(int i) // Tests an int to see if it's in the collection. Returns the result
   {
      	int j = 0;
      	while ((c[j] != 0)&&(c[j] != i)) j++; 
      	return ((i>0)&&(c[j] == i)); 
   }

   public void insert(int i) // inserts a value at the end of a collection if there is room. If not, the size of the collection "c" is doubled, 
                              //placed into "d", values are added, and then placed back into "c"
   {
      	if (i > 0)
	{
	 	int j = 0;
	     	while ((c[j] != 0) && (c[j] != i)) j++; // While index (j) in array (c) is not 0 AND index (j) is not equal to value of i, add 1 to j
		if (c[j] == 0) // If statement: If index (j) in array (c) equals 0, go into next if
	     	{
			if (j == c.length - 1) // If statement: If j equals the length of array (c) - 1, go into loop
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
                        
		   	c[j] = i; c[j + 1] = 0; 
		}
	}
   }

   public void omit(int i) // Checks the collection for a value. If the value is in the collection, omit it by removing it.
   {
	if (i>0)
	{
      		int j = 0;
      		while ((c[j] != 0)&&(c[j] != i)) j++; // While spot # (j) in array (c) is not 0 AND spot # (j) is not equal to value of i, add 1 to j
      		if (c[j] == i) // If statement: If spot # (j) in array (c) equals "i", go into loop
      		{
         		int k = j+1;
         		while (c[k] != 0) 
                            k++;
         		c[j] = c[k-1]; 
                        c[k-1]=0;
      		}
	}
   }

   public int get_howmany() // Returns the number of values in the collection
   {
      	int j=0, howmany=0;

      	while (c[j]!=0) {howmany++; j++;} 
      	return howmany;
   }

   public void print() // Prints the values in the collection
   {
      	int j = 0;
      	System.out.println();
      	while (c[j] != 0)
      	{
         	System.out.println(c[j]); j++;
      	}
   }

   public boolean equals(IntColl1 obj) // Tests if 2 collections have the same value. Returns the result.
   {
      	int j = 0; boolean result = true;
      	while ((c[j] != 0)&&result)
      	{
         	result = obj.belongs(c[j]); j++;
      	}
      	j = 0;
      	while ((obj.c[j] != 0)&&result)
      	{
         	result = belongs(obj.c[j]); j++;
      	}
      	return result;
   }
}


