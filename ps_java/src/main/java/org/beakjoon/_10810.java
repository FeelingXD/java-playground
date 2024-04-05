package org.beakjoon;

import java.util.Arrays;
import java.util.Scanner;
//공 넣기
public class _10810 {
    public static void main(String[] args) {
        // n,m 바구니수, 바꾸기
        Scanner input = new Scanner(System.in);
        var n = input.nextInt();
        var m = input.nextInt();
        int[] basket = new int[n];

        for (int i = 0; i < m; i++) {
            var str =input.nextInt();
            var end =input.nextInt();
            var ball =input.nextInt();

            for (int j=str;j<=end;j++){
                basket[j-1]=ball;
            }
        }

        System.out.println(String.join(" ",Arrays.toString(basket).substring(1,Arrays.toString(basket).length()-1).split(", ")));

    }
}
