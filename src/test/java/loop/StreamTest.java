package loop;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

@Slf4j
public class StreamTest {

    @Test
    void performance_loop_vs_stream(){
    //given
        // nomal range case
        var start_time=System.currentTimeMillis();
        var testSize=50_000_000;

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
        log.info(String.valueOf(System.currentTimeMillis()-start_time));

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
}
