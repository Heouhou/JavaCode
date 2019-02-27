package com.example.demo.test.JavaDemo;

import com.example.demo.test.demo.Dog;

/**
 * @author houqingxin
 * @Description: float
 * @date 2019-01-29 13:35
 */
public class JAVA03 {

    public static void main(String[] args) {
        short s1 = 1;

        //s1 = s1 + 1; 错误

        s1 += 1;


        //https://www.jianshu.com/p/b6f04fc28c75


        //通过get/set方法看封装的好处
        Dog dog = new Dog();
        dog.name="1";
        Dog dog1 =new Dog();
        System.out.println(dog1.name);
        System.out.println(dog.name);


    }

}
