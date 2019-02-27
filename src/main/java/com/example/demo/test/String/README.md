## 1.String 为什么是不可变的


详细见下面两篇博客</br>
[String 为什么是不可变的](https://www.cnblogs.com/leskang/p/6110631.html)</br>
[String 为什么是不可变的](https://blog.csdn.net/weixin_42447959/article/details/82598778)</br>


谈到String为不可变对象，有一个容易混淆的误区，例如：
``` java
    String a ="aaa";
    System.out.println(a);
    a="bbb";
    System.out.println(a);
```
这里a只是一个对象的引用，最明显的比如Class cls,这只是创建了Class对象的引用，Class cls = new Class(),才是创建Class对象。所以这里其实是创建了两个字符串对象。</br>
同样的误区还有对字符串的一些操作方法后，substring()，replace()等，其实这都是重新创建了字符串对象，与字符串对象不可变并不悖论。



## 2.String s ="aa" 和 String s =new String("aa") 的区别
String s="abce"是一种非常特殊的形式,和new有本质的区别.</br>
它是java中唯一不需要new 就可以产生对象的途径.</br>
**以 String s="abce";形式赋值在java中叫直接量,它是在常量池中而不是象new 一样放在压缩堆中.这种形式的字符串,在JVM内部发生字符串拘留,即当声明这样的一个字符串后,JVM会在常量池中先查找有有没有一个值为"abcd"的对象,如果有,就会把它赋给当前引用.即原来那个引用和现在这个引用指点向了同一对象,如果没有,则在常量池中新创建一个"abcd",下一次如果有String s1 = "abcd";又会将s1指向"abcd"这个对象,即以这形式声明的字符串,只要值相等,任何多个引用都指向同一对象.**

```java
        public class Test1 {
            public static void main(String[] args) {
                String a = new String("ab"); // a 为一个引用
                String b = new String("ab"); // b为另一个引用,对象的内容一样
                String aa = "ab"; // 放在常量池中
                String bb = "ab"; // 从常量池中查找
                if (aa == bb) // true
                System.out.println("aa==bb");
                if (a == b) // false
                System.out.println("a==b");
                if (a.equals(b)) // true
                System.out.println("aEQb");
                if (42 == 42.0)  // true
                System.out.println("true");
            }
        }
```
也可以这么理解:</br>
String str = "hello"; 先在内存中找是不是有"hello" 这个对象,如果有，就让str指向那个"hello".如果内存里没有"hello"，就创建一个新的对象保存"hello".</br>
String str=new String ("hello"); 就是不管内存里是不是已经有"hello"这个对象，都新建一个对象保存"hello".</br>
String a = new String("ab");是在堆里面建立的对象 String,a和"ab".</br> aa="ab";是查找栈里有没有"ab",如果有就用aa引用它，如果没有就把“ab”存进栈.</br>
String r ="dsds"; ---------------------生成一个对象 "dsds"</br>
String r =new String ("dsd"); ---------------生成两个对象,"dsd"和new String ("dsd")</br>
因为new String("dsd")的参数"dsd"本身就是一个字符串对象，new String("dsd")又返回一个字符串对象。

```java
    String ss = "abc";
    String ss1 = "abc";
    System.out.println(ss == ss1);//true
    String str = new String("hello");
    String str1 = new String("hello");
    System.out.println(str == "hello");//false
    System.out.println(str == str1);//false
```



## 3.String StringBuffer 和 StringBuilder 的区别是什么 String 为什么是不可变的
* 可变性</br>
简单的来说：String 类中使用 final 关键字字符数组保存字符串，private　final　char　value[]，所以 String 对象是不可变的。
</br>而StringBuilder 与 StringBuffer 都继承自 AbstractStringBuilder 类，在 AbstractStringBuilder 中也是使用字符数组保存字符串char[]value 但是没有用 final 关键字修饰，所以这两种对象都是可变的。</br>
StringBuilder 与 StringBuffer 的构造方法都是调用父类构造方法也就是 AbstractStringBuilder 实现的，大家可以自行查阅源码。
```java
    AbstractStringBuilder.java
    
    abstract class AbstractStringBuilder implements Appendable, CharSequence {
        char[] value;
        int count;
        AbstractStringBuilder() {
        }
        AbstractStringBuilder(int capacity) {
            value = new char[capacity];
        }
```
* 线程安全性</br>
String 中的对象是不可变的，也就可以理解为常量，线程安全。</br>
AbstractStringBuilder 是 StringBuilder 与 StringBuffer 的公共父类，定义了一些字符串的基本操作，如 expandCapacity、append、insert、indexOf 等公共方法。</br>
StringBuffer 对方法加了同步锁或者对调用的方法加了同步锁，所以是线程安全的。</br>
StringBuilder 并没有对方法进行加同步锁，所以是非线程安全的。 　　
* 性能</br>
每次对 String 类型进行改变的时候，都会生成一个新的 String 对象，然后将指针指向新的 String 对象。</br>
StringBuffer 每次都会对 StringBuffer 对象本身进行操作，而不是生成新的对象并改变对象引用。</br>
相同情况下使用 StringBuilder 相比使用 StringBuffer 仅能获得 10%~15% 左右的性能提升，但却要冒多线程不安全的风险。

* 对于三者使用的总结：</br>
1. 操作少量的数据 = String
2. 单线程操作字符串缓冲区下操作大量数据 = StringBuilder
3. 多线程操作字符串缓冲区下操作大量数据 = StringBuffer
