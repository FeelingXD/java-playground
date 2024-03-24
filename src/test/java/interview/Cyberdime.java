package interview;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Slf4j
public class Cyberdime {
    // 사이버다임 인터뷰 테스트
    @Test
    @DisplayName("클래스의 초기화")
    void classinit(){
        //given
        class Main{

            public static String aValue = "";
            public String bValue = "";

            static{
                aValue+='a';
            }
            {
                aValue+='b';
                bValue+='b';
            }
            public Main(){
                aValue+='d';
                bValue+='d';
            }
            public void main(String[] args){
                Main main=new Main();
                main.append();
                System.out.println(main.aValue);
                System.out.println(main.bValue);

            }

            public void append(){
                this.aValue+='c';
                this.bValue+='c';
            }
        }
        Main main=new Main();
        main.main(new String[]{"", ""});
        //when

        //then
    }
    @Test
    @DisplayName("예외 처리")
    void exception_test(){
        //given
        exception_seq1();
        exception_seq2();
//        exception_seq3();
        exception_seq4();
        //when

        //then
    }
    @Test
    @DisplayName("소수의 합 ~1000까지")
    void sum_prime_number(){
        //given
        var ans =0;
        for(int i=1;i<=1000;i++){
            if (isPrime(i))
                ans+=i;
        }
        log.info(String.valueOf(ans));
        //when

        //then
    }
    public boolean isPrime(int n){
        if (n==1)
            return false;
        for(int i=2;i<n;i++){
            if (n%i==0)
                return false;
        }
        return true;
    }
    void exception_seq1(){
        log.info("seq1");
        try{// case 1
            log.info("try");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    void exception_seq2(){ // try 쓰루시
        log.info("seq2");
        try{//case2
            log.info("try");
            throw new RuntimeException();
        }catch (Exception e){
            log.info("catch");
            e.printStackTrace();
        }finally{
            log.info("finally");
        }
    }
    void exception_seq3(){
        log.info("seq3");
        try{// case3
            log.info("try");
            throw new RuntimeException();
        }catch (Exception e){
            log.info("catch");
            throw new RuntimeException();
        }finally{
            log.info("finally");
        }
    }
    void exception_seq4(){
        log.info("seq4");
        try{// case4
            log.info("try");
        }catch (Exception e){
            log.info("catch");
            e.printStackTrace();
        }finally{
            log.info("finally");
            throw new RuntimeException();
        }
    }
}
