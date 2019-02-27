package com.example.demo.test.overrideAndoverload.override;

import com.example.demo.test.demo.KeJiDogs;

/**
 * @author houqingxin
 * @Description: 子类
 * @date 2019-02-27 10:34
 */
public class Son extends Father {

    /**
     * 方法名、参数列表必须相同
     */
    @Override
    public void testName() {

    }

    /**
     * 方法名、参数列表必须相同  错误示范
     */
    //@Override
    //public void testName1(){
    // }


    /**
     * 返回值范围小于等于父类，
     */
    @Override
    public KeJiDogs testReturn() {
        return null;
    }


    /**
     * 抛出的异常范围小于等于父类，
     */
    @Override
    public void testException() throws RuntimeException {

    }


    /**
     * 访问修饰符范围大于等于父类；
     */
   @Override
   public void testPermission (){

    }

    /**
     * 访问修饰符范围大于等于父类；错误示范
     */
   // @Override
   // private void testPermission () throws Exception{

   // }



    /**
     * 如果父类方法访问修饰符为 private 则子类就不能重写该方法。  错误示范
     */
   // @Override
    private void test () throws Exception{

    }

}
