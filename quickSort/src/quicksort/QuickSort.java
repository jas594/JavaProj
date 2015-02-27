package quicksort;
import java.util.Random;
import java.util.Scanner;

public class QuickSort {

    static int qcount = 0;

    public static void quicksort(int[] a, int left, int right) {

        int index = partition(a, left, right);
        if (left < index - 1) {
            quicksort(a, left, index - 1);
        }
        if (right > index) {
            quicksort(a, index, right);
        }

    }

    public static int partition(int a[], int left, int right) {
        int i = left, j = right;
        int t;
        int p = a[(left + right) / 2]; //int mid

        while (i <= j) {
            while (a[i] < p) {
                i++;               
            }
            while (a[j] > p) {
                j--;           
            }
            if (i <= j) {
                t = a[i];
                a[i] = a[j];
                a[j] = t;
                i++;
                j--;
            }
            qcount++;
        }

        return i;
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
            qcount = 0;
            for (i = 0; i < 2048; i++) { //Fills the array with random ints from 0-5000
                a[i] = gen.nextInt(5000) + 1;
            }
            quicksort(a, 0, a.length - 1);
            mValuesA[x] = qcount;
        }

        for (int x = 0; x < k; x++) {
            qcount = 0;
            for (i = 0; i < 4096; i++) { //Fills the array with random ints from 0-5000
                b[i] = gen.nextInt(5000) + 1;
            }
            quicksort(b, 0, b.length - 1);
            mValuesB[x] = qcount;
        }

        for (int x = 0; x < k; x++) {
            qcount = 0;
            for (i = 0; i < 8192; i++) { //Fills the array with random ints from 0-5000
                c[i] = gen.nextInt(5000) + 1;
            }
            quicksort(c, 0, c.length - 1);
            mValuesC[x] = qcount;
        }

        for (int x = 0; x < k; x++) {
            qcount = 0;
            for (i = 0; i < 16384; i++) { //Fills the array with random ints from 0-5000
                d[i] = gen.nextInt(5000) + 1;
            }
            quicksort(d, 0, d.length - 1);
            mValuesD[x] = qcount;
        }

        for (int q = 0; q < mNames.length; q++) {
            sum = 0;
            System.out.println(" |Array of size: " + arraySize + "|");
            arraySize = arraySize * 2;
            quicksort(mNames[q], 0, mNames[q].length - 1);

            max = mNames[q][k - 1];
            min = mNames[q][0];
            for (int sumCounter = 0; sumCounter < mNames[q].length; sumCounter++) {
                sum = sum + mNames[q][sumCounter];
            }
            average = sum / mNames[q].length;

            System.out.println(" |Quick| ");
            System.out.println(" |min = " + min + "|");
            System.out.println(" |max = " + max + "|");
            System.out.println(" |average = " + average + "|");
            System.out.println("");
        }

    }
}