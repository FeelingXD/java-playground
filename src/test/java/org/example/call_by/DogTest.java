package org.example.call_by;


import java.util.Collections;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class DogTest {
  @Test
  void call_by_test(){
    //given

    //when
    Dog dog=new Dog("foo");

    log.info("start name is .. :"+dog.getName());
    foo(dog);
    log.info("end name is .. :"+dog.getName());
    dog= new Dog("var");
    log.info("set new dog .. :"+dog.getName());

    //then
  }
  public void foo(Dog dog){
    Dog tmp=new Dog("asdf");
    dog=tmp;
//    dog= new Dog("var2");
    log.info("changed name is.. :"+dog.getName());
  }
  @Test
  void number_test(){
      //given
    Integer a=10;
    Integer b=20;
      //when
    System.out.printf("%d %d",a,b);
    swap_number(a,b);
    System.out.printf("%d %d",a,b);
      //then
  }
  void swap_number(Integer a,Integer b){
    Integer tmp = a;
    Integer n_a= 20;
    Integer n_b= 10;
    a=n_a;
    b=n_b;
  }

}