package org.beakjoon;

import java.util.Scanner;
// 다음소수
public class _4134 {
    static int MAX_RANGE= (int) (4*Math.pow(10,9));
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int testCase = input.nextInt();
        for (int i=0;i<testCase;i++){
            System.out.println(findPrimeNum(input.nextLong()));
        }

    }
    public static long findPrimeNum(long n){
        for (long i=n;;i++){
            if (isPrime(i))
                return i;
        }
    }
    public static boolean isPrime(long n){
        if (n<=1){
            return false;
        }
        else if(n==2 || n==3){
            return true;
        }
        for(long i = 2; (long) i *i<=n; i++){
            if (n%i==0)
                return false;
        }
        return true;
    }
}
