package com.bridgelabz;

public class FindMaximum<K extends Comparable> {
    K n1,n2,n3;

    public FindMaximum(K n1, K n2, K n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    K getMaximum(){
        K max=n1;
        if (n2.compareTo(max) > 0) max=n2;
        if (n3.compareTo(max) > 0) max=n3;
        return max;
    }
}
