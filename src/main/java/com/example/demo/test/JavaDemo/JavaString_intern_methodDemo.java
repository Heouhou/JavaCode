package com.example.demo.test.JavaDemo;

/**
 * @author houqingxin
 * @Description: java String
 * @date 2019-01-29 11:32
 */
public class JavaString_intern_methodDemo {

// https://tech.meituan.com/2014/03/06/in-depth-understanding-string-intern.html


    //美团  深入解析String#intern



    /*public static void main(String[] args) {
        String s = new String("1");
        s.intern();
        String s2 = "1";
        System.out.println(s == s2);

        String s3 = new String("1") + new String("1");
        s3.intern();
        String s4 = "11";
        System.out.println(s3 == s4);
    }*/



    public static void main(String[] args) {
        String s = new String("1");
        String s2 = "1";
        s.intern();
        System.out.println(s == s2);

        String s3 = new String("1") + new String("1");
        String s4 = "11";
        s3.intern();
        System.out.println(s3 == s4);
    }
}
