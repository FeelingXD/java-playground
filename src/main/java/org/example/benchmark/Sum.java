package org.example.benchmark;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;


public class Sum {
    static final int test_size =100_000_000_0; // 테스트 사이즈 10 억
    static int[] intArray = new int[test_size/10];  // 자바 힙사이즈 문제로인한 테스트 사이즈는 1억
    static List<Integer> intArrayList = new ArrayList<>();
    {
        for(int i=0;i<intArray.length;i++){
            intArray[i]=i+1;
            intArrayList.add(i);
        }
    }

    public static long forSum(){// for 루프를 사용 한 sum
        long var  = 0;
        for (int i=1;i<test_size;i++){
            var+=i;
        }
        return var;
    }

    public static long streamSum(){
        return LongStream.rangeClosed(0,test_size).sum();
    }

    public static long parallelStreamSum(){
        return LongStream.rangeClosed(0,test_size).parallel().sum();
    }

    public static long arrayForSum(){
        long res=0;
        for (int i=0;i<intArray.length;i++){
            res+=intArray[i];
        }
        return  res;
    }

    public static long arrayStreamSum(){
        return Arrays.stream(intArray).asLongStream().sum();
    }
    public static long arrayParallelStreamSum(){
        return Arrays.stream(intArray).parallel().asLongStream().sum();
    }
    public static long arrayListForSum(){
        long res=0;
        for (int i=0;i<intArrayList.size();i++){
            res+= intArrayList.get(i);
        }
        return res;
    }
    public static long arrayListStreamSum(){
        return intArrayList.stream().reduce(0,Integer::sum);
    }

}
