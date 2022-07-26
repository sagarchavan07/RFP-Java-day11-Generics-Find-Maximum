package com.bridgelabz;

public class Main {
    public static void main(String[] args) {
        Integer num1,num2,num3;
        num1=5;num2=9;num3=7;
        FindMaximum maximum1=new FindMaximum<>(num1,num2,num3);
        Integer maxInt=(Integer) maximum1.getMaximum();
        System.out.println("maximum Integer= "+maxInt);

        Float f1,f2,f3;
        f1=5.1f;f2=6.2f;f3=10.5f;
        FindMaximum maximum2=new FindMaximum<>(f1,f2,f3);
        Float maxFloat=(Float) maximum2.getMaximum();
        System.out.println("maximum Float= "+maxFloat);

        String s1,s2,s3;
        s1="Apple"; s2="Peach"; s3="Banana";
        FindMaximum maximum3=new FindMaximum<>(s1, s2, s3);
        String maxString= maximum3.getMaximum().toString();
        System.out.println("maximum String= "+maxString);

    }
}
