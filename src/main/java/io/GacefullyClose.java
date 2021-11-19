package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 该文档介绍如何优雅关闭IO流。
 *
 *
 * @author luojun
 * @create 2021-11-19 21:25
 */
public class GacefullyClose {
    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream(new File("D:\\bigdata\\0.luojun\\2.workspaces\\goodcode\\input\\io_test.txt"))){
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
