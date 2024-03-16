package org.example.collections;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.*;

@Slf4j
public class ColletionsTest {
    @Test
    void java_version_test(){
        //given
        log.warn(System.getProperty("java.version"));
        //when

        //then
    }

    @Test
    void test() {
        var actionPop=false;
        //given
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        //when
        while (!stack.isEmpty() && actionPop) {
            log.warn(String.valueOf(stack.pop()));
        }

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        while (!stack2.isEmpty()&&actionPop){
            log.warn(stack2.pop().toString());
        }
        var list = new ArrayList<>(stack);
        log.warn(list.toString());

        var list2 = new ArrayList<>(stack2);
        log.warn(list2.toString());

        // check typecast



        //then
    }
}
