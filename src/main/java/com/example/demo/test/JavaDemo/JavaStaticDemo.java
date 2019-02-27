package com.example.demo.test.JavaDemo;

/**
 * @author houqingxin
 * @Description: static 关键字测试
 * @date 2019-02-26 11:19
 */
public class JavaStaticDemo {
    //https://www.cnblogs.com/starhu/p/5150241.html

    //另外记住，即使没有显示地声明为static，类的构造器实际上也是静态方法。





    //static变量也称作静态变量，静态变量和非静态变量的区别是：静态变量被所有的对象所共享，在内存中只有一个副本，它当且仅当在类初次加载时会被初始化。而非静态变量是对象所拥有的，在创建对象的时候被初始化，存在多个副本，各个对象拥有的副本互不影响。
    //
    //　　static成员变量的初始化顺序按照定义的顺序进行初始化。
    private static String  a ="";
    public static void main(String[] args) {
        System.out.println(a);
        method();
        System.out.println(a);


    }


    public static void method(){

        a="d";
    }


    /**
     * 扩展 : http://www.cnblogs.com/javaee6/p/3714716.html?utm_source=tuicool&utm_medium=referral
     * java 类加载时机与过程
     *
      */






}
