package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author luojun
 * @create 2021-11-19 21:41
 */
public class Close {
    public static void main(String[] args) {
        FileInputStream in = null;
        try {
            in = new FileInputStream(new File("D:\\bigdata\\0.luojun\\2.workspaces\\goodcode\\input\\io_test.txt"));
            byte[] bytes = new byte[1024];
            int line =0;

            // TODO: 2021/11/19 笔记1
            /*read(byte[] b) 方法本次读取到b.size的字节个数，且将读取到的字节存储在b中。下次接续读取b.size的字节
            个数.直至到达文件尾部返回-1。
             */

            while((line = in.read(bytes)) != -1){

                // TODO: 2021/11/19 笔记2
                /*
                public String(byte[] bytes, int offset, int length)
                  bytes：要解码为字符的 byte
                  offset： 要解码的第一个 byte 的索引
                  length： 要解码的 byte 数 的长度
                 */
                System.out.println(new String(bytes,0,line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null){
                try {
                    // TODO: 2021/11/19 笔记3
                    /*
                    关闭IO时可能发生异常。故用try{}catch(){}代码块
                     */
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
