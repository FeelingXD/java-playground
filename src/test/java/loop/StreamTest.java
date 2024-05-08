package loop;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;

@Slf4j
public class StreamTest {

    @Test
    @DisplayName("primitive 타입")
    void performance_loop_vs_stream(){
    //given
        // nomal range case
        log.info("## Range case ## ");
        var start_time=System.currentTimeMillis();
        var testSize=1_000_000_000; // 1억

        long sum=0;
        for (int i = 0; i < testSize; i++) {
            sum+=i;
        }
        log.info(String.valueOf(sum));
        log.info(String.format("for-loop duration: %d",System.currentTimeMillis()-start_time));

        // IntStream case
        start_time=System.currentTimeMillis();
        log.info(String.valueOf(LongStream.range(0,testSize).sum()));

        log.info(String.format("intStream duration: %d",System.currentTimeMillis()-start_time));

        // array case

        log.info("## array Case ##");
        var num_array= new int[testSize];

        for(int i=0 ;i<num_array.length;i++){
            num_array[i]=i+1;
        }
        // performance for-loop
        start_time=System.currentTimeMillis();

        sum=0;
        for (int i=0;i<num_array.length;i++){
            sum+=num_array[i];
        }
        log.info(String.valueOf(sum));
        log.info(String.valueOf(String.format("for loop performance %d",System.currentTimeMillis()-start_time)));

        // performance ArrayStream
        start_time=System.currentTimeMillis();
        log.info(String.valueOf(Arrays.stream(num_array).asLongStream().sum()));
        log.info(String.format("ArrayStream duration : %d",System.currentTimeMillis()-start_time));

        //for-each
        start_time=System.currentTimeMillis();
        sum=0;
        for(int i:num_array){
            sum+=i;
        }

        log.info(String.format("for each(enhanced for-loop) duration :%d" , System.currentTimeMillis()-start_time));
    }
    @Test
    @DisplayName("Wrapper 타입")
    void case_box_type(){

        log.info("box type performance test");
        //for loop
        List<Integer> numbers=new ArrayList<>();
        var test_size= 100_000_000; // OOM 문제로 케이스는 1억 최대

        for(int i=0;i<test_size;i++){
            numbers.add(i);
        }

        var start_time= System.currentTimeMillis();
        long sum=0;
        for(int i=0;i<numbers.size();i++){
            sum+= numbers.get(i);
        }
        log.info(String.format("for loop (box) duration :%d", System.currentTimeMillis()-start_time));

        //Stream
        start_time =System.currentTimeMillis();
        sum=numbers.stream().reduce(Integer::sum).get();
        log.info(String.format("Stream duration :%d", System.currentTimeMillis()-start_time));

        //Stream Parallel
        start_time =System.currentTimeMillis();
        sum=numbers.stream().parallel().reduce(Integer::sum).get();
        log.info(String.format("Stream (parallel) duration : %d" , System.currentTimeMillis()-start_time));


    }
    @Test
    @DisplayName("병렬스트림과 스트림")
    void ParallelStreamAndStream(){
        List<Integer> numbers=new ArrayList<>();
        var test_size= 100_000_000; // OOM 문제로 케이스는 1억 최대
        for(int i=0;i<test_size;i++){
            numbers.add(i);
        }
        // 병렬 스트림의 경우
        var start_time =System.currentTimeMillis();
        numbers.parallelStream().reduce(Integer::sum);
        log.info(String.format("parallel stream duration : %d", System.currentTimeMillis()-start_time));

        //일반 스트림
        start_time=System.currentTimeMillis();
        numbers.stream().reduce(Integer::sum);
        log.info(String.format("stream duration :%d", System.currentTimeMillis()-start_time));
    }


}
