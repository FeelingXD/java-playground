package basic.prime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class primeTest {
    @Test
    void test(){
        //given
        Assertions.assertFalse(is_prime(1));
        //when
        Assertions.assertTrue(is_prime(2));
        //then
    }

    boolean is_prime(long n){
        if (n<=1)
            return false;
        else if (n==2 ||n==3)
            return true;
        else{
            for (int i = 3; (long) i *i<=n; i++){
                if ((n%i)==0){
                    return false;
                }
            }
            return true;
        }
    }
}
