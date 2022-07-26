package com.bridgelabz;

public class Main {
    public static void main(String[] args) {

        FindMaximum maximum=new FindMaximum<>();

        Integer num1,num2,num3;
        num1=5;num2=9;num3=7;
        Integer maxInt=(Integer) maximum.getMaximum(num1,num2,num3);
        System.out.println("maximum Integer= "+maxInt);

        Float f1,f2,f3;
        f1=5.1f;f2=6.2f;f3=10.5f;
        Float maxFloat=(Float) maximum.getMaximum(f1,f2,f3);
        System.out.println("maximum Float= "+maxFloat);

        String s1,s2,s3;
        s1="Apple"; s2="Peach"; s3="Banana";
        String maxString= maximum.getMaximum(s1, s2, s3).toString();
        System.out.println("maximum String= "+maxString);

    }
}
