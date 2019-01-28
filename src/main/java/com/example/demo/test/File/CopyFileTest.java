package com.example.demo.test.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author houqingxin
 * @Description: 文件复制
 * @date 2019-01-20 16:12
 */
public class CopyFileTest {
    private static final int BUFFER_SIZE = 1024;


    //文件复制
    //方法 1 一个字符一个字符的复制
   /* public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("copy.txt");
        FileReader fr = new FileReader("demo.txt");
        int c = 0;
        while ((c = fr.read()) != -1) {
            fw.write(c);
        }
        fw.close();
        fr.close();
    }*/


    //方法 2
    public static void main(String[] args) {

        FileWriter fw = null;
        FileReader fr = null;
        try {
            fw = new FileWriter("copy.txt");
            fr = new FileReader("demo.txt");
            //创建一个临时容器 大小最好为1024 或1024 的倍数
            char[] buff = new char[BUFFER_SIZE];
            int len = 0;
            while ((len = fr.read(buff)) != -1) {
                fw.write(buff, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();

        } finally {

            //此处要分开判断fw 和 fr 是否为null && 和 || 来判断都不对!!!
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
