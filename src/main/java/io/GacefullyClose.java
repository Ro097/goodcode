package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 该文档介绍如何优雅关闭IO流。
 *
 * @author luojun
 * @create 2021-11-19 21:25
 */
public class GacefullyClose {
    public static void main(String[] args) {
        // TODO: 2021/11/19
        /*
        try-with-resource 语句能确保每个资源在语句结束时关闭。所用实现了
        java.lang.AutoCloseable接口（其中它包括实习了java.io.Closeable的所有对象）
         */

        try (FileInputStream in = new FileInputStream(new File("input"+ File.separator+"io_test.txt"))){
            byte[] b = new byte[1025];
            int line = 0;
            while ((line = in.read(b)) != -1) {
                System.out.println(new String(b,0,line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
