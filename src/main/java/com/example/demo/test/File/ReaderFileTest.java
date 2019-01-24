package com.example.demo.test.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author houqingxin
 * @Description: 文件流
 * @date 2019-01-19 20:40
 */
public class ReaderFileTest {


    public static void main(String[] args) {
        FileReader fr = null;
        try {

            //如果文件不存在则会报异常!!!!  这点与FileWriter 不同
            fr = new FileReader("demo.txt");

            //method 1:
          /*  int c = 0;
            //一个一个读字符
            //返回字符的编码,当读到末尾时返回 -1
            while ((c = fr.read()) != -1) {
                System.out.println((char) c);
            }*/

            //method 2:


            char[] buff = new char[1024];
            int len = 0;
            //fr.read(buff)  将读到的字符存到数组中
            while ((len = fr.read(buff)) != -1) {
                //将数组中的字符转成string
                System.out.println(new String(buff, 0, len));
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            //如果不判断,当fw new 时报错,则fw 为null 在这回报空指针异常
            if (fr != null) {
                try {
                    //fw.close要单独处理异常
                    //因为fw.write异常时,直接走catch fw.close 将不会关闭
                    fr.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                    throw new RuntimeException("关闭流失败");
                }
            }
        }
    }
}
