//바구니 뒤집기
package org.beakjoon;

import java.util.Arrays;
import java.util.Scanner;


public class _10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=i+1;
        }
        for(int i=0 ;i<m;i++){
            int s=sc.nextInt();
            int e=sc.nextInt();
            //보정
            e-=1;
            s-=1;
            for (int j=0;j<=(e-s)/2;j++){
                var tmp =arr[e-j];
                arr[e-j]=arr[s+j];
                arr[s+j]=tmp;
            }
        }
        System.out.println(Arrays.toString(arr).substring(1, Arrays.toString(arr).length()-1).replace(", "," "));


    }
}
