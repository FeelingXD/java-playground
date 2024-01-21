package org.example;
import org.junit.jupiter.api.Test;

public class enumtest {


  @Test
  public void day(){
      //given
    System.out.println(Day.TUESDAY.name);
    Day.TUESDAY.setName("잘못된사용");
    System.out.println(Day.TUESDAY.name);
      //when
      //then
  }
}
