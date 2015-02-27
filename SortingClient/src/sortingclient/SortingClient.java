package sortingclient;
import java.util.Random;
public class SortingClient {
    public static void main(String[] args) {
        
      Random gen=new Random(); int[] a=new int[32];
      int i; for (i=0; i<a.length; i++) a[i]=gen.nextInt(5000)+1;
      System.out.println("Initial array:");
      for (i=0; i<a.length; i++) System.out.println(a[i] + " ");
      System.out.println();
      mergesort(a, 0, a.length-1);
      System.out.println("Sorted array:");
      for (i=0; i<a.length; i++) System.out.println(a[i] + " ");
      System.out.println("Done!");
      System.out.println(" numcalls "+ numcalls);
      System.out.println(" count "+ count +" m "+m);
   }
}
        
        
        
        
        
        
        
        
        
        
        

