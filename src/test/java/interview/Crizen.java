package interview;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Slf4j
public class Crizen {
    @Test
    @DisplayName("대문자로 바꾸기")
    void uppercase(){
        //given
        String test="test";
        var res = new StringBuilder();
        for(char c:test.toCharArray()){
            res.append((char)(c-32));
        }
        log.info(res.toString());
        log.info(test
                .chars()
                .mapToObj(c->String.valueOf((char)(c-32)))
                .collect(Collectors.joining())
        );
        //when
        //then
    }
    @Test
    @DisplayName("중복되지않은 원소 출력하기")
    void test_not_duplicated(){
        //given
        int[] nums={1,1,2,2,2,3,4,5,10,99};
        HashMap<Integer,Boolean> checked=new HashMap<>();
        //when
        for (int num:nums){
            if (checked.getOrDefault(num,false)){
                continue;
            }
            checked.put(num,true);
            System.out.print(num+",");
        }
        //then
        LinkedHashSet<Integer> checked2 = new LinkedHashSet<>();
        for (int num:nums){
            checked2.add(num);
        }
        System.out.println();
        for (Iterator<Integer> it = checked2.iterator(); it.hasNext(); ) {
            Integer num = it.next();
            System.out.print(num);

            if (it.hasNext()){
                System.out.print(",");
            }
        }
    }
    @Test
    @DisplayName("제일 큰수")
    void find_biggest_number(){
        //given
        int[] nums={1,1,2,2,2,3,4,5,10,99};
        //when
        System.out.println(Arrays.stream(nums).max().getAsInt());
        //then
    }
    @Test
    void test(){
        //given

        //when

        //then
    }
}
