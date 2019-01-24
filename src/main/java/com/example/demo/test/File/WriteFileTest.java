package com.example.demo.test.File;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author houqingxin
 * @Description: 文件流
 * @date 2019-01-19 20:40
 */
public class WriteFileTest {

    //根据系统来换行
    private static final String LINE_SEPARATOR = System.getProperty("line.separator");

    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            //如果加true 就是在文件后追加内容
            //如果文件不存在则自动会创建
            //如果路径不存在,则会报异常
            fw = new FileWriter("demo.txt",true);
            fw.write("aa" + LINE_SEPARATOR + "haha");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //如果不判断,当fw new 时报错,则fw 为null 在这回报空指针异常
            if (fw != null) {
                try {
                    //fw.close要单独处理异常
                    //因为fw.write异常时,直接走catch fw.close 将不会关闭
                    fw.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                    throw new RuntimeException("关闭流失败");
                }
            }
        }
    }
}
