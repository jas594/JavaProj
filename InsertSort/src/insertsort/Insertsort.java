import java.util.Random;
import java.util.Scanner;
import java.util.*;
public class Insertsort {

	static int icount = 0;
	
      	public static void insertionsort(int[] a) {
        int j=1; int k=0; int x=0;
        while (j<a.length){
            k=j;
            x=a[j];
                while((k>0)&&(x<a[k-1])) {
                    a[k]=a[k-1];
                    k--;
                    icount++;
                }
            a[k]=x;
            icount++;
            j++;
        }
    }

public static void main(String[] args) {

        Random gen = new Random();
        Scanner s = new Scanner(System.in);

        int[] a = new int[2048];
        int[] b = new int[4096];
        int[] c = new int[8192];
        int[] d = new int[16384];
        int i, k, max, min, average, sum = 0, arraySize = 2048;

        System.out.print("Enter amount of k runs: ");
        k = s.nextInt();
        int[] mValuesA = new int[k];
        int[] mValuesB = new int[k];
        int[] mValuesC = new int[k];
        int[] mValuesD = new int[k];
        int[][] mNames = new int[][]{mValuesA, mValuesB, mValuesC, mValuesD};

        for (int x = 0; x < k; x++) {
            icount = 0;
            for (i = 0; i < 2048; i++) { //Fills the array with random ints from 0-5000
                a[i] = gen.nextInt(5000) + 1;
            }
            insertionsort(a);
            mValuesA[x] = icount;
        }

        for (int x = 0; x < k; x++) {
            icount = 0;
            for (i = 0; i < 4096; i++) { //Fills the array with random ints from 0-5000
                b[i] = gen.nextInt(5000) + 1;
            }
            insertionsort(b);
            mValuesB[x] = icount;
        }

        for (int x = 0; x < k; x++) {
            icount = 0;
            for (i = 0; i < 8192; i++) { //Fills the array with random ints from 0-5000
                c[i] = gen.nextInt(5000) + 1;
            }
            insertionsort(c);
            mValuesC[x] = icount;
        }

        for (int x = 0; x < k; x++) {
            icount = 0;
            for (i = 0; i < 16384; i++) { //Fills the array with random ints from 0-5000
                d[i] = gen.nextInt(5000) + 1;
            }
            insertionsort(d);
            mValuesD[x] = icount;
        }

        for (int q = 0; q < mNames.length; q++) {
            sum = 0;
            System.out.println(" |Array of size: " + arraySize + "|");
            arraySize = arraySize*2;
            insertionsort(mNames[q]);

            max = mNames[q][k-1];
            min = mNames[q][0];
            for (int sumCounter = 0; sumCounter < mNames[q].length; sumCounter++) 
                sum = sum + mNames[q][sumCounter];
            
            average = sum / mNames[q].length;

            System.out.println(" |Insertion| ");
            System.out.println(" |min = " + min + "|");
            System.out.println(" |max = " + max + "|");
            System.out.println(" |average = " + average + "|");
            System.out.println("");
        }

    }
}