package com.example.demo.test.JavaDemo;


/**
 * @author houqingxin
 * @Description: java 基础
 * @date 2019-01-28 09:56
 */
public class JavaStringDemo {


    public static void main(String[] args) {
        // == 比的是内容和地址 equals 比的是内容
        // String Integet 等重写了 equals 方法,其他Object没有重写方法 ,用的还是 == 方法


        /**
         *
         new Integer(123) 与 Integer.valueOf(123) 的区别在于：

         new Integer(123) 每次都会新建一个对象；
         Integer.valueOf(123) 会使用缓存池中的对象，多次调用会取得同一个对象的引用。
         */
        Integer a = new Integer(123);
        Integer z = Integer.valueOf(123);


        /**
         * valueOf() 方法的实现比较简单，就是先判断值是否在缓存池中，如果在的话就直接返回缓存池的内容。
         *
         * public static Integer valueOf(int i) {
         *     if (i >= IntegerCache.low && i <= IntegerCache.high)
         *         return IntegerCache.cache[i + (-IntegerCache.low)];
         *     return new Integer(i);
         * }
         * 在 Java 8 中，Integer 缓存池的大小默认为 -128~127。
         *
         *
         */


        /**
         * 编译器会在自动装箱过程调用 valueOf() 方法，因此多个 Integer 实例使用自动装箱来创建并且值相同，那么就会引用相同的对象。
         *
         * Integer m = 123;
         * Integer n = 123;
         * System.out.println(m == n); // true
         */


        Integer b = 200;
        Integer f = 200;
        System.out.println(b.equals(f));//true

        System.out.println(b == f);//false 因为200 不在缓冲池内







        /**
         *
         *
         *
         *
         *
         * // ==与equals的区别：
         * // ==：
         * // 1、比较的是操作符两端的操作数是否是同一个对象
         * // 2、两边的操作数必须是同一类型的（可以是父子类之间）才能编译通过。
         * // 3、比较的是地址，如果是具体的阿拉伯数字的比较，值相等则为TRUE，如：
         * // int a=10 与 long b=10L 与 double c=10.0都是相同的（为true），因为他们都指向地址为10的堆
         * // equals：
         * // 1、比较的是两个对象的内容是否一样
         * String s="abce"是一种非常特殊的形式,和new 有本质的区别.
         * *
         * * 它是java中唯一不需要new 就可以产生对象的途径.
         * *
         * * 以 String s="abce";形式赋值在java中叫直接量,它是在常量池中而不是象new 一样放在压缩堆中.
         * * 这种形式的字符串,在JVM内部发生字符串拘留,即当声明这样的一个字符串后,JVM会在常量池中先查找有有没有一个值为"abcd"的对象,如果有,就会把它赋给当前引用.即原来那个引用和现在这个引用指点向了同一对象,如果没有,则在常量池中新创建一个"abcd",下一次如果有String
         * * s1 = "abcd";又会将s1指向"abcd"这个对象,即以这形式声明的字符串,只要值相等,任何多个引用都指向同一对象.
         * public class Test1 {
         * public static void main(String[] args) {
         * String a = new String("ab"); // a 为一个引用
         * String b = new String("ab"); // b为另一个引用,对象的内容一样
         * String aa = "ab"; // 放在常量池中
         * String bb = "ab"; // 从常量池中查找
         * if (aa == bb) // true
         * System.out.println("aa==bb");
         * if (a == b) // false
         * System.out.println("a==b");
         * if (a.equals(b)) // true
         * System.out.println("aEQb");
         * if (42 == 42.0) { // true
         * System.out.println("true");
         * }
         * }
         * }
         * 也可以这么理解:
         * String str = "hello"; 先在内存中找是不是有"hello" 这个对象,
         * 如果有，就让str指向那个"hello".如果内存里没有"hello"，就创建一个新的对象保存"hello".
         * String str=new String ("hello") 就是不管内存里是不是已经有"hello"这个对象，
         * 都新建一个对象保存"hello"
         * String a = new String("ab");是在堆里面建立的对象 String,a和"ab"
         * aa="ab";是查找栈里有没有"ab",如果有就用aa引用它，如果没有就把“ab”存进栈
         * String r ="dsds"; ---------------------生成一个对象 "dsds"
         * String r =new String ("dsd"); ---------------生成两个对象,"dsd"和new String ("dsd")
         * 因为new String("dsd")的参数"dsd"本身就是一个字符串对象，new String("dsd")又返回一个字符串对象。
         */



        System.out.println("--------------------------------------------");
        String ss = "abc";
        String ss1 = "abc";

        System.out.println(ss == ss1);//true

        String str = new String("hello");
        String str1 = new String("hello");

        System.out.println(str == "hello");//false

        System.out.println(str == str1);//false


        System.out.println("--------------------------------------------");


/**
 *
 *
 * 当一个字符串调用 intern() 方法时，如果 String Pool 中已经存在一个字符串和该字符串值相等（使用 equals() 方法进行确定）
 * ，那么就会返回 String Pool 中字符串的引用；否则，就会在 String Pool 中添加一个新的字符串，并返回这个新字符串的引用。
 */
        String s1 = new String("aaa");
        String s2 = new String("aaa");
        System.out.println(s1 == s2);           // false
        String s3 = s1.intern();
        String s4 = s2.intern();




        System.out.println(s3 == s4);




    }



}
