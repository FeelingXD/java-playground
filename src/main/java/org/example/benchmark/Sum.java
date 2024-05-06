package org.example.benchmark;

import java.util.stream.IntStream;

public class Sum {
    static final int test_size =100_000_000;
    public static long forSum(){// for 루프를 사용 한 sum
        long var  = 0;
        for (int i=1;i<test_size;i++){
            var+=i;
        }
        return var;
    }

    public static long streamSum(){
        return IntStream.rangeClosed(0,test_size).sum();
    }
}
