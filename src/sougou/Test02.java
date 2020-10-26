package sougou;

import leecode.两数之和.Solution;

import java.util.Arrays;

/**
 * @Author: XF-DD
 * @Date: 20/09/25 19:12
 */
public class Test02 {
    /** 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 返回一行字符串，表示原文。
     * @param s1 string字符串一维数组 N*N的01矩阵，表示解密纸，0表示透明，1表示涂黑
     * @param s2 string字符串一维数组 字符矩阵，表示密文
     * @return string字符串
     */
    public String rotatePassword (String[] s1, String[] s2) {
        // write code here
        int[][] data = new int[s1.length][];
        for (int i = 0; i < s1.length; i++) {
            int[] ints = new int[s1.length];
            for (int j = 0; j < s1.length; j++) {
                ints[j] = s1[i].charAt(j) - 48;
            }
            data[i] = ints;
        }
        StringBuilder builder = new StringBuilder("");
        for (int i = 0; i < 4; i++) {
            append(builder,s2,data);
            turn(data);
        }
        return builder.toString();
    }

    private void append(StringBuilder builder,String[] s2,int[][] data){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if(data[i][j] == 0){
                    builder.append(s2[i].charAt(j));
                }
            }

        }
    }


    private  void turn(int[][] data){
        for (int i = 0; i < data.length; i++) {
            for (int j = i+1; j < data.length; j++) {
                int temp = data[i][j];
                data[i][j] = data[j][i];
                data[j][i] = temp;
            }
        }

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length/2; j++) {
                int temp = data[i][j];
                data[i][j] = data[i][data.length-1-j];
                data[i][data.length-1-j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Test02 test02 = new Test02();
        String[] s1 = {"1101","1010","1111","1110"};
        String[] s2 = {"ABCD","EFGH","IJKL","MNPQ"};
        System.out.println(test02.rotatePassword(s1, s2));
    }
}
