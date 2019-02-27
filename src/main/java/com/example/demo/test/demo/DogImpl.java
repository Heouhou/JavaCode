package com.example.demo.test.demo;

/**
 * @author houqingxin
 * @Description:
 * @date 2019-01-29 15:33
 */
public interface DogImpl {

    void func1();

    default void func2(){
        System.out.println("func2");
    }
}
