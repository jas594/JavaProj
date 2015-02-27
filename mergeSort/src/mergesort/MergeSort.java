package mergesort;
import java.util.*;

public class MergeSort {

    static int numcalls = 0;
    static int count = 0, m = 0;

    public static void mergesort(int[] a, int top, int bottom) {
        numcalls++;
        if (top != bottom) {
            int middle = (top + bottom) / 2;
            mergesort(a, top, middle);
            mergesort(a, middle + 1, bottom);
            merge(a, top, bottom);
        }
    }

    public static void merge(int[] a, int top, int bottom) {
        int t = top;
        int middle = (top + bottom) / 2;
        int b = middle + 1;
        int i = 0;
        int[] s = new int[bottom - top + 1];
        while ((t <= middle) && (b <= bottom)) {
            if (a[t] < a[b]) {
                s[i] = a[t];
                t++;
            } else {
                s[i] = a[b];
                b++;
            }
            i++;
            count++;
            m++;
        }
        int last = middle;
        if (b <= bottom) {
            t = b;
            last = bottom;
        }
        while (t <= last) {
            s[i] = a[t];
            t++;
            i++;
            m++;
        }
        for (i = 0; i < s.length; i++) {
            a[i + top] = s[i];
            m++;
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
            m = 0;
            for (i = 0; i < 2048; i++) { //Fills the array with random ints from 0-5000
                a[i] = gen.nextInt(5000) + 1;
            }
            mergesort(a, 0, a.length - 1);
            mValuesA[x] = m;
        }

        for (int x = 0; x < k; x++) {
            m = 0;
            for (i = 0; i < 4096; i++) { //Fills the array with random ints from 0-5000
                b[i] = gen.nextInt(5000) + 1;
            }
            mergesort(b, 0, b.length - 1);
            mValuesB[x] = m;
        }

        for (int x = 0; x < k; x++) {
            m = 0;
            for (i = 0; i < 8192; i++) { //Fills the array with random ints from 0-5000
                c[i] = gen.nextInt(5000) + 1;
            }
            mergesort(c, 0, c.length - 1);
            mValuesC[x] = m;
        }

        for (int x = 0; x < k; x++) {
            m = 0;
            for (i = 0; i < 16384; i++) { //Fills the array with random ints from 0-5000
                d[i] = gen.nextInt(5000) + 1;
            }
            mergesort(d, 0, d.length - 1);
            mValuesD[x] = m;
        }

        for (int q = 0; q < mNames.length; q++) {
            sum = 0;
            System.out.println(" |Array of size: " + arraySize + "|");
            arraySize = arraySize*2;
            mergesort(mNames[q], 0, mNames[q].length - 1);

            max = mNames[q][k-1];
            min = mNames[q][0];
            for (int sumCounter = 0; sumCounter < mNames[q].length; sumCounter++) {
                sum = sum + mNames[q][sumCounter];
            }
            average = sum / mNames[q].length;

            System.out.println(" |Merge| ");
            System.out.println(" |min = " + min + "|");
            System.out.println(" |max = " + max + "|");
            System.out.println(" |average = " + average + "|");
            System.out.println("");
        }

    }
}