package com.example.demo.test.JavaDemo;

import com.example.demo.test.demo.Dog;

import java.util.ArrayList;
import java.util.List;

/**
 * @author houqingxin
 * @Description: 测试Final 关键字
 * @date 2019-02-25 09:41
 */
public class JavaFinalDemo {


    private String notStatic ="";

    public static void main(String[] args) {


        final List<Dog> dogs = new ArrayList<>();


        Dog dog = new Dog();
        method();

        dog.name="a";
        dogs.add(dog);

        System.out.println(dog.name);




    }

    public JavaFinalDemo(String notStatic) {
        this.notStatic = notStatic;
    }

    private static void method() {

       // method2();
       // JavaFinalDemo();
    }

    private  void method2() {

    }


}
