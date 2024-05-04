package loop;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

@Slf4j
public class Performance1 {

    @Test
    void performanc_loop_vs_stream(){
    //given
        // nomal range case
        var start_time=System.currentTimeMillis();
        var testSize=1_000_000_000;

        var sum=0;
        for (int i = 0; i < testSize; i++) {
            sum+=i;
        }

        log.info("for-loop duration: ",System.currentTimeMillis()-start_time);

        // IntStream case
        start_time=System.currentTimeMillis();

        IntStream.range(1,testSize).sum();

        log.info("intStream duration: ",System.currentTimeMillis()-start_time);

        // array case
        var num_array= new int[testSize];

        for(int i=0 ;i<num_array.length;i++){
            num_array[i]=i+1;
        }





    //when

    //then

    }
}
