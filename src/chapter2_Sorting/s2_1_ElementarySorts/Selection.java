package chapter2_Sorting.s2_1_ElementarySorts;

import chapter2_Sorting.SortUtil;
import edu.princeton.cs.algs4.In;

public class Selection {


    public static void sort(Comparable[] a) {

        int len = a.length;

        for (int i=0; i<len; i++) {

            int min = i;
            for (int j = i+1; j < len; j++) {
                if (SortUtil.less(a[j], a[min])) {
                    min = j;
                }
            }
            SortUtil.exch(a, i, min);
        }
    }

    public static void main(String[] args) {
        //String[] a = In.readStrings();

        String[] a = new In(args[0]).readAllStrings();
        sort(a);
        assert SortUtil.isSorted(a);
        SortUtil.show(a);
    }


}
