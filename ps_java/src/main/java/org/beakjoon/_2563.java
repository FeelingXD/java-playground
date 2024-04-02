package org.beakjoon;

import java.util.Arrays;
import java.util.Scanner;
//색종이
public class _2563 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        int[][] board=new int[101][101];
        var answer=0;
        int tese_case= sc.nextInt();
        for(int i=0;i<tese_case;i++){
            int cy= sc.nextInt();
            int cx= sc.nextInt();

            for (int y=cy;y<cy+10;y++ ){
                for (int x=cx;x<cx+10;x++){
                    board[y][x]++;
                }
            }
        }

        //cal
        for(int[] line:board){
            answer+= (int) Arrays.stream(line).filter(value -> value!=0).count();
        }
        System.out.println(answer);

    }
}
