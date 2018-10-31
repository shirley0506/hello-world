package com.xqq.java;

/**
 * @Title: Compound
 * @Description:
 * @Auther: Shirley
 * @Version: 1.0
 * @create 2018/10/31 16:58
 */
public class Compound {
    public static void main(String args[]){
        int x = 20;
        {
            int y = 40;
            System.out.println(y);
            int z = 245;
            boolean b;
            {
                b = y > z;
                System.out.println(b);
            }
        }
        String word = "hello java";
        System.out.println(word);
    }

}
