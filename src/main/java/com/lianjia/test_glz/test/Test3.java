package com.lianjia.test_glz.test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @Author: guiliangzhou
 * @Description:
 * @Date: Created in 下午7:03 2018/1/24
 * @Modified By:
 */
public class Test3 {
        public static void getData(String path) {
            try {
                //获取图像资源，转成BufferedImage对象
                BufferedImage bimg = ImageIO.read(new File(path));
                //创建一个二维数组，用来存放图像每一个像素位置的颜色值
                int[][] data = new int[bimg.getWidth()][bimg.getHeight()];
                //以高度为范围，逐列扫描图像，存进数组对应位置
                for (int i = 0; i < bimg.getWidth(); i++) {
                    for (int j = 0; j < bimg.getHeight(); j++) {
                        data[i][j] = bimg.getRGB(i, j);//得到的是sRGB值，4字节
                    }
                }
                //将数组旋转90°输出，实现逐行输出图像
                for (int i = 0; i < bimg.getHeight(); i++) {
                    for (int j = 0; j < bimg.getWidth(); j++) {
                        if (data[j][i] != -1) {//有颜色输出
                            System.out.print("**");
                        } else {            //无颜色输出
                            System.out.print("  ");
                        }
                    }
                    System.out.println();//每行结束换行
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static void main(String[] args) {
            getData("/Users/guiliangzhou/Downloads/image1.jpg");//读取图像资源
        }
}
