package org.example.equals_and_hashcode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

class IDCardTest {
  @Test
  void equals_test(){
      //given
      IDCard a_card=new IDCard("지민");
      IDCard b_card=new IDCard("지민");
      //when
      assertEquals(a_card,b_card);
      //then
  }
  @Test
  void equals_noHashcode(){
      //given
    IDCard a_card=new IDCard("지민");
    IDCard b_card=new IDCard("지민");
      //when
    Set<IDCard> card_set=new HashSet<>();
    card_set.add(a_card);
    card_set.add(b_card);
    System.out.println(String.format("a_card : %d  b_card : %d",a_card.hashCode(),b_card.hashCode()));
    assertEquals(a_card,b_card);
    assertEquals(1,card_set.size());
      //then
  }
  @Test
  void equalsAndHashCode(){
    IDCard2 a_card=  new IDCard2("지민");
    IDCard2 b_card=  new IDCard2("지민");
    //when
    Set<IDCard2> card_set=new HashSet<>();
    card_set.add(a_card);
    card_set.add(b_card);
    System.out.println(String.format("a_card : %d  b_card : %d",a_card.hashCode(),b_card.hashCode()));
    assertEquals(a_card,b_card);
    assertEquals(1,card_set.size());
  }
}