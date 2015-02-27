package sortingclient;
import java.util.Random;
public class SortingMethods {

    static int numcalls = 0;
    static int count = 0, m = 0;
    static int icount = 0;
    
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

    public static int[] insertionsort(int[] a) {
        int j = 1;
        int k = 0;
        int x = 0;
        while (j < a.length) {
            k = j;
            x = a[j];
            while ((k > 0) && (x < a[k - 1])) {
                a[k] = a[k - 1];
                k--;
                icount++;
            }
            a[k] = x;
            icount++;
            j++;
        }
        return a;
    }

}
