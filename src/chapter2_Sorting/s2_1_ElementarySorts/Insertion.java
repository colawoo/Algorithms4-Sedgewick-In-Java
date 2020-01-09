package chapter2_Sorting.s2_1_ElementarySorts;

import chapter2_Sorting.SortUtil;
import edu.princeton.cs.algs4.In;

public class Insertion {


    public static void sort1(Comparable[] a) {

        int len = a.length;

        for (int i = 1; i < len; i++) {

            // 每次都从头开始比较，比较次数多
            for (int j = 0; j <= i; j++) {
                if (SortUtil.less(a[i], a[j])) {
                    SortUtil.exch(a, i, j);
                    j--;
                }
            }
        }
    }


    public static void sort2(Comparable[] a) {

        int len = a.length;

        for (int i = 1; i < len; i++) {

            // 比sort1方法做比较判断的操作次数少
            for (int j = i; j > 0 && SortUtil.less(a[j], a[j-1]); j--) {
                SortUtil.exch(a, j, j-1);
            }
        }
    }

    public static void main(String[] args) {
        //String[] a = In.readStrings();

        String[] a = new In(args[0]).readAllStrings();
        sort2(a);
        assert SortUtil.isSorted(a);
        SortUtil.show(a);
    }
}
