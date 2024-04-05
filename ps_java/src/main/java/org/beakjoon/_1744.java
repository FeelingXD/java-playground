package org.beakjoon;

import java.util.*;
import java.util.stream.Collectors;
//수 묶기
public class _1744 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        var answer = 0;

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(input.nextInt());
        }
        Collections.sort(numbers);

        Deque<Integer> positiveNumber = numbers.stream()
                .filter(v -> v > 0)
                .collect(Collectors.toCollection(ArrayDeque::new));
        Deque<Integer> zeroNumber = numbers.stream()
                .filter(v -> v == 0)
                .collect(Collectors.toCollection(ArrayDeque::new));
        Deque<Integer> negativeNumber = numbers.stream()
                .filter(v -> v < 0)
                .collect(Collectors.toCollection(ArrayDeque::new));
        // 음수 연산
        while (negativeNumber.size() > 1) {
            var a = negativeNumber.poll();
            var b = negativeNumber.poll();
            answer+=a*b;
        }

        if (!negativeNumber.isEmpty()){ //수가 비어있지 않을경우
            answer = zeroNumber.isEmpty() ? answer+negativeNumber.poll() :answer;
        }

        while(positiveNumber.size()>1){ // 양수인경우
            var a= positiveNumber.pollLast();
            var b=positiveNumber.pollLast();
            answer= Math.max(answer+a+b,answer+(a*b));
        }
        if (!positiveNumber.isEmpty()){
            answer+=positiveNumber.poll();
        }
        System.out.println(answer);
    }
}
