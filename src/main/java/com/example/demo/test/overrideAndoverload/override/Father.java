package com.example.demo.test.overrideAndoverload.override;

import com.example.demo.test.demo.Dog;

/**
 * @author houqingxin
 * @Description: 父类
 * @date 2019-02-27 10:32
 */
public class Father {

    /**
     * 方法名、参数列表必须相同
     */
    public void testName(){

    }
    /**
     * 返回值范围小于等于父类(返回类型若为引用类型必须小于或等于父类的，若为基本类型或者void则必须相同)
     */
    public Dog testReturn(){

        return null;

    }
    /**
     * 抛出的异常范围小于等于父类，
     */

    public void testException() throws Exception{

    }

    /**
     * 访问修饰符范围大于等于父类；
     */

     void testPermission () throws Exception{

    }


    /**
     * 如果父类方法访问修饰符为 private 则子类就不能重写该方法。
     */


    private void test () throws Exception{

    }
}
