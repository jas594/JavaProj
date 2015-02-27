package intcoll6client;
import java.util.Scanner;
public class IntColl6client {
    public static final int SENTINEL = 0;
    public static void main(String[] args) {
           
      int value; Scanner keyboard=new Scanner(System.in);
    
      IntColl6 P=new IntColl6(), N=new IntColl6(), L= new IntColl6();
       
      System.out.println("Enter an integer to be inserted or 0 to quit:");
      value=keyboard.nextInt();
      while(value != SENTINEL)
      {
         if (value > 0) {P.insert(value); L.insert(value);}
         else {N.insert(-value); L.omit(-value);}
         System.out.println("Enter next integer to be inserted or 0 to quit:");
         value=keyboard.nextInt();
      }
      System.out.println("\nThe values in collection P are:");
      P.print();
      System.out.println("\nThe values in collection N are:");
      N.print();
      System.out.println("\nThe values in collection L are:");
      L.print();
      if (P.equals(N)) System.out.println("\nP and N are equal.");
      else System.out.println("\nP and N are NOT equal.");
      IntColl6 A=new IntColl6(); A.copy(L);
      System.out.println("\nThe values in the copy of L are:\n");
      A.print();
            
    }
 
}
