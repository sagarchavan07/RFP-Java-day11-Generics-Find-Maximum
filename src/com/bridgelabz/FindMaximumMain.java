package com.bridgelabz;

public class FindMaximumMain {

    static <K extends Comparable>K findMaximum(K n1, K n2, K n3){
        K max=n1;
        if (n2.compareTo(max) > 0) max=n2;
        if (n3.compareTo(max) > 0) max=n3;
        return max;
    }

    public static void main(String[] args) {
        Integer num1,num2,num3;
        num1=5;num2=9;num3=7;
        Integer maxInt=findMaximum(num1,num2,num3);
        System.out.println("maximum Integer= "+maxInt);

        Float f1,f2,f3;
        f1=5.1f;f2=6.2f;f3=10.5f;
        Float maxFloat=findMaximum(f1,f2,f3);
        System.out.println("maximum Float= "+maxFloat);

        String s1,s2,s3;
        s1="Apple"; s2="Peach"; s3="Banana";
        String maxString = findMaximum(s1, s2, s3);
        System.out.println("maximum String= "+maxString);
    }
}
