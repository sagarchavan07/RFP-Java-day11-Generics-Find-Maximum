package com.bridgelabz;

public class FindMaximum<K extends Comparable> {

    K getMaximum(K n1, K n2, K n3){
        K max=n1;
        if (n2.compareTo(max) > 0) max=n2;
        if (n3.compareTo(max) > 0) max=n3;
        return max;
    }
}
