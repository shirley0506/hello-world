package com.xqq.java;

import java.util.Scanner;

/**
 * @Title: Even_or_Uneven
 * @Description:
 * @Auther: Shirley
 * @Version: 1.0
 * @create 2018/10/31 18:08
 */
public class Even_or_Uneven {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数：");
      //  try {
            int zhengshu = input.nextInt();
            if (zhengshu % 2 == 0){
                System.out.println("您输入的" + zhengshu + "是一个偶数！");
            }
            else {
                System.out.println("您输入的" + zhengshu + "是一个寄数！");
            }
      //  }
        /*
        catch (Exception e) {
            System.out.println("您输入有误！");
            Test();
        }
        */
    }
}
