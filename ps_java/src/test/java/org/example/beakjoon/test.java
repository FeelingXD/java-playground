package org.example.beakjoon;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class test {
    @Test
    void test(){
        //given
        int[] testArr={0,0,0,1,1,1,2,2,2,2};
        //when
        var res=Arrays.stream(testArr).filter(value -> value!=0).count();
        System.out.println(res);
        //then
    }
}
