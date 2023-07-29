import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class StringTest {
  @Test
  void SBtest(){
      //given
    SbTest sbTest=new SbTest();
    Thread thread1=new Thread(sbTest,"Thread1");
    Thread thread2=new Thread(sbTest,"Thread2");

    thread1.start();
    thread2.start();

    try{
      thread1.join();
      thread2.join();
    }catch (Exception e){
      e.printStackTrace();
    }
    System.out.println(String.format("length : %d",sbTest.sb.length()));
    System.out.println(sbTest.sb.toString());
      //when
      //then
  }
}
class SbTest implements Runnable{
  final StringBuffer sb=new StringBuffer();
  @Override
  public void run() {
    addChar();
  }
  public synchronized void  addChar(){
    for (int i=0;i<1000;i++){
      sb.append("1");
      sb.append("0");
    }
  }
}
