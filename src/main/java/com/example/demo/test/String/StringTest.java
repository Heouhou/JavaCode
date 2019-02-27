package com.example.demo.test.String;

/**
 * @author houqingxin
 * @Description: 测试字符串
 * @date 2019-02-27 11:40
 */
public class StringTest {


    /**
     *  String 为什么是不可变的
     *  https://www.cnblogs.com/leskang/p/6110631.html
     *  https://blog.csdn.net/weixin_42447959/article/details/82598778
     *
     *
     * 谈到String为不可变对象，有一个容易混淆的误区，例如：
     *
     *String a ="aaa";
     * System.out.println(a);
     * a="bbb";
     *System.out.println(a);
     * 这里a只是一个对象的引用，
     * 最明显的比如Class cls,这只是创建了Class对象的引用，Class cls = new Class(),才是创建Class对象。
     * 所以这里其实是创建了两个字符串对象。
     * 同样的误区还有对字符串的一些操作方法后，substring()，replace()等，其实这都是重新创建了字符串对象，与字符串对象不可变并不悖论。
     */

    public static void main(String[] args) {



    }
}
